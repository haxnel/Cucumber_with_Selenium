Feature: Login

  @Positive-Test
  Scenario: Login dengan user dan pass Valid
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    When User click tombol login
    Then User berada di Home page

  @Negative-Test
  Scenario: Login dengan user dan pass Invalid
    Given User berada di Login page
    And User memasukan username "ssssssss"
    And User memasukan password "secret_sauce"
    When User click tombol login
    Then user melihat pesan error "Epic sadface: Username and password do not match any user in this service"
    Then User berada di Login page

  @Negative-Test2
  Scenario: Tidak memasukan username pada box username
    Given User berada di Login page
    And User memasukan password "secret_sauce"
    When User click tombol login
    Then user melihat pesan error "Epic sadface: Username is required"
    Then User berada di Login page

  @Negative-Test3
  Scenario: Tidak memasukan password pada box password
    Given User berada di Login page
    And User memasukan username "ssssssss"
    When User click tombol login
    Then user melihat pesan error "Epic sadface: Password is required"
    Then User berada di Login page