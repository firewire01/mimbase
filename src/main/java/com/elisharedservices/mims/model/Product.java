package com.elisharedservices.mims.model;

import com.elisharedservices.mims.core.xml.XmlClass;
import com.elisharedservices.mims.core.xml.XmlField;

/**
 * Created by marlon on 4/19/17.
 */
@XmlClass(tagName = "Product")
public class Product {

    @XmlField(name = "reference")
    private String reference;

    private RouteOfAdministration routeOfAdministration;
    private ProductForm productForm;
    private Dosing dosing;


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public RouteOfAdministration getRouteOfAdministration() {
        return routeOfAdministration;
    }

    public void setRouteOfAdministration(RouteOfAdministration routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }

    public ProductForm getProductForm() {
        return productForm;
    }

    public void setProductForm(ProductForm productForm) {
        this.productForm = productForm;
    }

    public Dosing getDosing() {
        return dosing;
    }

    public void setDosing(Dosing dosing) {
        this.dosing = dosing;
    }
}
