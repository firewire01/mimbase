package com.elisharedservices.mims.service;

import com.elisharedservices.mims.core.xml.XmlObject;
import com.elisharedservices.mims.core.xml.XmlObjectParser;
import com.elisharedservices.mims.model.InteractionFactory;
import com.elisharedservices.mims.model.InteractionType;
import com.elisharedservices.mims.model.InteractionTypeEnum;
import com.elisharedservices.mims.model.Prescribing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marlon on 4/18/17.
 */
@Service
public class InteractionServiceImp implements InteractionService{

    public static String INTERACTION_TAG_NAME = "Interaction";

    @Autowired
    private RequestService requestService = new RequestServiceImp();

    @Override
    public String getRequestByType(Prescribing prescribing, InteractionTypeEnum interactionType) {
        InteractionType interactionTypeManager = InteractionFactory.create(interactionType);
        if(interactionTypeManager == null){
            throw new IllegalStateException("Invalid Interaction type");
        }
        return getRequest(prescribing, interactionTypeManager);
    }

    @Override
    public XmlObject wrapInteraction(List<XmlObject> xmlObjects){
        XmlObject xml = new XmlObject();

        xml.setTagName(INTERACTION_TAG_NAME);

        xmlObjects.forEach(xml::addValue);

        return xml;

    }

    @Override
    public String getRequest(Object... objects) {

        List<XmlObject> list = new ArrayList<>();

        for(Object obj : objects){
            if(obj != null)
            list.add(XmlObjectParser.parseObject(obj));
        }

        return requestService.wrapRequest(wrapInteraction(list)).toString();
    }
}
