package com.example.stepdef;

import com.example.BaseTesting;
import com.example.page.KeranjangCheckout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutDef extends BaseTesting {

    KeranjangCheckout checkout;

    @And("User click Add to chart")
    public void userClickAddToChart() throws InterruptedException {
        checkout = new KeranjangCheckout(driver);
        checkout.AddChart();
        Thread.sleep(2000);
    }

    @And("User click icon keranjang")
    public void userClickIconKeranjang() throws InterruptedException {
        checkout = new KeranjangCheckout(driver);
        checkout.IconKeranjang();
        Thread.sleep(2000);
    }

    @And("User click checkout")
    public void userClickCheckout() throws InterruptedException {
        checkout.Tombolcekout();
        Thread.sleep(2000);
    }

    @And("User memasukan nama {string}")
    public void userMemasukanNama(String nama) {
        checkout.NamaInput(nama);
    }

    @And("User memasukan nama belakang {string}")
    public void userMemasukanNamaBelakang(String Last) {
        checkout.LastnamaInput(Last);
    }
    @And("User memasukan postal code {string}")
    public void userMemasukanPostalCode(String postal) {
        checkout.postalInput(postal);
    }

    @And("User click continue")
    public void userClickContinue() {
        checkout.TombolContinue();
    }

    @When("User click Finish")
    public void userClickFinish() {
        checkout.Finish();
    }

    @Then("User dapat melihat pesan {string}")
    public void userDapatMelihatPesan(String sukses) {
        checkout.PembayaranSukses(sukses);
    }

    @When("User click remove pada barang")
    public void userClickRemovePadaBarang() throws InterruptedException {
        checkout.removeTombol();
        Thread.sleep(2000);
    }

    @Then("Barang sudah terhapus")
    public void barangSudahTerhapus() {
        checkout.Itemsatu();
    }

    @When("User click Continue Shopping")
    public void userClickContinueShopping() {
        checkout.ContinueShop();
    }

    @When("User click cancel")
    public void userClickCancel() {
        checkout.Cancel();
    }

    @Then("Box Nama belakang tidak terisi")
    public void boxNamaBelakangTidakTerisi() throws InterruptedException {
        Thread.sleep(2000);
        checkout.kosongLastName();
    }
}
