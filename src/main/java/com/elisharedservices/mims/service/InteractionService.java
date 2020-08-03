package com.elisharedservices.mims.service;

import com.elisharedservices.mims.core.xml.XmlObject;
import com.elisharedservices.mims.model.InteractionTypeEnum;
import com.elisharedservices.mims.model.Prescribing;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marlon on 4/18/17.
 */


public interface InteractionService {

    String getRequestByType(Prescribing prescribing, InteractionTypeEnum interactionType);

    String getRequest(Object... objects);

    XmlObject wrapInteraction(List<XmlObject> xmlObjects);

}
