package com.example.stepdef;

import com.example.BaseTesting;
import com.example.page.TombolCartHome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TombolCartDef extends BaseTesting {
    TombolCartHome tombolCartHome;
    @Then("User melihat tombol remove")
    public void userMelihatTombolRemove() {
        tombolCartHome.seeRemove();
    }

    @When("User click remove")
    public void userClickRemove() {
        tombolCartHome.removing();
    }

    @Then("User melihat tombol add to cart")
    public void userMelihatTombolAddToCart() {
        tombolCartHome.seeAddtocart();
    }

    @When("User click Add to cart di Home")
    public void userClickAddToCartDiHome() {
        tombolCartHome = new TombolCartHome(driver);
        tombolCartHome.addto_cart();
    }

    @Then("User dapat melakukan remove")
    public void userDapatMelakukanRemove() {
        tombolCartHome.seeRemove();
    }
}
