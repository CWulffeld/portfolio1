package com.company;

public class Tankers extends Vessel{

    //int compartments = 10;
    int nowCapacity;
    int maxCapacity = 10;
    int volume[] = new int[9];

    public Tankers(){

    }

    @Override
    public void loadingCargo(){

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

    @Override
    public void utilityLevelOfCapacity(){

    }

}
