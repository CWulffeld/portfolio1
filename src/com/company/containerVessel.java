package com.company;

public class containerVessel extends Vessel{
    private int nowContainer;
    private int maxContainer;

//Constructor
public containerVessel(String flagNation, int length, int width){
    super.flagNation= flagNation; //Fra Vessel (super klassen)
    super.length = length; //Fra Vessel (super klassen)
    super.width = width; //Fra Vessel (super klassen)
    this.nowContainer = nowContainer; //Er dette overhovedet nædvendigt, dette sættes i loadingCargi metode
    this.maxContainer = 10; // Specifik nummer til maxContainer
}
    public int getNowContainer() {
        return nowContainer;
    }


    //The method loadingCargo() is used to set relevant information for vessels
    // and make the cargo amount accessible through methods.
    public void loadingCargo(int numberOfContainers) {
    if(numberOfContainers < maxContainer && numberOfContainers>0){
            nowContainer = numberOfContainers;
    }else{
            System.out.println("Amount of containers not available. Max. capacity: 10, min. capacity: 0");
        }
    }


    //should compute the fraction of the total capacity that is used.
    // For tankers a compartment is assumed to be utilized if it is not empty since it then cannot be used for other products.

    @Override
    public void utilityLevelOfCapacity(){
    nowContainer = getNowContainer();
    int percent = nowContainer * 100 / maxContainer;
        System.out.println("Procent " + percent + " %");

    }

}
