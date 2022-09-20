package com.company;

import java.util.Scanner;

public class containerVessel extends Vessel{

    int cargo; //Kan indeholde specifikt antal af cargo (Måske det skal være protected)
    int nowContainer;
    int maxContainer;
    int containerWidth;
    int containerLength;


public containerVessel(String flagNation, int length, int width, int nowContainer){
    super.flagNation= flagNation;
    super.length = length;
    super.width = width;
    this.nowContainer = nowContainer;
    this.maxContainer = 10;
    this.containerLength = 10;
    this.containerWidth = 15;

}


//The method loadingCargo() is used to set relevant information for vessels
    // and make the cargo amount accessible through methods.
   /* @Override
    public void loadingCargo(String flagNation, int length, int width, int nowContainer, int maxContainer) {
        super.flagNation= flagNation;
        super.length = length;
        super.width = width;
        this.nowContainer = nowContainer;
        this.maxContainer = maxContainer;
    }*/




    @Override
    public void loadingCargo() {
        int containerAmount = maxContainer - nowContainer;
        System.out.println("Maximum capacity of containers on the vessel: " + maxContainer);
        System.out.println("Amount of containers on the container vessel: " + nowContainer);
        System.out.println("Amount of containers on the container vessel space left: " + containerAmount);

    }

    @Override
    public void loadingCargo(int cargo1, int cargo2){
    }

    @Override
    public void loadingCargo(String flagNation,int aDraft , int length, int width ){
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        System.out.println("FlagNation: " + flagNation);
    }



    //should compute the fraction of the total capacity that is used.
    // For tankers a compartment is assumed to be utilized if it is not empty since it then cannot be used for other products.
    @Override
    public void utilityLevelOfCapacity(){

    }

}
