/*
 *
 *
 * Copyright (C) 2007 Pingtel Corp., certain elements licensed under a Contributor Agreement.
 * Contributors retain copyright to elements licensed under a Contributor Agreement.
 * Licensed to the User under the LGPL license.
 *
 * $
 */
package org.sipfoundry.sipxconfig.phone.ciscospa;

import junit.framework.TestCase;

public class ciscospaPhoneTest extends TestCase {

//    private ciscospa m_phone;

//    @Override
//    protected void setUp() {
//        ciscospaModel model = new ciscospaModel("ciscospaPhone");
//        model.setMaxLineCount(3);
//        model.setModelId("ciscospa508g");
//        model.setProfileTemplate("ciscospa/config.vm");
//        model.setModelDir("ciscospa");
//        model.setPsn("508g");
//        m_phone = new ciscospaPhone();
//        m_phone.setModel(model);
//        PhoneTestDriver.supplyTestData(m_phone);
//    }

    public void testGetSettings() {
//        assertNotNull(m_phone.getSettings());
    }

//    public void testGenerate7960Profiles() throws Exception {
//        MemoryProfileLocation location = TestHelper.setVelocityProfileGenerator(m_phone);
//        m_phone.generateFiles(location);
//        String expected = IOUtils.toString(this.getClass().getResourceAsStream("spa508g.cfg"));
//        assertEquals(expected, location.toString());
//    }

//    public void testCopyProfile() {
//       ProfileGenerator pg = createMock(ProfileGenerator.class);
//        pg.copy(null, "ciscospa/default.cfg", "spa508g.cfg");
//        replay(pg);

//        m_phone.setProfileGenerator(pg);
//        m_phone.copyFiles(null);

//        verify(pg);
//    }

//    public void testGetProfileFilename() {
//        m_phone.setSerialNumber("1a2b33445566");
//        assertEquals("spa1A2B33445566.cfg", m_phone.getProfileFilename());
//    }
}
