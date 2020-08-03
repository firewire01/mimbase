package com.elisharedservices.mims.core.xml;

import java.util.Map;

/**
 * Created by marlon on 4/17/17.
 */
public class DoubleXmlBuilder implements XmlBuilder {
    @Override
    public String build(XmlObject xml) {
        StringBuilder sb = new StringBuilder();

        sb
                .append("<")
                .append(xml.getTagName())
                .append(parseAttribute(xml.getAttributes()))
                .append(">")
                .append("\n");

        if(xml.getValue() != null && xml.getValue().size() > 0)
            for(XmlObject xmlObject : xml.getValue())
                sb.append(xmlObject.toString())
                        .append("\n");

        if(xml.getPlaneValue() != null && xml.getPlaneValue().length() >0)
            sb.append(xml.getPlaneValue());

        sb
                .append("</")
                .append(xml.getTagName())
                .append(">");

        return sb.toString();
    }
}
