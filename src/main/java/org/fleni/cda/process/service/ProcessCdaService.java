package org.fleni.cda.process.service;

import org.fleni.cda.cxf.client.ExternalReportRemotingServiceClient;
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
	private ExternalReportRemotingServiceClient soapClient;
	
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
	public void processCda(){
		
	}
	/**
	 * 
	 * @return
	 * @throws InterruptedException
	 */
//	private String retrieveResponse() throws InterruptedException {
//		String resp = "Se estan procesando los cda de Sidca!!!";
//		logger.info("Looking up ");
//		Thread.sleep(10000L);
//		logger.info("Finish Looking up ");
//		return resp;
//	}
}
