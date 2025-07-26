package com.ucsc.automationcc.testngex;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip {
    @Test
    public void skip$1() {
        System.out.println("A");
        if (true)
            throw new SkipException("Test will Skip from this point");
            System.out.println("B");
        }
@Test(enabled = false)
    public void skip$2() {
        System.out.println("A");
        System.out.println("B");
    }
}

