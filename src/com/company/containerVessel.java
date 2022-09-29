package com.company;

public class containerVessel extends Vessel {
    private int nowContainer;
    private int maxContainer;

    //Constructor
    public containerVessel(String flagNation, int length, int width) {
        super.flagNation = flagNation; //Fra Vessel (super klassen)
        super.length = length; //Fra Vessel (super klassen)
        super.width = width; //Fra Vessel (super klassen
        this.maxContainer = 10; // Specifik nummer til maxContainer
    }

    public int getNowContainer() {
        return nowContainer;
    }


    public void loadingCargo(int numberOfContainers) {
        if (numberOfContainers < maxContainer && numberOfContainers > 0) {
            nowContainer = numberOfContainers;
        } else {
            System.out.println("Amount of containers not available. Max. capacity: 10, min. capacity: 0");
        }
    }

    @Override
    public void utilityLevelOfCapacity() {
        nowContainer = getNowContainer();
        int percent = nowContainer * 100 / maxContainer;
        System.out.println("Procent " + percent + " %");

    }

}
