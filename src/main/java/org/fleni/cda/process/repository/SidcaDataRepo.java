package org.fleni.cda.process.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.fleni.cda.process.dto.ProcessReportTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sescudero
 *
 */
@Repository
public class SidcaDataRepo implements ISidcaDataRepo {
	
	/**
	 * 
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.process.repository.ISidcaDataRepo#selectAllProcessReportType(java.lang.String)
	 */
	@Override
	public List<ProcessReportTypeDTO> selectAllProcessReportType(String query) {
		List<ProcessReportTypeDTO> l = null;
		l = jdbcTemplate.query(query, new ProcessReportTypeRowMapper());
		return l;
	}

	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.process.repository.ISidcaDataRepo#selectRobjectId(java.lang.String)
	 */
	@Override
	public List<String> selectRobjectId(String query) {
		List<String> l = null;
		l = jdbcTemplate.query(new StreamingStatementCreator(query), new StringRowMapper());
		return l;
	}

	/**
	 * 
	 * @author sescudero
	 *
	 */
	private static final class ProcessReportTypeRowMapper implements RowMapper<ProcessReportTypeDTO> {
		/*
		 * (non-Javadoc)
		 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
		 */
		@Override
		public ProcessReportTypeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			ProcessReportTypeDTO c = new ProcessReportTypeDTO();
			c.setCode(rs.getString(0));
			c.setDescription(rs.getString(1));
			c.setManagerClass(rs.getString(2));
			c.setQuery(rs.getString(3));
			return c;
		}
	}

	/**
	 * 
	 * @author sescudero
	 *
	 */
	private static final class StringRowMapper implements RowMapper<String> {
		/*
		 * (non-Javadoc)
		 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
		 */
		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			String c = rs.getString(1);
			return c;
		}
	}

	/**
	 * 
	 * @author sescudero
	 *
	 */
	private static final class StreamingStatementCreator implements PreparedStatementCreator {

		/**
		 * 
		 */
		private final String query;

		/**
		 * 
		 */
		public StreamingStatementCreator(String query) {
			this.query = query;
		}

		/*
		 * (non-Javadoc)
		 * @see org.springframework.jdbc.core.PreparedStatementCreator#createPreparedStatement(java.sql.Connection)
		 */
		@Override
		public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
			final PreparedStatement statement = connection.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			statement.setFetchSize(1000);
			return statement;
		}

	}
}
