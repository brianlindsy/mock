//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 05:31:26 PM EDT 
//


package gov.ca.emsa.transactions.patientDiscovery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedReleaseSuspension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedReleaseSuspension">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ERSUSP"/>
 *     &lt;enumeration value="ERSUSP12"/>
 *     &lt;enumeration value="ERSUSP24"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtendedReleaseSuspension")
@XmlEnum
public enum ExtendedReleaseSuspension {

    ERSUSP("ERSUSP"),
    @XmlEnumValue("ERSUSP12")
    ERSUSP_12("ERSUSP12"),
    @XmlEnumValue("ERSUSP24")
    ERSUSP_24("ERSUSP24");
    private final String value;

    ExtendedReleaseSuspension(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedReleaseSuspension fromValue(String v) {
        for (ExtendedReleaseSuspension c: ExtendedReleaseSuspension.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
