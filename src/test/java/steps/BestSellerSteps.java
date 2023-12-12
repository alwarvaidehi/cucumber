package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BestSellerPage;
import pages.SearchBoxPage;
import pages.Todaysdealpage;

public class BestSellerSteps extends SearchBoxPage{
	// WebDriver driver;
	 BestSellerPage bp;

	    @Given("User opens the BooksWagon website")
	    public void user_opens_the_BooksWagon_website() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.bookswagon.com/");
	        Thread.sleep(2000);
	    }

	    @When("User clicks on the Best Sellers section")
	    public void user_clicks_on_the_Best_Sellers_section() {
	       //driver.findElement(By.xpath("/html/body/form/nav/div/div/div[1]/ul/li[4]/a")).click();

			bp=PageFactory.initElements(driver, BestSellerPage.class);
	    	bp.bestsellersection();
	    }

	    @And("User selects a book from the Best Sellers")
	    public void user_selects_a_book_from_the_Best_Sellers() throws InterruptedException {
	        //ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        bp.BookfromtheBestSeller();
	    	Thread.sleep(1000);
	       // driver.findElement(By.xpath("/html/body/form/div[10]/div[1]/div[3]/div[2]/div[2]/div[1]/div/a/img")).click();
	    }

	    @And("User adds the book to the cart")
	    public void user_adds_the_book_to_the_cart() throws InterruptedException {
	        Thread.sleep(2000);
	       bp.booktothecart();
	        // driver.findElement(By.xpath("//input[@class='btn themebackground text-white']")).click();
	    }

	    @And("User increases the quantity in the cart")
	    public void user_increases_the_quantity_in_the_cart() throws InterruptedException {
	        Thread.sleep(2000);
	    	bp.quantityinthecart();
	    	//driver.findElement(By.xpath("(//span[@class='itemcount'])[1]")).click();
	    }

	    @Then("User closes the browser")
	    public void user_closes_the_browser() {
	        driver.close();
	    }
	}


