package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "Unit")
public class Unit {

    @XmlField(name = XmlField.STATIC)
    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
