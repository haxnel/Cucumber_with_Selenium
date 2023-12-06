package com.example.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TombolCartHome {

    By tombolCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By tombolRemove = By.cssSelector("#remove-sauce-labs-backpack");

    private final WebDriver driver;

    public TombolCartHome(WebDriver driver){
        this.driver = driver;
    }

    public void addto_cart(){
        driver.findElement(tombolCart).click();
    }
    public void removing(){
        driver.findElement(tombolRemove).click();
    }

    public void seeAddtocart(){
        Assertions.assertTrue(driver.findElement(tombolCart).isDisplayed());
    }
    public void seeRemove(){
        Assertions.assertTrue(driver.findElement(tombolRemove).isDisplayed());
    }

}
