package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BestSellerPage;
import pages.FictionPage;
import pages.SearchBoxPage;

public class fictionSteps extends SearchBoxPage{
	FictionPage fp;
	@Given("User is on the Bookswagon website")
	public void user_is_on_the_bookswagon_website()
	 {
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("https://www.bookswagon.com/");
	  String ActualTitle= driver.getTitle();
	  String ExpectedTitle="Online Bookstore | Buy Books Online | Read Books Online";
      Assert.assertSame(ActualTitle, ExpectedTitle);
	  System.out.println(ActualTitle);
	   
		
		
		
	}
	

	@When("User navigates to the Textbooks section")
	public void user_navigates_to_the_textbooks_section() throws InterruptedException
	{
		//driver.findElement(By.xpath("(//li[@id='ctl00_liTextBook'])/child::a")).click();
		
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		fp=PageFactory.initElements(driver, FictionPage.class);	
				
				//driver.switchTo().window(tabs.get(1));
				fp.navigatestotheTextbookssection();
				Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User selects a book")
	public void user_selects_a_book() throws InterruptedException {
		//driver.findElement(By.xpath("(//div[@class='text-center position-relative blackhover'])[1]")).click();
        fp.selectsabook();
		Thread.sleep(2000);
	    // Write code here th
		
	    // Write code here that turns the phrase above into concrete actions
	}

@Given("User adds the book to the cart in fiction")
public void user_adds_the_book_to_the_cart_in_fiction() {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.xpath("//input[@class='btn themebackground text-white']")).click();
    //Thread.sleep(1000);
    //throw new io.cucumber.java.PendingException();
  fp.addsthebooktothecartinfiction();
}


	

	@When("User verifies the book is in the cart")
	public void user_verifies_the_book_is_in_the_cart() {
		//driver.findElement(By.xpath("(//span[@class='itemcount'])[1]")).click();
      fp.verifiesthebookisinthecart();
		driver.close();
	    // Write code here that turns the phrase above into concrete actions

	}
}
