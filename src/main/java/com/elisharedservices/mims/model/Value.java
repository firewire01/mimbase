package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "Value")
public class Value {

    @XmlField(name = XmlField.STATIC)
    private int value;
}
