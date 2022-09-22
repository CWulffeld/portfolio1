package com.company;

public class Main {

    public static void main(String[] args){

//Container Vessel

      containerVessel c = new containerVessel("DK", 10,10,10);
       c.getNowContainer();

        c.loadingCargo(6);
        c.getNowContainer();

        c.loadingCargo(2);
        c.getNowContainer();

//Tankers
        Tankers t = new Tankers("DE", 10, 10, 10);
        t.getNowCapacity();

        t.loadingCargo(8);
        t.getNowCapacity();



        RoroVessel r= new RoroVessel("DK",10,10,10,100,5,15);
        r.getCar();
        r.getTruck();
        r.getCargoAmount();
        r.loadingCargo(3,6);

      /*


        Vessel roro = new RoroVessel();
        roro.loadingCargo(5,5);

        Vessel t = new containerVessel();

*/

    }
}
