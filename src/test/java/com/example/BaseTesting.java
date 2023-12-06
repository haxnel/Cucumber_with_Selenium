package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTesting {
    protected static WebDriver driver;

    public void GetDriver(){
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver(options);

        driver = WebDriverManager.chromedriver().create();
    }
}