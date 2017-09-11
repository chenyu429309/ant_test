
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
 *         &lt;element name="PESendResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "peSendResult"
})
@XmlRootElement(name = "PESendResponse")
public class PESendResponse {

    @XmlElement(name = "PESendResult")
    protected int peSendResult;

    /**
     * Gets the value of the peSendResult property.
     * 
     */
    public int getPESendResult() {
        return peSendResult;
    }

    /**
     * Sets the value of the peSendResult property.
     * 
     */
    public void setPESendResult(int value) {
        this.peSendResult = value;
    }

}
