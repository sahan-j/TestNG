package com.uscs.automation.testngex;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamEx {
    @Test
    @Parameters("browserName")
    public void display(@Optional("Firefox") String browserName) {
        System.out.println("Browser Name is:\n" + browserName);
    }
}
