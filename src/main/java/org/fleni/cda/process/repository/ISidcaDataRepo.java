package org.fleni.cda.process.repository;

import java.util.List;

import org.fleni.cda.process.dto.ProcessReportTypeDTO;
/**
 * 
 * @author sescudero
 *
 */
public interface ISidcaDataRepo {
	
	/**
	 * 
	 * @return
	 */
	List<ProcessReportTypeDTO> selectAllProcessReportType(String query);
	
	/**
	 * 
	 * @return
	 */
	List<String> selectRobjectId(String query);
}
