//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 05:31:26 PM EDT 
//


package gov.ca.emsa.transactions.patientDiscovery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Homeless.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Homeless">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HL"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Homeless")
@XmlEnum
public enum Homeless {

    HL,
    M,
    T;

    public String value() {
        return name();
    }

    public static Homeless fromValue(String v) {
        return valueOf(v);
    }

}
