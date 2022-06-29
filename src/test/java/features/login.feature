Feature: Application Login

  Scenario: Home page default login

    Given user is on NetBanking landing page
    When user login into application with "jin" and "1234"
    Then home page is populate
    And cards are "true"

    Given user is on NetBanking landing page
    When user login into application with "john" and "4321"
    Then home page is populate
    And cards are "false"