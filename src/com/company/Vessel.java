package com.company;

public abstract class Vessel {
    String flagNation;
    int aDraft;
    int length;
    int width;


    //should compute the fraction of the total capacity that is used.
    // For tankers a compartment is assumed to be utilized if it is
    // not empty since it then cannot be used for other products.
    //public abstract void utilityLevelOfCapacity();


    // containervessel - capacity of containers -> udregn i procenttal.
    // roro  - numbers cars x meters, numbers trucks x meters / total capaciy of metersoflanes
    // capacity.. ?

    //tilføjet abstrakt metode -> polymorphism
    public abstract void utilityLevelOfCapacity();
}
