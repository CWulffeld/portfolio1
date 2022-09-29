package com.company;

import java.util.Arrays;

public class Tankers extends Vessel{
    private int compartments[] = new int[10];
    
   public Tankers (String flagNation,int aDraft , int length, int width){
        super.flagNation = flagNation;
        super.aDraft = aDraft;
        super.length = length;
        super.width = width;
    }
    
    public int[] getCompartments() {
       System.out.println(Arrays.toString(compartments));
        return compartments;
    }


    public void loadingCargo(int compartmentsCapacity, int volumneLevel){
        if (compartmentsCapacity > 10 ){
            System.out.println("The tankers have 1-10 comparments");
        }

        compartments[compartmentsCapacity] += volumneLevel;
        for (int com: compartments) {
            System.out.print(com);
        }
    }

    @Override
    public void utilityLevelOfCapacity(){
       int count = 0;

       for (int com: compartments){
           if(com == 0){
               System.out.println("test");
               count++;
               System.out.println(count);
           }
       }

       //int percent = count*100/get




       // nowCapacity = getNowCapacity();
    //   int percent = nowCapacity * 100 / maxCapacity;
      //  System.out.println("Procent" + percent + "%");


    }



}
