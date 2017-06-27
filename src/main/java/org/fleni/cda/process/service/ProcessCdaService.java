package org.fleni.cda.process.service;

import java.util.List;

import org.fleni.cda.process.dto.ProcessReportTypeDTO;
import org.fleni.cda.process.manager.IDataManager;
import org.fleni.cda.process.manager.DataManagerFactory;
import org.fleni.cda.process.repository.ISidcaDataRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 
 * @author sescudero
 *
 */
@Service("processCdaService")
public class ProcessCdaService implements IProcessCdaService {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(ProcessCdaService.class);

	/**
	 * 
	 */
	@Autowired
	private ISidcaDataRepo repository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.fleni.cda.process.service.IProcessCda#processCda()
	 */
	@Override
	@Async("executor")
	public void processCda() {
		DataManagerFactory factory = new DataManagerFactory();
		List<ProcessReportTypeDTO> lst = repository.selectAllProcessReportType(null);
		for (ProcessReportTypeDTO dto : lst) {
			List<String> lstIDs = repository.selectRobjectId(dto.getQuery());
			IDataManager manager = factory.getManager(dto.getManagerClass());
			manager.processDataAndSend(lstIDs,1000);
		}
	}
}
