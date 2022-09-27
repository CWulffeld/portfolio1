package com.company;

public class Tankers extends Vessel{


    private int compartments;
    private int nowCapacity;
    private int maxCapacity;
    private int maxCompartment;
    private int minComparment;
    private int volume[] = new int[9];



   public Tankers (String flagNation,int aDraft , int length, int width,int compartment, int nowCapacity, int maxCapacity){
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
        this.compartments = compartment;
        this.nowCapacity = nowCapacity;
        this.maxCapacity = maxCapacity;
        this.maxCompartment = 10;
        this.minComparment = 1;
    }

    public int getCompartments() {
       return compartments;
    }

    public int getNowCapacity(){
        System.out.println(nowCapacity);
        return nowCapacity;
    }

    public void loadingCargo(int numberOfCompartment, int nowCapacity){
      this.compartments = numberOfCompartment; //Sætter nummeret af comparments
      this.nowCapacity = nowCapacity; //sætter nummeret af nowcapacity

        //nedenstående slettes
        int freeCapacityAmount = maxCapacity - nowCapacity;
        System.out.println("Max capacity on TV: " + maxCapacity);
        System.out.println("amount of compartments on tankers are filled: " + compartments);
        System.out.println("amount of compartments left on tankers: " + freeCapacityAmount);
        System.out.println("Amount of compartments used " + (maxCompartment - compartments)); //total amount of comparmemt used
    }






}
