package com.example.mgmcompany;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.mgmcompany.ManagementCompany;
import com.example.mgmcompany.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
    Property sample;
    ManagementCompany mgmc;

    @Before
    public void setUp() throws Exception {
        mgmc= new ManagementCompany("Davis", "1234512",12);
    }

    @After
    public void tearDown() throws Exception {
        mgmc=null;
    }

    @Test
    public void testAddProperty() {
        sample = new Property ("Home", "Germantown", 1234, "George Washington",4,4,2,1);
        assertEquals(mgmc.addProperty(sample),0,0);
    }

    @Test
    public void testGetPropertiesCount() {
        sample = new Property ("Home", "Germantown", 1234, "George Washington",4,4,2,1);
        assertEquals(mgmc.addProperty(sample),0,0);
        assertEquals(mgmc.getPropertiesCount(), 1);
    }

    @Test
    public void testToString() {
        sample = new Property ("Home", "Germantown", 1234, "George Washington",4,4,2,1);
        assertEquals(mgmc.addProperty(sample), 0);	//property has been successfully added to index 0
        String expectedString = "List of the properties for Davis, taxID: 1234512\n"
                + "______________________________________________________\n"
                + "Home,Germantown,George Washington,1234.0\n"
                + "______________________________________________________\n"
                +"\n"
                + " total management Fee: 148.08";
        System.out.println(expectedString);
        System.out.println(mgmc.toString());
        assertEquals(expectedString, mgmc.toString());
    }

    @Test
    public void testGetTotalRent() {
        sample = new Property ("Home", "Germantown", 1234, "George Washington",4,4,2,1);
        assertEquals(mgmc.addProperty(sample), 0);
        assertEquals(mgmc.getTotalRent(), 1234.0);
    }

    @Test
    public void testIsManagementFeeValid() {
        assertEquals(mgmc.isManagementFeeValid(), true);
    }

    @Test
    public void testIsPropertiesFull() {
        assertEquals(mgmc.isPropertiesFull(), false);
    }

    @Test
    public void testGetName() {
        assertEquals(mgmc.getName(), "Davis");
    }

    @Test
    public void testGetMgmFeePer() {
        assertEquals(mgmc.getMgmFeePer(), 12.0);
    }
}
