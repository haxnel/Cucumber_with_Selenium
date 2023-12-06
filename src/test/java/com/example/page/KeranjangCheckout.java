package com.example.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeranjangCheckout {
    By addtochart1 = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By iconKeranjang = By.cssSelector("#shopping_cart_container > a");
    By TombolContinueShop = By.cssSelector("#continue-shopping");
    By tombolcontinue = By.cssSelector("#continue");
    By TombolFinish = By.cssSelector("#finish");
    By TombolBackHome = By.cssSelector("#back-to-products");
    By TombolCancel = By.cssSelector("#cancel");
    By TombolCheckOut= By.cssSelector("#checkout");
    By TombolRemove = By.cssSelector("#remove-sauce-labs-backpack");
    By inputNama= By.cssSelector("#first-name");
    By inputCodePostal = By.cssSelector("#postal-code");
    By inputLastName = By.cssSelector("#last-name");
    By item1 = By.cssSelector("#cart_contents_container > div > div.cart_list > div.removed_cart_item");

    private final WebDriver driver;

    public KeranjangCheckout(WebDriver driver){
        this.driver = driver;
    }

    public void AddChart(){
        driver.findElement(addtochart1).click();
    }
    public void IconKeranjang(){
        driver.findElement(iconKeranjang).click();
    }
    public void TombolContinue(){
        driver.findElement(tombolcontinue).click();
    }

    public void NamaInput(String nama){
        driver.findElement(inputNama).sendKeys(nama);
    }
    public void LastnamaInput(String last){
        driver.findElement(inputLastName).sendKeys(last);
    }
    public void postalInput(String postal){
        driver.findElement(inputCodePostal).sendKeys(postal);
    }

    public void ContinueShop(){
        driver.findElement(TombolContinueShop).click();
    }

    public void Finish(){
        driver.findElement(TombolFinish).click();
    }

    public void BackHome(){
        driver.findElement(TombolBackHome).click();
    }

    public void removeTombol (){
        driver.findElement(TombolRemove).click();
    }

    public void Cancel(){
        driver.findElement(TombolCancel).click();
    }

    public void Tombolcekout(){
        driver.findElement(TombolCheckOut).click();
    }

    public void PembayaranSukses(String sukses){
        Assertions.assertTrue(driver.getPageSource().contains(sukses));
    }

    public void Itemsatu(){
        WebElement Item = driver.findElement(item1);
        Assertions.assertFalse(Item.isDisplayed());
    }

    public void kosongLastName(){
        WebElement box = driver.findElement(inputLastName);
        Assertions.assertTrue(box.getText().isEmpty());
    }
}
