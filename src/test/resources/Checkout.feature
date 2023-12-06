Feature: Checkout

  @Checkout-Barang
  Scenario: Dapat melakukan checkout suatu barang
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    And User berada di Home page
    And User click Add to chart
    And User click icon keranjang
    And User click checkout
    And User memasukan nama "Kumala"
    And User memasukan nama belakang "Lakumala"
    And User memasukan postal code "11167"
    And User click continue
    When User click Finish
    Then User dapat melihat pesan "Thank you for your order!"

   @Remove-barang
   Scenario: Menghapus barang dari keranjang
     Given User berada di Login page
     And User memasukan username "standard_user"
     And User memasukan password "secret_sauce"
     And User click tombol login
     And User berada di Home page
     And User click Add to chart
     And User click icon keranjang
     When User click remove pada barang
     Then Barang sudah terhapus

   @Continue_Shopping
   Scenario: Dapat kembali ke Home page setelah masuk ke keranjang
     Given User berada di Login page
     And User memasukan username "standard_user"
     And User memasukan password "secret_sauce"
     And User click tombol login
     And User berada di Home page
     And User click icon keranjang
     When User click Continue Shopping
     Then User berada di Home page

  @Cancel-Shopping
  Scenario: Dapat melakukan cancel saat akan checkout
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    And User berada di Home page
    And User click Add to chart
    And User click icon keranjang
    And User click checkout
    And User memasukan nama "Kumala"
    And User memasukan nama belakang "Lakumala"
    And User memasukan postal code "11167"
    And User click continue
    When User click cancel
    Then User berada di Home page

  @Negative
  Scenario: Tidak dapat mengisi box Last Name
    Given User berada di Login page
    And User memasukan username "error_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    And User berada di Home page
    And User click Add to chart
    And User click icon keranjang
    And User click checkout
    And User memasukan nama "Kumala"
    When User memasukan nama belakang "Lakumala"
    Then Box Nama belakang tidak terisi
