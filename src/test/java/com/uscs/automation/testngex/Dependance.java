package com.uscs.automation.testngex;
import org.testng.annotations.*;

public class Dependance {

 @Test
    public void verifyloginscreen() {
        System.out.println("Login screen verified");
    }
    @Test(dependsOnMethods = {"verifyloginscreen"})
    public void verifylogin() {
        System.out.println("Login verified");
  }
    @Test(dependsOnMethods = {"verifylogin"})
    public void verifyhomepage() {
        System.out.println("Home page verified");
    }
    @Test(dependsOnMethods = {"verifyhomepage"})
    public void verifylogout() {
        System.out.println("Logout verified");
    }

}
