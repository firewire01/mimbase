package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "Dosing")
public class Dosing {

    private Dose dose;
    private Frequency frequency;

    public Dose getDose() {
        return dose;
    }

    public void setDose(Dose dose) {
        this.dose = dose;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }
}
