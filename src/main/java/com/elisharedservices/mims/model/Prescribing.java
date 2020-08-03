package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/**
 * Created by marlon on 4/17/17.
 */
@XmlClass(tagName = "Prescribing")
public class Prescribing {
    private List<Product> prescribingProductList;

    public List<Product> getPrescribingProductList() {
        return prescribingProductList;
    }

    public void setPrescribingProductList(List<Product> prescribingProductList) {
        this.prescribingProductList = prescribingProductList;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
