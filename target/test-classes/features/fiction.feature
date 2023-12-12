Feature: Bookswagon Website
@booksswagon
  Scenario: User navigate the websie
    Given User is on the Bookswagon website
    When User navigates to the Textbooks section
    And User selects a book
   Given User adds the book to the cart in fiction
  When User verifies the book is in the cart 