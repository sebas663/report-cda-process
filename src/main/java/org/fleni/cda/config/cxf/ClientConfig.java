package org.fleni.cda.config.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.fleni.cda.externalreport.remoting.server.IExternalReportRemotingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author sescudero
 *
 */
@Configuration
public class ClientConfig {
	/**
	 * 
	 */
	@Value("${service.address}")
    private String serviceAddress;
	/**
	 * 
	 * @return
	 */
    @Bean(name = "proxyRemotingService")
    public IExternalReportRemotingService opportunityPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(IExternalReportRemotingService.class);
        jaxWsProxyFactoryBean.setAddress(serviceAddress);
        return (IExternalReportRemotingService) jaxWsProxyFactoryBean.create();
    }
}
