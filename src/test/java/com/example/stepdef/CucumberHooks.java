package com.example.stepdef;


import com.example.BaseTesting;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTesting {
    @Before
    public void beforeTest(){
        GetDriver();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
