
package org.fleni.cda.externalreport.remoting.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para externalReportInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="externalReportInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="episodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="messageJsonData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="nhc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportOriginalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeEpisode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalReportInformation", propOrder = {
    "episodeNumber",
    "firstTime",
    "messageJsonData",
    "nhc",
    "reportDate",
    "reportId",
    "reportName",
    "reportOriginalId",
    "typeEpisode",
    "version"
})
public class ExternalReportInformation {

    protected String episodeNumber;
    protected boolean firstTime;
    protected byte[] messageJsonData;
    protected String nhc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDate;
    protected String reportId;
    protected String reportName;
    protected String reportOriginalId;
    protected String typeEpisode;
    protected Long version;

    /**
     * Obtiene el valor de la propiedad episodeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     * Define el valor de la propiedad episodeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpisodeNumber(String value) {
        this.episodeNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad firstTime.
     * 
     */
    public boolean isFirstTime() {
        return firstTime;
    }

    /**
     * Define el valor de la propiedad firstTime.
     * 
     */
    public void setFirstTime(boolean value) {
        this.firstTime = value;
    }

    /**
     * Obtiene el valor de la propiedad messageJsonData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessageJsonData() {
        return messageJsonData;
    }

    /**
     * Define el valor de la propiedad messageJsonData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessageJsonData(byte[] value) {
        this.messageJsonData = value;
    }

    /**
     * Obtiene el valor de la propiedad nhc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNhc() {
        return nhc;
    }

    /**
     * Define el valor de la propiedad nhc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNhc(String value) {
        this.nhc = value;
    }

    /**
     * Obtiene el valor de la propiedad reportDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Define el valor de la propiedad reportDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
    }

    /**
     * Obtiene el valor de la propiedad reportId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Define el valor de la propiedad reportId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Obtiene el valor de la propiedad reportName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Define el valor de la propiedad reportName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Obtiene el valor de la propiedad reportOriginalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportOriginalId() {
        return reportOriginalId;
    }

    /**
     * Define el valor de la propiedad reportOriginalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportOriginalId(String value) {
        this.reportOriginalId = value;
    }

    /**
     * Obtiene el valor de la propiedad typeEpisode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEpisode() {
        return typeEpisode;
    }

    /**
     * Define el valor de la propiedad typeEpisode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEpisode(String value) {
        this.typeEpisode = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
