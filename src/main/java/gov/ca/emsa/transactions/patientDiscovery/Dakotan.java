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
 * <p>Java class for Dakotan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dakotan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-ASB"/>
 *     &lt;enumeration value="x-DHG"/>
 *     &lt;enumeration value="x-LKT"/>
 *     &lt;enumeration value="x-NKT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dakotan")
@XmlEnum
public enum Dakotan {

    @XmlEnumValue("x-ASB")
    X_ASB("x-ASB"),
    @XmlEnumValue("x-DHG")
    X_DHG("x-DHG"),
    @XmlEnumValue("x-LKT")
    X_LKT("x-LKT"),
    @XmlEnumValue("x-NKT")
    X_NKT("x-NKT");
    private final String value;

    Dakotan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dakotan fromValue(String v) {
        for (Dakotan c: Dakotan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
