package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {
    @Test
    void mainTest(){
        containerVessel c = new containerVessel("DK",10,20);
        int t = c;
        c = 30;
        assertEquals(30, c);







    }
}



