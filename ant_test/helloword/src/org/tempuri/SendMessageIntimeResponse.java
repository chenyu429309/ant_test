
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
 *         &lt;element name="SendMessageIntimeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sendMessageIntimeResult"
})
@XmlRootElement(name = "SendMessageIntimeResponse")
public class SendMessageIntimeResponse {

    @XmlElement(name = "SendMessageIntimeResult")
    protected int sendMessageIntimeResult;

    /**
     * Gets the value of the sendMessageIntimeResult property.
     * 
     */
    public int getSendMessageIntimeResult() {
        return sendMessageIntimeResult;
    }

    /**
     * Sets the value of the sendMessageIntimeResult property.
     * 
     */
    public void setSendMessageIntimeResult(int value) {
        this.sendMessageIntimeResult = value;
    }

}
