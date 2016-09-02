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
 * <p>Java class for x_LabSpecimenCollectionProviders.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_LabSpecimenCollectionProviders">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="communityLaboratory"/>
 *     &lt;enumeration value="homeHealth"/>
 *     &lt;enumeration value="laboratory"/>
 *     &lt;enumeration value="pathologist"/>
 *     &lt;enumeration value="phlebotomist"/>
 *     &lt;enumeration value="self"/>
 *     &lt;enumeration value="thirdParty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_LabSpecimenCollectionProviders")
@XmlEnum
public enum XLabSpecimenCollectionProviders {

    @XmlEnumValue("communityLaboratory")
    COMMUNITY_LABORATORY("communityLaboratory"),
    @XmlEnumValue("homeHealth")
    HOME_HEALTH("homeHealth"),
    @XmlEnumValue("laboratory")
    LABORATORY("laboratory"),
    @XmlEnumValue("pathologist")
    PATHOLOGIST("pathologist"),
    @XmlEnumValue("phlebotomist")
    PHLEBOTOMIST("phlebotomist"),
    @XmlEnumValue("self")
    SELF("self"),
    @XmlEnumValue("thirdParty")
    THIRD_PARTY("thirdParty");
    private final String value;

    XLabSpecimenCollectionProviders(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XLabSpecimenCollectionProviders fromValue(String v) {
        for (XLabSpecimenCollectionProviders c: XLabSpecimenCollectionProviders.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
