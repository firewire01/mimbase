package com.elisharedservices.mims.model;

/**
 * Created by marlon on 5/3/17.
 */
public class PrescribingPrescribed {
    private Prescribing prescribing;
    private Prescribed prescribed;

    public Prescribing getPrescribing() {
        return prescribing;
    }

    public void setPrescribing(Prescribing prescribing) {
        this.prescribing = prescribing;
    }

    public Prescribed getPrescribed() {
        return prescribed;
    }

    public void setPrescribed(Prescribed prescribed) {
        this.prescribed = prescribed;
    }
}
