package org.fleni.cda.cxf.client;

import java.util.List;

import org.fleni.cda.externalreport.remoting.server.ExternalReportInformation;
import org.fleni.cda.externalreport.remoting.server.ExternalReportInformationBatch;
import org.fleni.cda.externalreport.remoting.server.IExternalReportRemotingService;
import org.fleni.cda.externalreport.remoting.server.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 
 * @author sescudero
 *
 */
@Component
public class ExternalReportRemotingServiceClient {
	/**
	 * 
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalReportRemotingServiceClient.class);
	
	/**
	 * 
	 */
	@Autowired
	private IExternalReportRemotingService proxyRemotingService;
	
	/**
	 * 
	 * @param lst
	 */
	public void sendLstExternalReportInformation(List<ExternalReportInformation> lst) {
		try {
			ObjectFactory factory = new ObjectFactory();
			ExternalReportInformationBatch o = factory.createExternalReportInformationBatch();
			o.getLstExternalReportInformation().addAll(lst);
			proxyRemotingService.createReportInformationBatch(o);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}
}
