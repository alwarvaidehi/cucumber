package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RequestBooksPage;

public class RequestBookSteps {
WebDriver driver;
	
	RequestBooksPage rb;
	
	
	@Given("User should be in request page")
	public void user_should_be_in_request_page() throws InterruptedException {

		driver=new EdgeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
		rb=PageFactory.initElements(driver, RequestBooksPage.class);
		Thread.sleep(1000);
//	bp.getBrowser("https://www.bookswagon.com/");
	Thread.sleep(1000);
		rb.navigateToRequestBookPage();
	}
	@When("enter the required data iSBN as {string} Title as {string} Author as {string} Quantity as {string} Email as {string} Phone as {string}")
	public void enter_the_required_data_i_sbn_as_title_as_author_as_joseph_murphy_quantity_as_email_as_phone_as(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		rb.requestBook(string, string2, string3, string4, string5, string6);
	}



	

	@When("Click the submit button")
	public void click_the_submit_button() {
		rb.clickSubmitButton();
		
	}

	@Then("request should be notify to them")
	public void request_should_be_notify_to_them() {
		rb.notifyMessage();
		driver.quit();
	    
	}



}
