package com.company;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {
    @Test
    void mainTest(){

    }

    @Test
    void getContainerVessel(){
        containerVessel c = new containerVessel("DK",10,20);
        assertEquals(0,c.getNowContainer());

    }

    @Test
    void Tankers(){
        Tankers t = new Tankers("DE", 15, 20, 20);
        assertEquals(0,t.getCompartments());


    }


    @Test
    void RoroVessel(){
        RoroVessel RR = new RoroVessel("DK",10,10,10,300);
        assertEquals(0,RR.getTruck());
        assertEquals(0,RR.getCar());
    }
}



