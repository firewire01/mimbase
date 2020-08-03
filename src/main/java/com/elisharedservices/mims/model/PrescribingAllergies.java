package com.elisharedservices.mims.model;

/**
 * Created by marlon on 5/3/17.
 */
public class PrescribingAllergies {
    private Prescribing prescribing;
    private Allergies allergies;

    public Prescribing getPrescribing() {
        return prescribing;
    }

    public void setPrescribing(Prescribing prescribing) {
        this.prescribing = prescribing;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }
}
