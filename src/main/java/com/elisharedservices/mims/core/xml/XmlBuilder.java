package com.elisharedservices.mims.core.xml;

import java.util.Map;

/**
 * Created by marlon on 4/17/17.
 */
public interface XmlBuilder {
    String build(XmlObject xml);

    default String parseAttribute(Map<String, String> attributes){

        StringBuilder sb = new StringBuilder();

        if(attributes.entrySet() != null)
            for(Map.Entry<String, String> entry : attributes.entrySet()){
                sb.append(" ")
                        .append(entry.getKey())
                        .append("=")
                        .append("\"")
                        .append(entry.getValue())
                        .append("\"");

            }

        return sb.toString();

    }
}
