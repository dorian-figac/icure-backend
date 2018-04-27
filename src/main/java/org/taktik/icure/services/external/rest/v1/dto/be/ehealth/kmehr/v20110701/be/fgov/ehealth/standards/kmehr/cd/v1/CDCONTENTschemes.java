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
// Généré le : 2015.03.05 à 11:47:59 AM CET 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20110701.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-CONTENTschemes.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-CONTENTschemes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CD-LAB"/>
 *     &lt;enumeration value="CD-TECHNICAL"/>
 *     &lt;enumeration value="CD-HCPARTY"/>
 *     &lt;enumeration value="CD-DRUG-CNK"/>
 *     &lt;enumeration value="CD-ENCOUNTER"/>
 *     &lt;enumeration value="CD-MKG-ADMISSION"/>
 *     &lt;enumeration value="CD-MKG-DISCHARGE"/>
 *     &lt;enumeration value="CD-MKG-ORIGIN"/>
 *     &lt;enumeration value="CD-MKG-REFERRER"/>
 *     &lt;enumeration value="CD-MKG-DESTINATION"/>
 *     &lt;enumeration value="CD-LEGAL-SERVICE"/>
 *     &lt;enumeration value="CD-CONTACT-PERSON"/>
 *     &lt;enumeration value="CD-ENCOUNTER-TYPE"/>
 *     &lt;enumeration value="CD-CARENET-ACCIDENT-TYPE"/>
 *     &lt;enumeration value="CD-CARENET-AGREEMENT-TYPE"/>
 *     &lt;enumeration value="CD-CARENET-SISCARD-ERROR"/>
 *     &lt;enumeration value="CD-CARENET-SOCIAL-CODE"/>
 *     &lt;enumeration value="CD-CARENET-REFUSAL-REASON"/>
 *     &lt;enumeration value="CD-CARENET-NATIONAL-INSURANCE"/>
 *     &lt;enumeration value="CD-CARENET-MESSAGE"/>
 *     &lt;enumeration value="CD-CARENET-MUTATION-INDICATOR"/>
 *     &lt;enumeration value="CD-CARENET-DOCUMENT"/>
 *     &lt;enumeration value="CD-CARENET-INSURANCY-STATUS"/>
 *     &lt;enumeration value="CD-CARENET-TYPE"/>
 *     &lt;enumeration value="CD-MAA-TYPE"/>
 *     &lt;enumeration value="CD-MAA-REQUESTTYPE"/>
 *     &lt;enumeration value="CD-MAA-RESPONSETYPE"/>
 *     &lt;enumeration value="CD-MAA-REFUSALJUSTIFICATION"/>
 *     &lt;enumeration value="CD-MAA-COVERAGE-TYPE"/>
 *     &lt;enumeration value="CD-SITE"/>
 *     &lt;enumeration value="CD-INCAPACITY"/>
 *     &lt;enumeration value="CD-ENCOUNTERSAFETYISSUE"/>
 *     &lt;enumeration value="CD-EMERGENCYEVALUATION"/>
 *     &lt;enumeration value="ICD"/>
 *     &lt;enumeration value="ICPC"/>
 *     &lt;enumeration value="CD-CLINICAL"/>
 *     &lt;enumeration value="LOCAL"/>
 *     &lt;enumeration value="CD-ECARE-HAQVALUE"/>
 *     &lt;enumeration value="CD-EBIRTH-PREGNANCYORIGIN"/>
 *     &lt;enumeration value="CD-EBIRTH-SPECIALVALUES"/>
 *     &lt;enumeration value="CD-EBIRTH-CHILDPOSITION"/>
 *     &lt;enumeration value="CD-EBIRTH-FOETALMONITORING"/>
 *     &lt;enumeration value="CD-EBIRTH-DELIVERYWAY"/>
 *     &lt;enumeration value="CD-EBIRTH-CAESEREANINDICATION"/>
 *     &lt;enumeration value="CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE"/>
 *     &lt;enumeration value="CD-EBIRTH-NEONATALDEPTTYPE"/>
 *     &lt;enumeration value="CD-EBIRTH-CONGENITALMALFORMATION"/>
 *     &lt;enumeration value="CD-VACCINEINDICATION"/>
 *     &lt;enumeration value="CD-ATC"/>
 *     &lt;enumeration value="CD-CAREPATH"/>
 *     &lt;enumeration value="CD-CLINICALPLAN"/>
 *     &lt;enumeration value="CD-PATIENTWILL"/>
 *     &lt;enumeration value="CD-CONSENT"/>
 *     &lt;enumeration value="CD-CHAPTER4PARAGRAPH"/>
 *     &lt;enumeration value="CD-CHAPTER4CATEGORY"/>
 *     &lt;enumeration value="CD-CHAPTER4CRITERIA"/>
 *     &lt;enumeration value="CD-CHAPTER4VERSESEQAPPENDIX"/>
 *     &lt;enumeration value="CD-CHAPTER4DOCUMENTSEQAPPENDIX"/>
 *     &lt;enumeration value="CD-CHAPTER4VERSE"/>
 *     &lt;enumeration value="CD-BVT-CONSERVATIONMODE"/>
 *     &lt;enumeration value="CD-BVT-CONSERVATIONDELAY"/>
 *     &lt;enumeration value="CD-BVT-AVAILABLEMATERIALS"/>
 *     &lt;enumeration value="CD-BCR-DIFFERENTATIONDEGREE"/>
 *     &lt;enumeration value="CD-BVT-SAMPLETYPE"/>
 *     &lt;enumeration value="CD-BVT-LATERALITY"/>
 *     &lt;enumeration value="CD-BVT-PATIENTOPPOSITION"/>
 *     &lt;enumeration value="CD-BVT-STATUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-CONTENTschemes")
