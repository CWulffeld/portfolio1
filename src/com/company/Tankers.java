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

    public int getNowCapacity(){
        System.out.println(nowCapacity);
        return nowCapacity;
    }

    public void loadingCargo(int compartment) {
        nowCapacity = compartment;
        //nedenstående slettes
        int capacityAmount = maxCapacity - nowCapacity;
        System.out.println("Max capacity on TV: " + maxCapacity);
        System.out.println("amount of compartments on TV: " + nowCapacity);
        System.out.println("amount of compartments left on TV: " + capacityAmount);

    }
    @Override
    public void utilityLevelOfCapacity(){

    }




}
