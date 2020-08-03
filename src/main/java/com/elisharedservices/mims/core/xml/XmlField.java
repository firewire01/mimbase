package com.elisharedservices.mims.core.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by marlon on 4/19/17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlField {

    public final static String STATIC = "_STATIC_";

    String name();
}
