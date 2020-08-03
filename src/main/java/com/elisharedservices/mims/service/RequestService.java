package com.elisharedservices.mims.service;

import com.elisharedservices.mims.core.xml.XmlObject;
import com.elisharedservices.mims.model.*;

/**
 * Created by marlon on 4/18/17.
 */

public interface RequestService {

    public XmlObject wrapRequest(XmlObject... xmlObjects);

}
