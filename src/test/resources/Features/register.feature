# Author: khadijah.rizqy@gmail.com
# Date: 16 January 2025
# SDET TEST
Feature: Feature to test register functionality

  Scenario: Check register is successful with valid credentials
    Given browser is open
    And user is on register page
    When user enters valid nama
    And user enters valid nomor telepon
    And user enters valid nama bisnis
    And user clicks one of tipe bisnis
    And user enters valid nama e-mail
    And user enters valid password
    And user reenters password
    And user clicks checkbox
    And user clicks Daftar button
    Then user is navigated to the confirmation page
