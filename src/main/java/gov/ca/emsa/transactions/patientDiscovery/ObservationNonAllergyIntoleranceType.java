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
 * <p>Java class for ObservationNonAllergyIntoleranceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationNonAllergyIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NAINT"/>
 *     &lt;enumeration value="DNAINT"/>
 *     &lt;enumeration value="ENAINT"/>
 *     &lt;enumeration value="FNAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationNonAllergyIntoleranceType")
@XmlEnum
public enum ObservationNonAllergyIntoleranceType {

    NAINT,
    DNAINT,
    ENAINT,
    FNAINT;

    public String value() {
        return name();
    }

    public static ObservationNonAllergyIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
