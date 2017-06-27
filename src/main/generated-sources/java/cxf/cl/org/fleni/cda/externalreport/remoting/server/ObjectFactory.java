
package org.fleni.cda.externalreport.remoting.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.fleni.cda.externalreport.remoting.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExternalReportInformation_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "externalReportInformation");
    private final static QName _ExternalReportInformationBatch_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "externalReportInformationBatch");
    private final static QName _ExternalReportResponse_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "externalReportResponse");
    private final static QName _CreateReportInformationBatch_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "createReportInformationBatch");
    private final static QName _CreateReportInformationBatchResponse_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "createReportInformationBatchResponse");
    private final static QName _CreateReportInformation_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "createReportInformation");
    private final static QName _CreateReportInformationResponse_QNAME = new QName("http://server.remoting.externalreport.cda.fleni.org/", "createReportInformationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.fleni.cda.externalreport.remoting.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExternalReportInformation }
     * 
     */
    public ExternalReportInformation createExternalReportInformation() {
        return new ExternalReportInformation();
    }

    /**
     * Create an instance of {@link ExternalReportInformationBatch }
     * 
     */
    public ExternalReportInformationBatch createExternalReportInformationBatch() {
        return new ExternalReportInformationBatch();
    }

    /**
     * Create an instance of {@link ExternalReportResponse }
     * 
     */
    public ExternalReportResponse createExternalReportResponse() {
        return new ExternalReportResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "externalReportInformation")
    public JAXBElement<ExternalReportInformation> createExternalReportInformation(ExternalReportInformation value) {
        return new JAXBElement<ExternalReportInformation>(_ExternalReportInformation_QNAME, ExternalReportInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportInformationBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "externalReportInformationBatch")
    public JAXBElement<ExternalReportInformationBatch> createExternalReportInformationBatch(ExternalReportInformationBatch value) {
        return new JAXBElement<ExternalReportInformationBatch>(_ExternalReportInformationBatch_QNAME, ExternalReportInformationBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "externalReportResponse")
    public JAXBElement<ExternalReportResponse> createExternalReportResponse(ExternalReportResponse value) {
        return new JAXBElement<ExternalReportResponse>(_ExternalReportResponse_QNAME, ExternalReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportInformationBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "createReportInformationBatch")
    public JAXBElement<ExternalReportInformationBatch> createCreateReportInformationBatch(ExternalReportInformationBatch value) {
        return new JAXBElement<ExternalReportInformationBatch>(_CreateReportInformationBatch_QNAME, ExternalReportInformationBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "createReportInformationBatchResponse")
    public JAXBElement<ExternalReportResponse> createCreateReportInformationBatchResponse(ExternalReportResponse value) {
        return new JAXBElement<ExternalReportResponse>(_CreateReportInformationBatchResponse_QNAME, ExternalReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "createReportInformation")
    public JAXBElement<ExternalReportInformation> createCreateReportInformation(ExternalReportInformation value) {
        return new JAXBElement<ExternalReportInformation>(_CreateReportInformation_QNAME, ExternalReportInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "createReportInformationResponse")
    public JAXBElement<ExternalReportResponse> createCreateReportInformationResponse(ExternalReportResponse value) {
        return new JAXBElement<ExternalReportResponse>(_CreateReportInformationResponse_QNAME, ExternalReportResponse.class, null, value);
    }

}
