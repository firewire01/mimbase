package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;
import com.elisharedservices.mims.core.xml.XmlType;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "Dose")
public class Dose {

    private Value value;

    private Unit mcg;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Unit getMcg() {
        return mcg;
    }

    public void setMcg(Unit mcg) {
        this.mcg = mcg;
    }
}
