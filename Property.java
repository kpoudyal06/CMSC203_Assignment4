/*

* Class: CMSC203CRN22557

* Instructor: Kuijt

* Description: Property class uses the Plot class to create plots

* Due: 10/22/2023


Platform/compiler: IntelliJ

* I pledge that I have completed the programming


assignment independently. I have not copied the code


from a student or any source. I have not given my code


to any student.

Print your Name here: Kyle Poudyal

*/
package com.example.mgmcompany;

public class Property {
    //Private Instances
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;
    private Plot plot;

    //Public Methods

    public Property() {
        propertyName = "";
        city = "";
        rentAmount = 0.0;
        owner = "";
        plot = new Plot();
    }

    public Property(String propName, String c, double rent, String o) {
        propertyName = propName;
        city = c;
        rentAmount = rent;
        owner = o;
        plot = new Plot();
    }

    public Property(String propName, String c, double rent, String o, int x, int y, int width, int depth) {
        propertyName = propName;
        city = c;
        rentAmount = rent;
        owner = o;
        plot = new Plot(x, y, width, depth);
    }

    public Property(Property otherProperty) {
        plot = otherProperty.getPlot();
        propertyName = otherProperty.getPropertyName();
        city = otherProperty.getCity();
        rentAmount = otherProperty.getRentAmount();
        owner = otherProperty.getOwner();
    }

    public Plot getPlot() { return plot; }

    public String getPropertyName() { return propertyName; }

    public String getCity() { return city; }

    public double getRentAmount() { return rentAmount; }

    public String getOwner() { return owner; }

    public String toString() { return (propertyName + "," + city + "," + owner + "," + rentAmount); }
}
