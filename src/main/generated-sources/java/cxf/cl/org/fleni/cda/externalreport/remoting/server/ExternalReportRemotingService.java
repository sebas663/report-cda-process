package org.fleni.cda.externalreport.remoting.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-06-27T18:32:06.704-03:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "externalReportRemotingService", 
                  wsdlLocation = "file:/D:/Proyectos/workspace/report-cda-process/src/main/resources/ExternalReportRemotingService.wsdl",
                  targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/") 
public class ExternalReportRemotingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.remoting.externalreport.cda.fleni.org/", "externalReportRemotingService");
    public final static QName ExternalReportRemotingService = new QName("http://server.remoting.externalreport.cda.fleni.org/", "ExternalReportRemotingService");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Proyectos/workspace/report-cda-process/src/main/resources/ExternalReportRemotingService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ExternalReportRemotingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Proyectos/workspace/report-cda-process/src/main/resources/ExternalReportRemotingService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ExternalReportRemotingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ExternalReportRemotingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExternalReportRemotingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ExternalReportRemotingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ExternalReportRemotingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ExternalReportRemotingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IExternalReportRemotingService
     */
    @WebEndpoint(name = "ExternalReportRemotingService")
    public IExternalReportRemotingService getExternalReportRemotingService() {
        return super.getPort(ExternalReportRemotingService, IExternalReportRemotingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IExternalReportRemotingService
     */
    @WebEndpoint(name = "ExternalReportRemotingService")
    public IExternalReportRemotingService getExternalReportRemotingService(WebServiceFeature... features) {
        return super.getPort(ExternalReportRemotingService, IExternalReportRemotingService.class, features);
    }

}
