package com.example.stepdef;

import com.example.BaseTesting;
import com.example.page.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class HomeDef extends BaseTesting {

    Home home;
    @Then("User berada di Home page")
    public void userBeradaDiHomePage() {
        home = new Home(driver);
        home.validHome();
    }

    @And("User click tombol hamburger")
    public void userClickTombolHamburger() {
        home.validTombolBurger();
    }

    @When("User Click text Logout")
    public void userClickTextLogout() {
        home = new Home(driver);
        home.validTombolLogout();
    }

}
