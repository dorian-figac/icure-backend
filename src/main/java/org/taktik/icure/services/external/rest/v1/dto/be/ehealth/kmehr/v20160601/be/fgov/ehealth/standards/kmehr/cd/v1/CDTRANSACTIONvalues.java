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
// Generated on: 2017.03.09 at 09:24:49 AM CET 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20160601.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-TRANSACTIONvalues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-TRANSACTIONvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="admission"/>
 *     &lt;enumeration value="alert"/>
 *     &lt;enumeration value="contactreport"/>
 *     &lt;enumeration value="death"/>
 *     &lt;enumeration value="discharge"/>
 *     &lt;enumeration value="dischargereport"/>
 *     &lt;enumeration value="epidemiology"/>
 *     &lt;enumeration value="labrequest"/>
 *     &lt;enumeration value="labresult"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="hospitalpharmaceuticalprescription"/>
 *     &lt;enumeration value="pharmaceuticalprescription"/>
 *     &lt;enumeration value="productdelivery"/>
 *     &lt;enumeration value="quickdischargereport"/>
 *     &lt;enumeration value="referral"/>
 *     &lt;enumeration value="request"/>
 *     &lt;enumeration value="result"/>
 *     &lt;enumeration value="vaccination"/>
 *     &lt;enumeration value="sumehr"/>
 *     &lt;enumeration value="ecare-safe-consultation"/>
 *     &lt;enumeration value="ebirth-mother-notification"/>
 *     &lt;enumeration value="ebirth-baby-notification"/>
 *     &lt;enumeration value="ebirth-baby-medicalform"/>
 *     &lt;enumeration value="ebirth-mother-medicalform"/>
 *     &lt;enumeration value="clinicalsummary"/>
 *     &lt;enumeration value="medicaladvisoragreement"/>
 *     &lt;enumeration value="bvt-sample"/>
 *     &lt;enumeration value="clinicalpath"/>
 *     &lt;enumeration value="telemonitoring"/>
 *     &lt;enumeration value="radiationexposuremonitoring"/>
 *     &lt;enumeration value="intervention"/>
 *     &lt;enumeration value="medicationschemeelement"/>
 *     &lt;enumeration value="treatmentsuspension"/>
 *     &lt;enumeration value="prescription"/>
 *     &lt;enumeration value="notification"/>
 *     &lt;enumeration value="report"/>
 *     &lt;enumeration value="medicationscheme"/>
 *     &lt;enumeration value="vaccinationscheme"/>
 *     &lt;enumeration value="vaccinationschemeelement"/>
 *     &lt;enumeration value="ecare-tardis-consultation"/>
 *     &lt;enumeration value="genericregistryentry"/>
 *     &lt;enumeration value="population-based-screening"/>
 *     &lt;enumeration value="child-prevention"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-TRANSACTIONvalues")
@XmlEnum
public enum CDTRANSACTIONvalues {

    @XmlEnumValue("admission")
    ADMISSION("admission"),
    @XmlEnumValue("alert")
    ALERT("alert"),
    @XmlEnumValue("contactreport")
    CONTACTREPORT("contactreport"),
    @XmlEnumValue("death")
    DEATH("death"),
    @XmlEnumValue("discharge")
    DISCHARGE("discharge"),
    @XmlEnumValue("dischargereport")
    DISCHARGEREPORT("dischargereport"),
    @XmlEnumValue("epidemiology")
    EPIDEMIOLOGY("epidemiology"),
    @XmlEnumValue("labrequest")
    LABREQUEST("labrequest"),
    @XmlEnumValue("labresult")
    LABRESULT("labresult"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("hospitalpharmaceuticalprescription")
    HOSPITALPHARMACEUTICALPRESCRIPTION("hospitalpharmaceuticalprescription"),
    @XmlEnumValue("pharmaceuticalprescription")
    PHARMACEUTICALPRESCRIPTION("pharmaceuticalprescription"),
    @XmlEnumValue("productdelivery")
    PRODUCTDELIVERY("productdelivery"),
    @XmlEnumValue("quickdischargereport")
    QUICKDISCHARGEREPORT("quickdischargereport"),
    @XmlEnumValue("referral")
    REFERRAL("referral"),
    @XmlEnumValue("request")
    REQUEST("request"),
    @XmlEnumValue("result")
    RESULT("result"),
    @XmlEnumValue("vaccination")
    VACCINATION("vaccination"),
    @XmlEnumValue("sumehr")
    SUMEHR("sumehr"),
    @XmlEnumValue("ecare-safe-consultation")
    ECARE_SAFE_CONSULTATION("ecare-safe-consultation"),
    @XmlEnumValue("ebirth-mother-notification")
    EBIRTH_MOTHER_NOTIFICATION("ebirth-mother-notification"),
    @XmlEnumValue("ebirth-baby-notification")
    EBIRTH_BABY_NOTIFICATION("ebirth-baby-notification"),
    @XmlEnumValue("ebirth-baby-medicalform")
    EBIRTH_BABY_MEDICALFORM("ebirth-baby-medicalform"),
    @XmlEnumValue("ebirth-mother-medicalform")
    EBIRTH_MOTHER_MEDICALFORM("ebirth-mother-medicalform"),
    @XmlEnumValue("clinicalsummary")
    CLINICALSUMMARY("clinicalsummary"),
    @XmlEnumValue("medicaladvisoragreement")
    MEDICALADVISORAGREEMENT("medicaladvisoragreement"),
    @XmlEnumValue("bvt-sample")
    BVT_SAMPLE("bvt-sample"),
    @XmlEnumValue("clinicalpath")
    CLINICALPATH("clinicalpath"),
    @XmlEnumValue("telemonitoring")
    TELEMONITORING("telemonitoring"),
    @XmlEnumValue("radiationexposuremonitoring")
    RADIATIONEXPOSUREMONITORING("radiationexposuremonitoring"),
    @XmlEnumValue("intervention")
    INTERVENTION("intervention"),
    @XmlEnumValue("medicationschemeelement")
    MEDICATIONSCHEMEELEMENT("medicationschemeelement"),
    @XmlEnumValue("treatmentsuspension")
    TREATMENTSUSPENSION("treatmentsuspension"),
    @XmlEnumValue("prescription")
    PRESCRIPTION("prescription"),
    @XmlEnumValue("notification")
    NOTIFICATION("notification"),
    @XmlEnumValue("report")
    REPORT("report"),
    @XmlEnumValue("medicationscheme")
    MEDICATIONSCHEME("medicationscheme"),
    @XmlEnumValue("vaccinationscheme")
    VACCINATIONSCHEME("vaccinationscheme"),
    @XmlEnumValue("vaccinationschemeelement")
    VACCINATIONSCHEMEELEMENT("vaccinationschemeelement"),
    @XmlEnumValue("ecare-tardis-consultation")
    ECARE_TARDIS_CONSULTATION("ecare-tardis-consultation"),
    @XmlEnumValue("genericregistryentry")
    GENERICREGISTRYENTRY("genericregistryentry"),
    @XmlEnumValue("population-based-screening")
    POPULATION_BASED_SCREENING("population-based-screening"),
    @XmlEnumValue("child-prevention")
    CHILD_PREVENTION("child-prevention");
    private final String value;

    CDTRANSACTIONvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDTRANSACTIONvalues fromValue(String v) {
        for (CDTRANSACTIONvalues c: CDTRANSACTIONvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}