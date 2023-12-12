package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BoxSetsPage;
import pages.FictionPage;

public class BoxSetsSteps {
	WebDriver driver;
	BoxSetsPage bs;
	@Given("I open the browse")
	public void i_open_the_browse() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
	    
	    
	}

	@Given("I click on Boxsets")
	public void i_click_on_boxsets() {
		 //driver.findElement(By.linkText("Box Sets")).click();
		bs=PageFactory.initElements(driver, BoxSetsPage.class);	
        bs.clickonBoxsets();
	}


/*	@When("I click on Payment")
	public void i_click_on_payment() {
		driver.findElement(By.linkText("Payment")).click();
	}
	  

	@When("I click on Shipping")
	public void i_click_on_shipping() {
		 driver.findElement(By.linkText("Shipping")).click();
	} */
	@When("I click on one book")
	public void i_click_on_one_book() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//div[@class='row bestsellerbox']/descendant::a[1]")).click();
	bs.clickononebook();
	}

	@When("I click on buynow")
	public void i_click_on_buynow() {
	    // Write code here that turns the phrase above into concrete actions
	bs.clickonbuynow();
		//driver.findElement(By.xpath("//div[@id='ctl00_phBody_ProductDetail_divaction']/descendant::input[1]")).click();
		driver.quit();

	   

}
}
