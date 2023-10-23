/*

 * Class: CMSC203CRN22557

 * Instructor: Kuijt

 * Description: ManagementCompany takes the Plot and Property classes to create properties for a management company.

* Due: 10/22/2023


Platform/compiler: IntelliJ

 * I pledge that I have completed the programming


assignment independently. I have not copied the code


from a student or any source. I have not given my code


to any student.

Print your Name here: Kyle Poudyal

*/
package com.example.mgmcompany;

public class ManagementCompany {
    //Instances
    private String companyName;
    private String taxID;
    private double feePercentage;
    private Property[] properties;
    private Plot plot;
    int numberOfProperties;
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_DEPTH = 10;
    public static final int MGMT_WIDTH = 10;

    //Public Methods
    public ManagementCompany() {
        companyName = "";
        taxID = "";
        feePercentage = 0.0;
        plot = new Plot(0,0 , MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String name, String iD, double mgmFee) {
        companyName = name;
        taxID = iD;
        feePercentage = mgmFee;
        plot = new Plot(0,0 , MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String name, String iD, double mgmFee, int x, int y, int width, int depth) {
        companyName = name;
        taxID = iD;
        feePercentage = mgmFee;
        plot = new Plot(x, y, width, depth);
    }

    public ManagementCompany(ManagementCompany otherCompany) {
        companyName = otherCompany.companyName;
        taxID = otherCompany.taxID;
        feePercentage = otherCompany.feePercentage;
        plot = otherCompany.plot;
        properties = otherCompany.properties;
    }

    public int addProperty(String name, String city, double rent, String o) {
        if (isPropertiesFull()) {
            return -1;
        }
        if (properties == null) {
            return -2;
        }
        properties[numberOfProperties] = new Property(name, city, rent, o);
        if (!(plot.encompasses(properties[numberOfProperties].getPlot()))) {
            return -3;
        }

        for (Property p : properties) {
            if (p != null && p.getPlot().overlaps(properties[numberOfProperties].getPlot())) {
                return -4;
            }
        }
        numberOfProperties++;
        return numberOfProperties - 1;
    }

    public int addProperty(String name, String city, double rent, String o, int x, int y, int width, int depth) {
        if (isPropertiesFull()) {
            return -1;
        }
        if (properties == null) {
            return -2;
        }
        properties[numberOfProperties] = new Property(name, city, rent, o, x, y, width, depth);
        if (!(plot.encompasses(properties[numberOfProperties].getPlot()))) {
            return -3;
        }

        for (Property p : properties) {
            if (p != null && p.getPlot().overlaps(properties[numberOfProperties].getPlot())) {
                return -4;
            }
        }
        numberOfProperties++;
        return numberOfProperties - 1;
    }

    public int addProperty(Property property) {
        if (isPropertiesFull()) {
            return -1;
        }
        if (properties == null) {
            return -2;
        }
        properties[numberOfProperties] = new Property(property);
        if (!(plot.encompasses(properties[numberOfProperties].getPlot()))) {
            return -3;
        }

        for (Property p : properties) {
            if (p != null && p.getPlot().overlaps(properties[numberOfProperties].getPlot())) {
                return -4;
            }
        }
        numberOfProperties++;
        return numberOfProperties - 1;
    }
    public void removeLastProperty() {
        int position = numberOfProperties - 1;
        properties[position] = null;
    }

    public boolean isPropertiesFull() {
        if (numberOfProperties == MAX_PROPERTY) {
            return true;
        }
        else return false;
    }

    public int getPropertiesCount() {
        int count = 0;
        for (int i = 0; i < numberOfProperties; i++) {
            if (!(properties[i].getPropertyName().isEmpty())) {
                count++;
            }
        }
        return count;
    }

    public double getTotalRent() {
        double total = 0.0;
        for (int i = 0; i < numberOfProperties; i++) {
            total += properties[i].getRentAmount();
        }
        return total;
    }
    public Property getHighestRentProperty() {
        Property highestRent = properties[0];
        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getRentAmount() > highestRent.getRentAmount()) {
                highestRent = properties[i];
            }
        }
        return highestRent;
    }

    public boolean isManagementFeeValid() {
        if (feePercentage < 0 || feePercentage > 100) {
            return false;
        }
        else {
            return true;
        }
    }

    public String getName() {return companyName; }

    public String getTaxID() { return taxID; }

    public Property[] getProperties() { return properties; }

    public double getMgmFeePer() { return feePercentage; }

    public Plot getPlot() { return plot; }

    public String toString() {
        double totalFee = 0.0;
        String structure = "List of the properties for " + companyName + ", taxID: " + taxID + "\n"
                + "______________________________________________________\n";
        for (int i = 0; i < numberOfProperties; i++) {
            structure += (properties[i].toString() + "\n");
            totalFee += (feePercentage * properties[i].getRentAmount()) / 100;
        }
        structure += "______________________________________________________\n" + "\n total management Fee: " + totalFee;

        return structure;
    }
}

