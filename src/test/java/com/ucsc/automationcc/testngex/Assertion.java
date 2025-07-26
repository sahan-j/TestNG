package com.ucsc.automationcc.testngex;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
    @Test
    public void hardAssertionEx() {
        System.out.println("A");
        System.out.println("B");
        Assert.assertEquals("ABD", "ABC", "Expected String is not met...");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
    }

    @Test
    public void softAssertionEx() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("A");
        softAssert.assertEquals("ABD", "ABC", "Expected String is not met...");
        System.out.println("B");
        softAssert.assertTrue(false, "Expected String is not met...");
        System.out.println("C");
        softAssert.assertTrue(true, "Expected String is not met...");
        System.out.println("D");
        softAssert.assertEquals("ABD", "ABC", "Expected String is not met...");
        System.out.println("E");
        softAssert.assertTrue(true,);
        System.out.println("F");
        softAssert.assertAll();
    }
}
