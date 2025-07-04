package com.ucsc.automation.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelEx {

    public long startExecutionTimeMills;

    @BeforeClass
    public void getStartTimeMills(){
        startExecutionTimeMills = System.currentTimeMillis();
    }

    @AfterClass
    public void endExecutionTimeMills(){
        long endExecutionTimeMills = System.currentTimeMillis();
        System.out.println("Test class ended at: " + endExecutionTimeMills + " ms");
        System.out.println("Total execution time: " + (endExecutionTimeMills - startExecutionTimeMills) + " ms");
    }

    @Test
    public void method1() throws InterruptedException {
        for(int i=0;i<5;i++){
            Thread.sleep(5000);
            System.out.println("method1 :: "+ i);
        }
    }

    @Test
    public void method2() throws InterruptedException {
        for(int i=0;i<5;i++){
            Thread.sleep(3000);
            System.out.println("method2 :: "+ i);
        }
    }

    @Test
    public void method3() throws InterruptedException {
        for(int i=0;i<5;i++){
            Thread.sleep(2000);
            System.out.println("method3 :: "+ i);
        }
    }

    @Test
    public void method4() throws InterruptedException {
        for(int i=0;i<5;i++){
            Thread.sleep(1000);
            System.out.println("method4 :: "+ i);
        }
    }
}