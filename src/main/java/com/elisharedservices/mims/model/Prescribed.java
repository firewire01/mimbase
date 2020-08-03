package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;

import java.util.List;

/**
 * Created by marlon on 4/17/17.
 */
@XmlClass(tagName = "Prescribed")
public class Prescribed {
    private List<Product> prescribedProductList;

    public List<Product> getPrescribedProductList() {
        return prescribedProductList;
    }

    public void setPrescribedProductList(List<Product> prescribedProductList) {
        this.prescribedProductList = prescribedProductList;
    }
}
