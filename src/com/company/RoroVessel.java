package com.company;

public class RoroVessel extends Vessel {

    int totalAmountLaneMeters;
    int car;
    int truck;
    int carLength = 8;
    int truckLength = 30;

    @Override
    public void loadingCargo(int cargo){

    }

    @Override
    public void loadingCargo(int cars, int trucks){
    this.car = cars;
    this.truck = trucks;
        System.out.println("Ammount of cars: " + car);
        System.out.println("Ammount of trucks: " + trucks);
        System.out.println("Total amount: " + (car + truck));
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
