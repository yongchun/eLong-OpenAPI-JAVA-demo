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
 * <p>Java class for EnumPrepayChangeRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPrepayChangeRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PrepayNoChange"/>
 *     &lt;enumeration value="PrepayNeedSomeDay"/>
 *     &lt;enumeration value="PrepayNeedOneTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPrepayChangeRule")
@XmlEnum
public enum EnumPrepayChangeRule {

    @XmlEnumValue("PrepayNoChange")
    PrepayNoChange("PrepayNoChange"),
    @XmlEnumValue("PrepayNeedSomeDay")
    PrepayNeedSomeDay("PrepayNeedSomeDay"),
    @XmlEnumValue("PrepayNeedOneTime")
    PrepayNeedOneTime("PrepayNeedOneTime");
    private final String value;

    EnumPrepayChangeRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPrepayChangeRule fromValue(String v) {
        for (EnumPrepayChangeRule c: EnumPrepayChangeRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}