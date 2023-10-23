package com.example.mgmcompany;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.mgmcompany.Plot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlotTestStudent {
    private Plot plot1, plot2, plot3;

    @Before
    public void setUp() throws Exception {
        plot1 = new Plot(3, 4, 2, 2);
        plot2 = new Plot(4, 5, 1, 1);
        plot3 = new Plot(0,0, 10, 10);
    }

    @After
    public void tearDown() throws Exception {
        plot1 = plot2 = null;
    }

    @Test
    public void testOverlaps() {
        assertTrue(plot1.overlaps(plot2));
    }

    @Test
    public void testEncompasses() {
        assertTrue(plot3.encompasses(plot1));
    }

    @Test
    public void testToString() {
        assertEquals("4,5,1,1",plot2.toString());
    }

    @Test
    public void testGetX() {
        assertEquals(3, plot1.getX());
    }

    @Test
    public void testGetDepth() {
        assertEquals(10, plot3.getDepth());
    }

    @Test
    public void testGetWidth() {
        assertEquals(2, plot1.getWidth());
    }

    @Test
    public void testGetY() {
        assertEquals(5, plot2.getY());
    }
}
