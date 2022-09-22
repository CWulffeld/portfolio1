package com.company;

public class Tankers extends Vessel{

    private int compartments = 10;
    private int nowCapacity;
    private int maxCapacity = 10;
    private int volume[] = new int[9];


   public Tankers (String flagNation,int aDraft , int length, int width ){
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
