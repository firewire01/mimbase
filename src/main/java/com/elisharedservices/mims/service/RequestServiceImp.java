package com.elisharedservices.mims.service;

import com.elisharedservices.mims.core.xml.XmlObject;
import org.springframework.stereotype.Service;

/**
 * Created by marlon on 4/18/17.
 */
@Service
public class RequestServiceImp implements RequestService {

    public static String REQUEST_TAG_NAME = "Request";

    @Override
    public XmlObject wrapRequest(XmlObject... xmlObjects) {

        XmlObject xmlObject = new XmlObject();

        xmlObject.setTagName(REQUEST_TAG_NAME);

        for(XmlObject xml : xmlObjects)
            xmlObject.addValue(xml);

        return xmlObject;
    }
}
