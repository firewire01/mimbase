package com.elisharedservices.mims.core.xml;

import java.util.Map;

/**
 * Created by marlon on 4/17/17.
 */
public class SingleXmlBuilder implements XmlBuilder {
    @Override
    public String build(XmlObject xml) {

        StringBuilder sb = new StringBuilder();

        return sb
                .append("<")
                .append(xml.getTagName())
                .append(parseAttribute(xml.getAttributes()))
                .append("/>")
                .toString();

    }
}
