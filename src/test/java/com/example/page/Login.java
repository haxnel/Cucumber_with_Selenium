package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Login {
    WebDriver driver;

    By usernameInput = By.cssSelector("#user-name");
    By passwordInput = By.cssSelector("#password");
    By tombolLogin = By.cssSelector("#login-button");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void gotoPage (){
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void ClickLoginButton(){
        driver.findElement(tombolLogin).click();
    }

    public void PesanError(String error){
        assertTrue(driver.getPageSource().contains(error));
    }

}
