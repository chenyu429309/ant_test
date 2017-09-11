
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mcount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workid",
    "deptid",
    "mcount",
    "sendDate"
})
@XmlRootElement(name = "Sms_Log")
public class SmsLog {

    protected String workid;
    protected String deptid;
    @XmlElement(name = "Mcount")
    protected int mcount;
    @XmlElement(name = "SendDate", required = true)
    protected XMLGregorianCalendar sendDate;

    /**
     * Gets the value of the workid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkid() {
        return workid;
    }

    /**
     * Sets the value of the workid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkid(String value) {
        this.workid = value;
    }

    /**
     * Gets the value of the deptid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * Sets the value of the deptid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptid(String value) {
        this.deptid = value;
    }

    /**
     * Gets the value of the mcount property.
     * 
     */
    public int getMcount() {
        return mcount;
    }

    /**
     * Sets the value of the mcount property.
     * 
     */
    public void setMcount(int value) {
        this.mcount = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

}
