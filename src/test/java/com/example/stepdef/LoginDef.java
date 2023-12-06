package com.example.stepdef;
import com.example.BaseTesting;
import com.example.page.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef extends BaseTesting {

    Login login;
    @Given("User berada di Login page")
    public void userBeradaDiLoginPage(){
        login = new Login(driver);
        login.gotoPage();
    }
    @And("User memasukan username {string}")
    public void userMemasukanUsername(String user) {
        login.inputUsername(user);
    }
    @And("User memasukan password {string}")
    public void userMemasukanPassword(String pass) {
        login.inputPassword(pass);
    }
    @When("User click tombol login")
    public void userClickTombolLogin() {
        login.ClickLoginButton();
    }
    @Then("user melihat pesan error {string}")
    public void userMelihatPesanError(String error){
        login.PesanError(error);
    }
}
