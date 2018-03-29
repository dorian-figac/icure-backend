/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * Foobar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 09:24:53 AM CET 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.id.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID-HCPARTYschemes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ID-HCPARTYschemes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ID-HCPARTY"/>
 *     &lt;enumeration value="INSS"/>
 *     &lt;enumeration value="LOCAL"/>
 *     &lt;enumeration value="ID-ENCRYPTION-APPLICATION"/>
 *     &lt;enumeration value="ID-ENCRYPTION-ACTOR"/>
 *     &lt;enumeration value="ID-INSURANCE"/>
 *     &lt;enumeration value="ID-CBE"/>
 *     &lt;enumeration value="ID-EHP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ID-HCPARTYschemes")
@XmlEnum
public enum IDHCPARTYschemes {

    @XmlEnumValue("ID-HCPARTY")
    ID_HCPARTY("ID-HCPARTY"),
    INSS("INSS"),
    LOCAL("LOCAL"),
    @XmlEnumValue("ID-ENCRYPTION-APPLICATION")
    ID_ENCRYPTION_APPLICATION("ID-ENCRYPTION-APPLICATION"),
    @XmlEnumValue("ID-ENCRYPTION-ACTOR")
    ID_ENCRYPTION_ACTOR("ID-ENCRYPTION-ACTOR"),
    @XmlEnumValue("ID-INSURANCE")
    ID_INSURANCE("ID-INSURANCE"),
    @XmlEnumValue("ID-CBE")
    ID_CBE("ID-CBE"),
    @XmlEnumValue("ID-EHP")
    ID_EHP("ID-EHP");
    private final String value;

    IDHCPARTYschemes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IDHCPARTYschemes fromValue(String v) {
        for (IDHCPARTYschemes c: IDHCPARTYschemes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}