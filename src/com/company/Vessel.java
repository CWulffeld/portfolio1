package com.company;

public abstract class Vessel {
    String flagNation;
    int aDraft;
    int length;
    int width;


    // containervessel - capacity of containers -> udregn i procenttal.
    // roro  - numbers cars x meters, numbers trucks x meters / total capaciy of metersoflanes
    // capacity.. ?

    //tilføjet abstrakt metode -> polymorphism
    public abstract void utilityLevelOfCapacity();
}
