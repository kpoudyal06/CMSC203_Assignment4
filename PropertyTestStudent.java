package com.example.mgmcompany;

import static org.junit.Assert.*;

import com.example.mgmcompany.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PropertyTestStudent {
    Property sample;

    @Before
    public void setUp() throws Exception {
        sample = new Property("Jackson", "Germantown", 1234.00, "Steven");
    }

    @After
    public void tearDown() throws Exception {
        sample = null;
    }

    @Test
    public void testGetPropertyName() {
        assertEquals("Jackson", sample.getPropertyName());
    }

    @Test
    public void testGetRentAmount() {
        assertEquals(1234.00, sample.getRentAmount(), 0.001);
    }

    @Test
    public void testGetPlot() {
        assertEquals(0, sample.getPlot().getX());
        assertEquals(0, sample.getPlot().getY());
        assertEquals(1, sample.getPlot().getWidth());
        assertEquals(1, sample.getPlot().getDepth());
    }

    @Test
    public void testToString() {
        assertEquals("Jackson,Germantown,Steven,1234.0",sample.toString());
    }

    @Test
    public void testGetOwner() {
        assertEquals("Steven", sample.getOwner());
    }

    @Test
    public void testGetCity() {
        assertEquals("Germantown", sample.getCity());
    }

}
