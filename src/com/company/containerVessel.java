package com.company;

import java.util.Scanner;

public class containerVessel extends Vessel{
    private int nowContainer;
    private int maxContainer;
    private int containerWidth;
    private int containerLength;


public containerVessel(String flagNation, int length, int width, int nowContainer  ){
    super.flagNation= flagNation;
    super.length = length;
    super.width = width;
    this.nowContainer = nowContainer;
    this.maxContainer = 10;

    //?? hvad skal vi bruge container length og width til??
    this.containerLength = 10;
    this.containerWidth = 15;

}
    public int getNowContainer() {
    //sout linje skal slettes
        System.out.println(nowContainer);
        return nowContainer;
    }


    //The method loadingCargo() is used to set relevant information for vessels
    // and make the cargo amount accessible through methods.

    public void loadingCargo(int numberOfContainers) {
        nowContainer = numberOfContainers;

        //linjer forneden skal slettes
       int containerAmount = maxContainer - nowContainer;
        System.out.println("Max capacity on CV: " + maxContainer);
        System.out.println("Amount of Containers on CV: " + nowContainer);
        System.out.println("Amount of containers left CV: " + containerAmount);

    }


    //should compute the fraction of the total capacity that is used.
    // For tankers a compartment is assumed to be utilized if it is not empty since it then cannot be used for other products.
    @Override
    public void utilityLevelOfCapacity(){

    }

}
