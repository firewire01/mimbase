package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;
import com.elisharedservices.mims.core.xml.XmlType;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "Frequency")
public class Frequency {

    @XmlField(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
