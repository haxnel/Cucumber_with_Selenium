package com.example.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Home {
    By product = By.cssSelector("#inventory_container > div");
    By tombolBurger = By.cssSelector("#menu_button_container > div > div:nth-child(1) > div");
    By tombolLogOut = By.cssSelector("#logout_sidebar_link");
    private WebDriver driver;

    public Home(WebDriver driver){
        this.driver = driver;
    }

    public void validHome(){
        WebElement produtElement = driver.findElement(product);
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(100));
        wait.until(ExpectedConditions.visibilityOf(produtElement));
        Assertions.assertTrue(produtElement.isDisplayed());
    }

    public void validTombolBurger (){
        driver.findElement(tombolBurger);
    }
    public void validTombolLogout(){
        driver.findElements(tombolLogOut);
    }
}
