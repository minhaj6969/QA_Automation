@search
Feature: JCPenney search functionality in feature test

Scenario: I am able to search with valid credentials

   Given I am on the home page
   When I enter text on search box
   And I click on the search button
   And I click on the mens shoes nike
   And I click on the Nike Mens shoe black
   And I click on the shoe
   And I click on the size fits
   Then I successfully get to order