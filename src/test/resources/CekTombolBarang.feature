Feature: Check Image

  @Positive
  Scenario: Cek Image jika Image yang ditampilkan benar
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    When User berada di Home page
    Then Image tidak ada yang salah saat ditampilkan


  @Negative
  Scenario: Cek Image jika Image yang ditampilkan salah
    Given User berada di Login page
    And User memasukan username "standard_user"
    And User memasukan password "secret_sauce"
    And User click tombol login
    When User berada di Home page
    Then Image ada yang salah saat ditampilkan