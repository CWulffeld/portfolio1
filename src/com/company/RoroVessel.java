package com.company;

public class RoroVessel extends Vessel {

    private int totalAmountLaneMeters;
    private int car;
    private int truck;
    private int carLength = 8;
    private int truckLength = 30;


    public RoroVessel(String flagNation,int aDraft , int length, int width,int totalAmountLaneMeters){
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        this.totalAmountLaneMeters = totalAmountLaneMeters;
    }

    public int getCar() {

        return car;
    }

    public int getTruck() {
        return truck;
    }

    public void loadingCargo(int cars, int trucks){
    this.car = cars;
    this.truck = trucks;
    }

    @Override
    public void utilityLevelOfCapacity(){
        int carLengthAmount = getCar() * carLength; //Samlet længde for alle bilerne 4*8
        int truckLengthAmount = getTruck() * truckLength; //SAmlet længde for alle trucks 2*30
        int totalAmountLength = carLengthAmount + truckLengthAmount; //Samlet brugt laneMeters
        //System.out.println("RORO Vessel amount length " + totalAmountLength);

        double percent = totalAmountLength*100/totalAmountLaneMeters; //Procent andel som anvedes
        System.out.println("Procent RORO " + percent + " %");


    }




}
