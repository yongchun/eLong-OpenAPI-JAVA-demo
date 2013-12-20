//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.26 at 02:14:30 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumProductProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumProductProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="LastMinuteSale"/>
 *     &lt;enumeration value="LimitedTimeSale"/>
 *     &lt;enumeration value="WithoutGuarantee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumProductProperty")
@XmlEnum
public enum EnumProductProperty {

    @XmlEnumValue("All")
    All("All"),
    @XmlEnumValue("LastMinuteSale")
    LastMinuteSale("LastMinuteSale"),
    @XmlEnumValue("LimitedTimeSale")
    LimitedTimeSale("LimitedTimeSale"),
    @XmlEnumValue("WithoutGuarantee")
    WithoutGuarantee("WithoutGuarantee");
    private final String value;

    EnumProductProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumProductProperty fromValue(String v) {
        for (EnumProductProperty c: EnumProductProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}