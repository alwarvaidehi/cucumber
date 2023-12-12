package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookSwagonLoginPage;
import pages.NewArrivalsPage;

public class NewArrivalsSteps {
	
	WebDriver driver;
	NewArrivalsPage np;
	
	@When("I am open the bookswagon Home Page")
	public void I_am_open_the_bookswagon_Home_Page() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
		

	}
	
	@And("I click on New Arrival Button")
	public void I_click_on_New_Arrival_Button() {
		np=PageFactory.initElements(driver, NewArrivalsPage.class);
		//driver.findElement(By.linkText("New Arrivals")).click();
		np.NewArrivalButton();
	}
	
	
	@Then("I Select the Paper")
	public void I_Select_the_Paper() {
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		np.SelectthePaper();
	}
	
	
	@Then("I type Select the Language")
	public void I_type_Select_the_Language() throws InterruptedException {
		//driver.findElement(By.linkText("English")).click();
		np.Select_the_Language();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[9]")).click();
		//Thread.sleep(1000);
	}
	
	@And("I select one Book")
	public void I_select_one_Book() throws InterruptedException {
		//driver.findElement(By.xpath("(//img[@class='card-img-top bklazy'])[1]")).click();
		//Thread.sleep(100);
		np.Selectonebook();
	}
	
	
	@Then("I finally buy a Books")
	public void I_finally_buy_a_Books() {
	//	driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
	np.buyonebook();
	driver.quit();
	//driver.close();
	}
	

}
