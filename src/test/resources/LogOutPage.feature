Feature: LogOut Page

  Scenario: LogOut dari website
      Given User berada di Login page
      And User memasukan username "standard_user"
      And User memasukan password "secret_sauce"
      And User click tombol login
      And User berada di Home page
      And User click tombol hamburger
      When User Click text Logout
      Then User berada di Login page
