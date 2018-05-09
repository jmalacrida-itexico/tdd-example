Feature: Create a StringCalculator
  Scenario: Two numbers, comma delimited, returns the sum
    Given that there exists a calculator
    When I evaluate "3,4"
    Then the result is 7