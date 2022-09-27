package com.company;


public class Main {

    public static void main(String[] args){

//Container Vessel

        containerVessel c = new containerVessel("DK",10,20);
        c.loadingCargo(4);
        c.utilityLevelOfCapacity();
/*
      containerVessel c = new containerVessel("DK", 10,10,10);
       c.getNowContainer();

        c.loadingCargo(6);
        c.getNowContainer();

        c.loadingCargo(2);
        c.getNowContainer();*/

//Tankers
     /*   Tankers t = new Tankers("DE", 10, 10, 10,8,5,5);
     t.loadingCargo(4,3);/*



        RoroVessel r= new RoroVessel("DK",10,10,10,300);
        r.getCar();
        r.getTruck();
        r.getCargoAmount();
        r.loadingCargo(3,6);
        r.utilityLevelOfCapacity();


      /*


        Vessel roro = new RoroVessel();
        roro.loadingCargo(5,5);

        Vessel t = new containerVessel();

*/

    }
}
