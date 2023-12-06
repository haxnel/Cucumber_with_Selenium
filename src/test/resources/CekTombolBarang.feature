Feature: Check Image

  @Positive-1
  Scenario: Dapat meng-click tombol Add to cart
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    And User berada di Home page
    When User click Add to cart di Home
    Then User melihat tombol remove


  @Positve-2
  Scenario: Dapat meng-click Add to cart dan Remove
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    And User berada di Home page
    And User click Add to cart di Home
    When User click remove
    Then User melihat tombol add to cart

  @Negative
  Scenario: Tidak dapat remove barang saat sudah ditambahkan
    Given User berada di Login page
    And User memasukan username "error_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    And User berada di Home page
    And User click Add to cart di Home
    When User click remove
    Then User dapat melakukan remove