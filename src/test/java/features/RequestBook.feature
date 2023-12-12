
Feature: Testing RequestBook Functionality

	@booksswagon
Scenario:  In BookSwagon Website Searching the functionality of RequestBook Page

		Given User should be in request page
		When enter the required data iSBN as '<isbn>' Title as '<BookTitle>' Author as '<authorName>' Quantity as '<quantityNo>' Email as '<emailId>' Phone as '<Phno>'
		And Click the submit button
		Then request should be notify to them  
  
   Examples:  
      |    isbn      | BookTitle                     |authorName   |  quantityNo| emailId    |Phno      |
      |9789353338459d|Power Of Your Subconscious Mind|Joseph Murphy|3|vijayvel10301@gmail.com|9980924169|
  # "9789353338459d", "Power Of Your Subconscious Mind", "Joseph Murphy", "3", "vijayvel10301@gmail.com", "9980924169");  