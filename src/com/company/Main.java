package com.company;

public class Main {

    public static void main(String[] args){

        Vessel c = new containerVessel();
        c.loadingCargo(5);
        c.loadingCargo("DK",10,5,2);

        Vessel roro = new RoroVessel();
        roro.loadingCargo(5,5);

        Vessel t = new containerVessel();



    }
}
