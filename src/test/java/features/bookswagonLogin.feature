Feature: to test the BooksWagon  on chrome browser

  Background: 
    Given the User is on the BooksWagon home page

 @booksswagon
  Scenario Outline: to test the Login page of BookSwagOn
    Then the User hover My Accounts and clicks on the login button in BookSwagon 
    When the User enter email as '<EmailId>' on the login page
    When the User enter password as '<password>' on the login page
    And the User clicks on the login button on the page
    And the User hover My Account and clicks on logout button

    Examples: 
      | EmailId                 | password  |
      | vijayvel10301@gmail.com | group@123 |
