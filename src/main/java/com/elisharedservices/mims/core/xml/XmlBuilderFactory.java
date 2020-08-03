package com.elisharedservices.mims.core.xml;

/**
 * Created by marlon on 4/17/17.
 */
public class XmlBuilderFactory {

    public static XmlBuilder create(XmlType type){

        if(type == XmlType.SINGLE){
            return new SingleXmlBuilder();
        }if(type == XmlType.DOUBLE){
            return new DoubleXmlBuilder();
        }

        return null;
    }
}
