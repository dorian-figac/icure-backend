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
// Généré le : 2015.11.10 à 11:53:46 AM CET 
//


package org.taktik.icure.be.ehealth.dto.kmehr.v20150901.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-HEADINGvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-HEADINGvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assessment"/>
 *     &lt;enumeration value="clinical"/>
 *     &lt;enumeration value="clinicalplan"/>
 *     &lt;enumeration value="subjective"/>
 *     &lt;enumeration value="technical"/>
 *     &lt;enumeration value="technicalplan"/>
 *     &lt;enumeration value="treatment"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="history"/>
 *     &lt;enumeration value="familyhistory"/>
 *     &lt;enumeration value="prescription"/>
 *     &lt;enumeration value="medication"/>
 *     &lt;enumeration value="anamnesis"/>
 *     &lt;enumeration value="examination"/>
 *     &lt;enumeration value="plan"/>
 *     &lt;enumeration value="outcomeevaluation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-HEADINGvalues")
@XmlEnum
public enum CDHEADINGvalues {

    @XmlEnumValue("assessment")
    ASSESSMENT("assessment"),
    @XmlEnumValue("clinical")
    CLINICAL("clinical"),
    @XmlEnumValue("clinicalplan")
    CLINICALPLAN("clinicalplan"),
    @XmlEnumValue("subjective")
    SUBJECTIVE("subjective"),
    @XmlEnumValue("technical")
    TECHNICAL("technical"),
    @XmlEnumValue("technicalplan")
    TECHNICALPLAN("technicalplan"),
    @XmlEnumValue("treatment")
    TREATMENT("treatment"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("history")
    HISTORY("history"),
    @XmlEnumValue("familyhistory")
    FAMILYHISTORY("familyhistory"),
    @XmlEnumValue("prescription")
    PRESCRIPTION("prescription"),
    @XmlEnumValue("medication")
    MEDICATION("medication"),
    @XmlEnumValue("anamnesis")
    ANAMNESIS("anamnesis"),
    @XmlEnumValue("examination")
    EXAMINATION("examination"),
    @XmlEnumValue("plan")
    PLAN("plan"),
    @XmlEnumValue("outcomeevaluation")
    OUTCOMEEVALUATION("outcomeevaluation");
    private final String value;

    CDHEADINGvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDHEADINGvalues fromValue(String v) {
        for (CDHEADINGvalues c: CDHEADINGvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
