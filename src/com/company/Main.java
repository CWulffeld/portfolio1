package com.company;

public class Main {

    public static void main(String[] args){

        Vessel c = new containerVessel("hej",50,40,6);
        c.loadingCargo();

        Vessel roro = new RoroVessel();
        roro.loadingCargo();

    }
}
