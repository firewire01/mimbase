package com.elisharedservices.mims.core.xml;

import java.util.*;

/**
 * Created by marlon on 4/17/17.
 */
public class XmlObject {

    private String tagName;
    private Map<String, String> attributes;
    private List<XmlObject> value;
    private String planeValue;
    private XmlType xmlType;

    public static String DEFAULT_TAG_NAME = "undifined";

    public XmlObject() {
        this.tagName = DEFAULT_TAG_NAME;
        this.attributes = new LinkedHashMap<>();
        this.value = new LinkedList<>();
        this.xmlType = XmlType.DOUBLE;
    }

    public XmlObject(String tagName, Map<String, String> attributes, List<XmlObject> value, XmlType xmlType) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.value = value;
        this.xmlType = xmlType;
    }

    public XmlObject(String tagName, Map<String, String> attributes, List<XmlObject> value) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.value = value;
        this.xmlType = XmlType.DOUBLE;
    }

    public XmlObject(String tagName, List<XmlObject> value) {
        this.tagName = tagName;
        this.attributes = new HashMap<>();
        this.value = value;
        this.xmlType = XmlType.DOUBLE;
    }

    public XmlObject(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.value = null;
        this.xmlType = XmlType.DOUBLE;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<XmlObject> getValue() {
        return value;
    }

    public void setValue(List<XmlObject> value) {
        this.value = value;
    }

    public XmlType getXmlType() {
        return xmlType;
    }

    public void setXmlType(XmlType xmlType) {
        this.xmlType = xmlType;
    }

    public void addAttribute(String name, String value){
        this.getAttributes().put(name,value);
    }

    public void addValue(XmlObject xmlObject){
        this.getValue().add(xmlObject);
    }

    public String getPlaneValue() {
        return planeValue;
    }

    public void setPlaneValue(String planeValue) {
        this.planeValue = planeValue;
    }

    @Override
    public String toString(){

        XmlBuilder xmlBuilder = XmlBuilderFactory.create(getXmlType());

        if(xmlBuilder !=  null)return xmlBuilder.build(this);

        return "<Data>XmlBuilder not found.</Data>";
    }
}
