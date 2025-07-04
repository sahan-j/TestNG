package com.uscs.automation.testngex;
import org.testng.annotations.*;

public class ExecutionOrder {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @Test
    public void myTest() {
        System.out.println("myTest");
    }
    @Test
    public void myTest2() {
        System.out.println("myTest2");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}