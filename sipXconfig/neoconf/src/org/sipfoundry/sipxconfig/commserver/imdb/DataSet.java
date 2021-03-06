/*
 *
 *
 * Copyright (C) 2007 Pingtel Corp., certain elements licensed under a Contributor Agreement.
 * Contributors retain copyright to elements licensed under a Contributor Agreement.
 * Licensed to the User under the LGPL license.
 *
 * $
 */
package org.sipfoundry.sipxconfig.commserver.imdb;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.enums.Enum;

/**
 * Each enum corresponds to a single IMDB table
 */
public class DataSet extends Enum {
    public static final DataSet ALIAS = new DataSet("alias");
    public static final DataSet CREDENTIAL = new DataSet("credential");
    public static final DataSet PERMISSION = new DataSet("permission");
    public static final DataSet CALLER_ALIAS = new DataSet("calleralias");
    public static final DataSet USER_LOCATION = new DataSet("userlocation");
    public static final DataSet USER_FORWARD = new DataSet("userforward");
    public static final DataSet USER_STATIC = new DataSet("userstatic");
    public static final DataSet ATTENDANT = new DataSet("attendant");
    public static final DataSet SPEED_DIAL = new DataSet("speeddial");
    public static final DataSet MAILSTORE = new DataSet("mailstore");
    public static final DataSet OPENACD = new DataSet("openacd");
    public static final DataSet E911 = new DataSet("e911");

    private String m_fieldName;

    public DataSet(String dataSet) {
        super(dataSet);
    }

    /**
     * @return name that is used in spring to register the bean of this type
     */
    public String getBeanName() {
        return getName() + "DataSet";
    }

    public static DataSet getEnum(String name) {
        return (DataSet) getEnum(DataSet.class, name);
    }

    public static Map getEnumMap() {
        return getEnumMap(DataSet.class);
    }

    public static List<DataSet> getEnumList() {
        return getEnumList(DataSet.class);
    }

    public static Iterator iterator() {
        return iterator(DataSet.class);
    }

    public String getFieldName() {
        return m_fieldName;
    }
}
