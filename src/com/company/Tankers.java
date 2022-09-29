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
      // System.out.println(Arrays.toString(compartments));
        return compartments;
    }


    public void loadingCargo(int compartmentsCapacity, int volumneLevel){
        if (compartmentsCapacity > 10 ){
            System.out.println("The tankers have 0-9 comparments");
        }

        compartments[compartmentsCapacity] += volumneLevel;
        for (int com: compartments) {

            System.out.print(com);
        }
    }


    @Override
    public void utilityLevelOfCapacity(){
       int count = 0;
       int percent= 0;

       for (int com: compartments){
           if(com == 0){
                 count++;
                 percent = count * 100 / getCompartments().length;
           }
       }
        System.out.println();
              System.out.println(percent + "% tomme compartments tilbage");

    }





}
