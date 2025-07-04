package com.uscs.automation.testngex;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class dataProviderEx {
    @Test(dataProvider = "Detailprovider")
    public void DisplayDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @DataProvider
    public static Object[][] Detailprovider() {
        return new Object[][] {
            {"sahan", 25},
            {"supun", 50},
            {"kaushi", 35}
        };
    }
}
