package com.company;

public class RoroVessel extends Vessel {

    private int totalAmountLaneMeters;
    private int car;
    private int truck;
    private int carLength = 8;
    private int truckLength = 30;


    public RoroVessel(String flagNation,int aDraft , int length, int width,int totalAmountLaneMeters, int cars, int trucks ){
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        this.totalAmountLaneMeters = totalAmountLaneMeters;
        this.car = cars;
        this.truck = trucks;
    }

    public int getCar() {
        //sout skal slettes
        System.out.println(car);
        return car;
    }

    public int getTruck() {
        //sout skal slettes
        System.out.println(truck);
        return truck;
    }

    public int getCargoAmount(){
        //sout skal slettes
        System.out.println(car + truck);
       return car + truck;
    }

    public void loadingCargo(int cars, int trucks){
    this.car = cars;
    this.truck = trucks;

    //linjerne nedenunder skal slettes
        System.out.println("Amount of cars: " + car);
        System.out.println("Amount of trucks: " + trucks);
        System.out.println("Total amount: " + (car + truck));
    }




}