@XmlEnum
public enum CDCONTENTschemes {

    @XmlEnumValue("CD-LAB")
    CD_LAB("CD-LAB"),
    @XmlEnumValue("CD-TECHNICAL")
    CD_TECHNICAL("CD-TECHNICAL"),
    @XmlEnumValue("CD-HCPARTY")
    CD_HCPARTY("CD-HCPARTY"),
    @XmlEnumValue("CD-DRUG-CNK")
    CD_DRUG_CNK("CD-DRUG-CNK"),
    @XmlEnumValue("CD-ENCOUNTER")
    CD_ENCOUNTER("CD-ENCOUNTER"),
    @XmlEnumValue("CD-MKG-ADMISSION")
    CD_MKG_ADMISSION("CD-MKG-ADMISSION"),
    @XmlEnumValue("CD-MKG-DISCHARGE")
    CD_MKG_DISCHARGE("CD-MKG-DISCHARGE"),
    @XmlEnumValue("CD-MKG-ORIGIN")
    CD_MKG_ORIGIN("CD-MKG-ORIGIN"),
    @XmlEnumValue("CD-MKG-REFERRER")
    CD_MKG_REFERRER("CD-MKG-REFERRER"),
    @XmlEnumValue("CD-MKG-DESTINATION")
    CD_MKG_DESTINATION("CD-MKG-DESTINATION"),
    @XmlEnumValue("CD-LEGAL-SERVICE")
    CD_LEGAL_SERVICE("CD-LEGAL-SERVICE"),
    @XmlEnumValue("CD-CONTACT-PERSON")
    CD_CONTACT_PERSON("CD-CONTACT-PERSON"),
    @XmlEnumValue("CD-ENCOUNTER-TYPE")
    CD_ENCOUNTER_TYPE("CD-ENCOUNTER-TYPE"),
    @XmlEnumValue("CD-CARENET-ACCIDENT-TYPE")
    CD_CARENET_ACCIDENT_TYPE("CD-CARENET-ACCIDENT-TYPE"),
    @XmlEnumValue("CD-CARENET-AGREEMENT-TYPE")
    CD_CARENET_AGREEMENT_TYPE("CD-CARENET-AGREEMENT-TYPE"),
    @XmlEnumValue("CD-CARENET-SISCARD-ERROR")
    CD_CARENET_SISCARD_ERROR("CD-CARENET-SISCARD-ERROR"),
    @XmlEnumValue("CD-CARENET-SOCIAL-CODE")
    CD_CARENET_SOCIAL_CODE("CD-CARENET-SOCIAL-CODE"),
    @XmlEnumValue("CD-CARENET-REFUSAL-REASON")
    CD_CARENET_REFUSAL_REASON("CD-CARENET-REFUSAL-REASON"),
    @XmlEnumValue("CD-CARENET-NATIONAL-INSURANCE")
    CD_CARENET_NATIONAL_INSURANCE("CD-CARENET-NATIONAL-INSURANCE"),
    @XmlEnumValue("CD-CARENET-MESSAGE")
    CD_CARENET_MESSAGE("CD-CARENET-MESSAGE"),
    @XmlEnumValue("CD-CARENET-MUTATION-INDICATOR")
    CD_CARENET_MUTATION_INDICATOR("CD-CARENET-MUTATION-INDICATOR"),
    @XmlEnumValue("CD-CARENET-DOCUMENT")
    CD_CARENET_DOCUMENT("CD-CARENET-DOCUMENT"),
    @XmlEnumValue("CD-CARENET-INSURANCY-STATUS")
    CD_CARENET_INSURANCY_STATUS("CD-CARENET-INSURANCY-STATUS"),
    @XmlEnumValue("CD-CARENET-TYPE")
    CD_CARENET_TYPE("CD-CARENET-TYPE"),
    @XmlEnumValue("CD-MAA-TYPE")
    CD_MAA_TYPE("CD-MAA-TYPE"),
    @XmlEnumValue("CD-MAA-REQUESTTYPE")
    CD_MAA_REQUESTTYPE("CD-MAA-REQUESTTYPE"),
    @XmlEnumValue("CD-MAA-RESPONSETYPE")
    CD_MAA_RESPONSETYPE("CD-MAA-RESPONSETYPE"),
    @XmlEnumValue("CD-MAA-REFUSALJUSTIFICATION")
    CD_MAA_REFUSALJUSTIFICATION("CD-MAA-REFUSALJUSTIFICATION"),
    @XmlEnumValue("CD-MAA-COVERAGE-TYPE")
    CD_MAA_COVERAGE_TYPE("CD-MAA-COVERAGE-TYPE"),
    @XmlEnumValue("CD-SITE")
    CD_SITE("CD-SITE"),
    @XmlEnumValue("CD-INCAPACITY")
    CD_INCAPACITY("CD-INCAPACITY"),
    @XmlEnumValue("CD-ENCOUNTERSAFETYISSUE")
    CD_ENCOUNTERSAFETYISSUE("CD-ENCOUNTERSAFETYISSUE"),
    @XmlEnumValue("CD-EMERGENCYEVALUATION")
    CD_EMERGENCYEVALUATION("CD-EMERGENCYEVALUATION"),
    ICD("ICD"),
    ICPC("ICPC"),
    @XmlEnumValue("CD-CLINICAL")
    CD_CLINICAL("CD-CLINICAL"),
    LOCAL("LOCAL"),
    @XmlEnumValue("CD-ECARE-HAQVALUE")
    CD_ECARE_HAQVALUE("CD-ECARE-HAQVALUE"),
    @XmlEnumValue("CD-EBIRTH-PREGNANCYORIGIN")
    CD_EBIRTH_PREGNANCYORIGIN("CD-EBIRTH-PREGNANCYORIGIN"),
    @XmlEnumValue("CD-EBIRTH-SPECIALVALUES")
    CD_EBIRTH_SPECIALVALUES("CD-EBIRTH-SPECIALVALUES"),
    @XmlEnumValue("CD-EBIRTH-CHILDPOSITION")
    CD_EBIRTH_CHILDPOSITION("CD-EBIRTH-CHILDPOSITION"),
    @XmlEnumValue("CD-EBIRTH-FOETALMONITORING")
    CD_EBIRTH_FOETALMONITORING("CD-EBIRTH-FOETALMONITORING"),
    @XmlEnumValue("CD-EBIRTH-DELIVERYWAY")
    CD_EBIRTH_DELIVERYWAY("CD-EBIRTH-DELIVERYWAY"),
    @XmlEnumValue("CD-EBIRTH-CAESEREANINDICATION")
    CD_EBIRTH_CAESEREANINDICATION("CD-EBIRTH-CAESEREANINDICATION"),
    @XmlEnumValue("CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE")
    CD_EBIRTH_ARTIFICIALRESPIRATIONTYPE("CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE"),
    @XmlEnumValue("CD-EBIRTH-NEONATALDEPTTYPE")
    CD_EBIRTH_NEONATALDEPTTYPE("CD-EBIRTH-NEONATALDEPTTYPE"),
    @XmlEnumValue("CD-EBIRTH-CONGENITALMALFORMATION")
    CD_EBIRTH_CONGENITALMALFORMATION("CD-EBIRTH-CONGENITALMALFORMATION"),
    @XmlEnumValue("CD-VACCINEINDICATION")
    CD_VACCINEINDICATION("CD-VACCINEINDICATION"),
    @XmlEnumValue("CD-ATC")
    CD_ATC("CD-ATC"),
    @XmlEnumValue("CD-CAREPATH")
    CD_CAREPATH("CD-CAREPATH"),
    @XmlEnumValue("CD-CLINICALPLAN")
    CD_CLINICALPLAN("CD-CLINICALPLAN"),
    @XmlEnumValue("CD-PATIENTWILL")
    CD_PATIENTWILL("CD-PATIENTWILL"),
    @XmlEnumValue("CD-CONSENT")
    CD_CONSENT("CD-CONSENT"),
    @XmlEnumValue("CD-CHAPTER4PARAGRAPH")
    CD_CHAPTER_4_PARAGRAPH("CD-CHAPTER4PARAGRAPH"),
    @XmlEnumValue("CD-CHAPTER4CATEGORY")
    CD_CHAPTER_4_CATEGORY("CD-CHAPTER4CATEGORY"),
    @XmlEnumValue("CD-CHAPTER4CRITERIA")
    CD_CHAPTER_4_CRITERIA("CD-CHAPTER4CRITERIA"),
    @XmlEnumValue("CD-CHAPTER4VERSESEQAPPENDIX")
    CD_CHAPTER_4_VERSESEQAPPENDIX("CD-CHAPTER4VERSESEQAPPENDIX"),
    @XmlEnumValue("CD-CHAPTER4DOCUMENTSEQAPPENDIX")
    CD_CHAPTER_4_DOCUMENTSEQAPPENDIX("CD-CHAPTER4DOCUMENTSEQAPPENDIX"),
    @XmlEnumValue("CD-CHAPTER4VERSE")
    CD_CHAPTER_4_VERSE("CD-CHAPTER4VERSE"),
    @XmlEnumValue("CD-BVT-CONSERVATIONMODE")
    CD_BVT_CONSERVATIONMODE("CD-BVT-CONSERVATIONMODE"),
    @XmlEnumValue("CD-BVT-CONSERVATIONDELAY")
    CD_BVT_CONSERVATIONDELAY("CD-BVT-CONSERVATIONDELAY"),
    @XmlEnumValue("CD-BVT-AVAILABLEMATERIALS")
    CD_BVT_AVAILABLEMATERIALS("CD-BVT-AVAILABLEMATERIALS"),
    @XmlEnumValue("CD-BCR-DIFFERENTATIONDEGREE")
    CD_BCR_DIFFERENTATIONDEGREE("CD-BCR-DIFFERENTATIONDEGREE"),
    @XmlEnumValue("CD-BVT-SAMPLETYPE")
    CD_BVT_SAMPLETYPE("CD-BVT-SAMPLETYPE"),
    @XmlEnumValue("CD-BVT-LATERALITY")
    CD_BVT_LATERALITY("CD-BVT-LATERALITY"),
    @XmlEnumValue("CD-BVT-PATIENTOPPOSITION")
    CD_BVT_PATIENTOPPOSITION("CD-BVT-PATIENTOPPOSITION"),
    @XmlEnumValue("CD-BVT-STATUS")
    CD_BVT_STATUS("CD-BVT-STATUS");
    private final String value;

    CDCONTENTschemes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDCONTENTschemes fromValue(String v) {
        for (CDCONTENTschemes c: CDCONTENTschemes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
