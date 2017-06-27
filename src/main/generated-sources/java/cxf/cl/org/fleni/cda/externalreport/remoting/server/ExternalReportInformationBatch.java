
package org.fleni.cda.externalreport.remoting.server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para externalReportInformationBatch complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="externalReportInformationBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lstExternalReportInformation" type="{http://server.remoting.externalreport.cda.fleni.org/}externalReportInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalReportInformationBatch", propOrder = {
    "lstExternalReportInformation"
})
public class ExternalReportInformationBatch {

    @XmlElement(nillable = true)
    protected List<ExternalReportInformation> lstExternalReportInformation;

    /**
     * Gets the value of the lstExternalReportInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstExternalReportInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstExternalReportInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReportInformation }
     * 
     * 
     */
    public List<ExternalReportInformation> getLstExternalReportInformation() {
        if (lstExternalReportInformation == null) {
            lstExternalReportInformation = new ArrayList<ExternalReportInformation>();
        }
        return this.lstExternalReportInformation;
    }

}
