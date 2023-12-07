package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.example"},
        features = {"src/test/resources"},
        plugin = {"pretty","html:reports/html/index.html","json:reports/json/cucumber.json"}
)
public class CucumberTesting {

}
