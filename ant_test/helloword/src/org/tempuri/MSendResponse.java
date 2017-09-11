
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="MSendResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mSendResult"
})
@XmlRootElement(name = "MSendResponse")
public class MSendResponse {

    @XmlElement(name = "MSendResult")
    protected int mSendResult;

    /**
     * Gets the value of the mSendResult property.
     * 
     */
    public int getMSendResult() {
        return mSendResult;
    }

    /**
     * Sets the value of the mSendResult property.
     * 
     */
    public void setMSendResult(int value) {
        this.mSendResult = value;
    }

}
