/*

* Class: CMSC203CRN22557

* Instructor: Kuijt

* Description: Plot class takes information to create a plot.

* Due: 10/22/2023


Platform/compiler: IntelliJ

* I pledge that I have completed the programming


assignment independently. I have not copied the code


from a student or any source. I have not given my code


to any student.

Print your Name here: Kyle Poudyal

*/
package com.example.mgmcompany;

public class Plot {
    // Private Instances
    private int x;
    private int y;
    private int depth;
    private int width;

    //Public Methods
    public Plot() {
        width = 1;
        depth = 1;
    }

    public Plot(int x1, int y1, int width1, int depth1) {
        x = x1;
        y = y1;
        width = width1;
        depth = depth1;
    }

    public Plot(Plot otherPlot) {
        x = otherPlot.x;
        y = otherPlot.y;
        width = otherPlot.width;
        depth = otherPlot.depth;
    }

    public boolean overlaps(Plot plot) {
        if (x < plot.x && plot.x < (x + width) && y < plot.y && plot.y < (y + depth)) {
            return true;
        }
        else return false;
    }

    public boolean encompasses(Plot plot) {
        if (x <= plot.x && plot.x <= (x + width) && y <= plot.y && plot.y <= (y + depth)) {
            return true;
        }
        else return false;
    }

    public void setX(int x1) { x = x1; }

    public void setY(int y1) { y = y1; }

    public void setWidth(int width1) { width = width1; }

    public void setDepth(int depth1) { depth = depth1; }

    public int getX() {return x; };

    public int getY() { return y; }

    public int getWidth() { return width; }

    public int getDepth() { return depth; }

    public String toString() { return (x + "," + y + "," + width + "," + depth); }
}
