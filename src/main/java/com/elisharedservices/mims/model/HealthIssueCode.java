package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;
import com.elisharedservices.mims.core.xml.XmlType;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "HealthIssueCode")
public class HealthIssueCode {

    @XmlField(name = "code")
    private String code;

    @XmlField(name = "codeType")
    private String codeType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
}
