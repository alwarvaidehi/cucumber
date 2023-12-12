package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestBooksPage {

	public static WebDriver driver = null;
	
	
//	@FindBy(linkText = "Request a Book")
//	WebElement requestButton;
	
	
	
	@FindBy(id="ctl00_phBody_RequestBook_txtISBN")
	WebElement ISBN;
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtTitle']")
	WebElement title;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtAuthor']")
	WebElement author;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtQty']")
	WebElement quantity;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtEmailReq']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_btnVeiry']")
	WebElement verify;
	
	@FindBy(xpath="//*[@id='ctl00_phBody_RequestBook_txtPhone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='ctl00_phBody_RequestBook_imgbtnSave']")
	WebElement submit;
	
	@FindBy(id="ctl00_phBody_RequestBook_lblsuccessmsg")
	WebElement bookAlreadyFound;
	
	public RequestBooksPage()
	{
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	
	
	@FindBy(linkText = "Request a Book")
	WebElement requestButton;
	
    public void navigateToRequestBookPage() {		
    	requestButton.click();
        
    }
    
    
    
   
    
	public void requestBook(String isbn, String bookTitle,String authorName,String quantityNo,String emailId,String Phno) throws InterruptedException {
		
		ISBN.sendKeys(isbn);
		
		title.sendKeys(bookTitle);
		author.sendKeys(authorName);
		quantity.clear();
		quantity.sendKeys(quantityNo);
		email.sendKeys(emailId);
		verify.click();
		phone.sendKeys(Phno);
		
	}
	 public void clickSubmitButton() {
			submit.click();
			
			
		}
	    
	    public void notifyMessage() {
	    	bookAlreadyFound.isDisplayed();
//	    	String ExpectedTitle="ctl00_phBody_RequestBook_lblsuccessmsg";
//			WebElement actualTitle = bookAlreadyFound;
//			Assert.assertEquals(title, ExpectedTitle);
//			System.out.println("Title of the Notify message is : "+title);
	    }
	
	
	

}
