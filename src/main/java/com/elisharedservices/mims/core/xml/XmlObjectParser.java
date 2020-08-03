package com.elisharedservices.mims.core.xml;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by marlon on 4/21/17.
 */
public class XmlObjectParser {

    public static XmlObject parseObject(Object obj) {

        if(obj != null && obj.getClass().isAnnotationPresent(XmlClass.class)){

            XmlObject xmlObject = new XmlObject();

            XmlClass xmlClass = obj.getClass().getAnnotation(XmlClass.class);

            xmlObject.setTagName(xmlClass.tagName());

            Field[] allFields = obj.getClass().getDeclaredFields();

            int ctr = 0;



            for (Field field : allFields) {
                try {
                    field.setAccessible(true);

                    if (field.get(obj) != null) {

                        if (field.isAnnotationPresent(XmlField.class)) {

                            XmlField xmlField = field.getAnnotation(XmlField.class);

                            Object value = field.get(obj);

                            if (value != null)
                                if (!xmlField.name().equalsIgnoreCase(XmlField.STATIC)) {
                                    xmlObject.addAttribute(xmlField.name(), value.toString());
                                } else {
                                    ctr++;
                                    xmlObject.setPlaneValue(value.toString());
                                }


                        } else {
                            if (Collection.class.isAssignableFrom(field.getType())) {
                                if (List.class.isAssignableFrom(field.getType())) {

                                    List<Object> list = (List<Object>) field.get(obj);
                                    for (Object l : list) {
                                        XmlObject innerXml = parseObject(l);

                                        if (innerXml != null) {
                                            ctr++;
                                            xmlObject.addValue(innerXml);
                                        }

                                    }

                                } else if (Set.class.isAssignableFrom(field.getType())) {
                                    Set<Object> list = (Set<Object>) field.get(obj);
                                    for (Object l : list) {
                                        XmlObject innerXml = parseObject(l);

                                        if (innerXml != null) {
                                            ctr++;
                                            xmlObject.addValue(innerXml);
                                        }

                                    }

                                }

                            } else if (Map.class.isAssignableFrom(field.getType())) {
                                //don't process map
                            } else {

                                XmlObject innerXml = parseObject(field.get(obj));

                                if (innerXml != null) {
                                    ctr++;
                                    xmlObject.addValue(innerXml);
                                }
                            }

                        }
                    }

                    field.setAccessible(false);
                }catch (IllegalAccessException il){
                    System.out.println("Cannot access field.");
                }

            }

            if(ctr == 0){
                xmlObject.setXmlType(XmlType.SINGLE);
            }

            return xmlObject;

        }
        return null;
    }

}
