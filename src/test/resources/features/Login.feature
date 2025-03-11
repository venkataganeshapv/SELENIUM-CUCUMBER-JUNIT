#Login into Ecommerce Lambada Test
Feature: Login Validation in Ecommerce Lambda Test

  @sanity
  Scenario Outline: Login with Valid credentials
    Given Launch Url and Navigate to Login page
    When Enter <username> and <password> in login page
    And Do the sum for <num1> and <num2>
    And Concatenate strings "<name1>" and "<name2>"
    Then Verify Home page
    And sum should be <sum>

    Examples: 
      | username                     | password |num1|num2|sum|name1 |name2|
      | "venkataganeshapv@gmail.com" | "pass123"|5   |6   |11 |Ganesh| APV  |


