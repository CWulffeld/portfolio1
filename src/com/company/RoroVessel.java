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
        //this.car = cars;
        //this.truck = trucks;
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

    //get-metode skal slettes
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
