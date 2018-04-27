/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.05 à 11:48:22 AM CET 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20141201.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-HEADING-REGvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-HEADING-REGvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="coronaryanatomy"/>
 *     &lt;enumeration value="chapter4"/>
 *     &lt;enumeration value="non-biologic"/>
 *     &lt;enumeration value="bmi"/>
 *     &lt;enumeration value="primarykneeprocedure"/>
 *     &lt;enumeration value="approachtechnic"/>
 *     &lt;enumeration value="instrumentation"/>
 *     &lt;enumeration value="orthopedicanatomy"/>
 *     &lt;enumeration value="interface"/>
 *     &lt;enumeration value="revisionplan"/>
 *     &lt;enumeration value="material"/>
 *     &lt;enumeration value="notified-material"/>
 *     &lt;enumeration value="not-notified-material"/>
 *     &lt;enumeration value="not-notified-ortho-device"/>
 *     &lt;enumeration value="criteria"/>
 *     &lt;enumeration value="comorbidities"/>
 *     &lt;enumeration value="comorbiditiesinformation"/>
 *     &lt;enumeration value="results"/>
 *     &lt;enumeration value="resynchronisationinfo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-HEADING-REGvalues")
@XmlEnum
public enum CDHEADINGREGvalues {

    @XmlEnumValue("coronaryanatomy")
    CORONARYANATOMY("coronaryanatomy"),
    @XmlEnumValue("chapter4")
    CHAPTER_4("chapter4"),
    @XmlEnumValue("non-biologic")
    NON_BIOLOGIC("non-biologic"),
    @XmlEnumValue("bmi")
    BMI("bmi"),
    @XmlEnumValue("primarykneeprocedure")
    PRIMARYKNEEPROCEDURE("primarykneeprocedure"),
    @XmlEnumValue("approachtechnic")
    APPROACHTECHNIC("approachtechnic"),
    @XmlEnumValue("instrumentation")
    INSTRUMENTATION("instrumentation"),
    @XmlEnumValue("orthopedicanatomy")
    ORTHOPEDICANATOMY("orthopedicanatomy"),
    @XmlEnumValue("interface")
    INTERFACE("interface"),
    @XmlEnumValue("revisionplan")
    REVISIONPLAN("revisionplan"),
    @XmlEnumValue("material")
    MATERIAL("material"),
    @XmlEnumValue("notified-material")
    NOTIFIED_MATERIAL("notified-material"),
    @XmlEnumValue("not-notified-material")
    NOT_NOTIFIED_MATERIAL("not-notified-material"),
    @XmlEnumValue("not-notified-ortho-device")
    NOT_NOTIFIED_ORTHO_DEVICE("not-notified-ortho-device"),
    @XmlEnumValue("criteria")
    CRITERIA("criteria"),
    @XmlEnumValue("comorbidities")
    COMORBIDITIES("comorbidities"),
    @XmlEnumValue("comorbiditiesinformation")
    COMORBIDITIESINFORMATION("comorbiditiesinformation"),
    @XmlEnumValue("results")
    RESULTS("results"),
    @XmlEnumValue("resynchronisationinfo")
    RESYNCHRONISATIONINFO("resynchronisationinfo");
    private final String value;

    CDHEADINGREGvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDHEADINGREGvalues fromValue(String v) {
        for (CDHEADINGREGvalues c: CDHEADINGREGvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
