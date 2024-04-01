Feature: Swaglab login functionality



Background: pre-set up the browser and url
 Given set up the browser and url
      When Enter the "standard_user" and "secret_sauce" 
      
  Scenario: Checking the add to cart functionality with valid credentials
   
    Then click the login button
    And Add the one product to add to cart
    And verify the product is added or not
    Then click the logout button and close browser

    @Regression
 Scenario: Checking the homepage verification functionality with valid credentials
   
    Then click the login button
    And verify the homepage
    Then click the logout button and close browser
    
    
 Scenario: Checking the SORTING add to cart functionality with valid credentials
   
    Then click the login button
    And change the z-A sort
    And Add the RED Tshirt product to add to cart
    When verify the product_RED
    Then click the logout button and close browser



 