
Feature: Adactin Webpage - Automation test cases

  @Smoke
  Scenario: Adactin login with valid details
    Given User launch "chrome" browser
    And User navigate to url "https://adactinhotelapp.com/"
    And User verify land on page
    And User Enter the username "jokee10699" 
    And User Enter the password "000000"
    Then User click the login button
    And User verify login successfully  ""

  @Sanity
  Scenario Outline: Adactin Login with Invalid details
    Given  User launch "chrome" browser 
    And User navigate to url "https://adactinhotelapp.com/"
    And User verify land on page
    And User Enter the username <username> 
    And User Enter the password <password>
    Then User click the login button
    And User verify the error massage thrown "Invalid Login details or Your Password might have expired. "

    Examples: 
    |username|password|
		|"jokee10699"|"123456"|
		|"jokee"|"000000"|
		|"jokee"|"123456"|