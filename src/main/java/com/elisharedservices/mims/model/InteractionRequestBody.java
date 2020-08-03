package com.elisharedservices.mims.model;

/**
 * Created by marlon on 5/3/17.
 */
public class InteractionRequestBody {

    private Prescribing prescribing;
    private Prescribed prescribed;
    private Allergies allergies;
    private HealthIssue healthIssue;
    private HealthIssueCodes healthIssueCodes;

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

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public HealthIssue getHealthIssue() {
        return healthIssue;
    }

    public void setHealthIssue(HealthIssue healthIssue) {
        this.healthIssue = healthIssue;
    }

    public HealthIssueCodes getHealthIssueCodes() {
        return healthIssueCodes;
    }

    public void setHealthIssueCodes(HealthIssueCodes healthIssueCodes) {
        this.healthIssueCodes = healthIssueCodes;
    }
}
