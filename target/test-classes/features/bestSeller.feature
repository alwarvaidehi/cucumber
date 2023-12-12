Feature: BooksWagon Best Seller Feature
@booksswagon
  Scenario: Navigate to Best Sellers and Add to Cart
    Given User opens the BooksWagon website
    When User clicks on the Best Sellers section
    And User selects a book from the Best Sellers
    And User adds the book to the cart
    And User increases the quantity in the cart
    Then User closes the browser
