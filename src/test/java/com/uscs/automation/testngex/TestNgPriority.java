package com.uscs.automation.testngex;
import org.testng.annotations.Test;
public class TestNgPriority {

    @Test
    public void priority() {
        System.out.println("Test Method 1");
    }
    @Test(priority = 1)
    public void priority1() {
        System.out.println("Test Method 2 with priority 1");
    }
    @Test(priority = 2)
    public void priority2() {
        System.out.println("Test Method 3 with priority 2");
    }
    @Test(priority = 3)
    public void priority3() {
        System.out.println("Test Method 4 with priority 3");
    }
    @Test(priority = 4)
    public void priority4() {
        System.out.println("Test Method 5 with priority 4");
    }
    @Test
    public void nopriority() {
        System.out.println("Test Method 6 with priority 5");
    }
}
