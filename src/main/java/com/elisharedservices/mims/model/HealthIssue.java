package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;
import com.elisharedservices.mims.core.xml.XmlType;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName =  "HealthIssue")
public class HealthIssue {

    @XmlField(name = "reference")
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
