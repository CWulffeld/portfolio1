package com.company;

public abstract class Vessel {
    String flagNation;
    int aDraft;
    int length;
    int width;

    private int containerLength;
    private int containerWidth;

    //The method loadingCargo() is used to set relevant information for vessels
    // and make the cargo amount accessible through methods.
    //public abstract void loadingCargo(int cargo);
    //public abstract void loadingCargo(int cargo1,int cargo2 );
    //public abstract void loadingCargo(String flagNation,int aDraft , int length, int width );

    //public abstract void loadingCargo(int cargo);

    //The method loadingCargo() is used to set relevant information for vessels
    // and make the cargo amount accessible through methods.


    //should compute the fraction of the total capacity that is used.
    // For tankers a compartment is assumed to be utilized if it is
    // not empty since it then cannot be used for other products.
    public abstract void utilityLevelOfCapacity();

}
