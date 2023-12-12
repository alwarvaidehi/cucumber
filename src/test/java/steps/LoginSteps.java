package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FictionPage;
import pages.BookSwagonLoginPage;

public class LoginSteps {
	static WebDriver driver;
	BookSwagonLoginPage lp;
@Given("the User is on the BooksWagon home page")
public void the_user_is_on_the_books_wagon_home_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver=s.getDriver();
    driver.get("https://www.bookswagon.com/");
}

@Then("the User hover My Accounts and clicks on the login button in BookSwagon")
public void the_user_hover_my_accounts_and_clicks_on_the_login_button_in_book_swagon() throws InterruptedException {
	lp=PageFactory.initElements(driver, BookSwagonLoginPage.class);	
	lp.My_Account();
	//lp.Loginbutton();
}

@When("the User enter email as {string} on the login page")
public void the_user_enter_email_as_on_the_login_page(String EmailId) {
    //driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).sendKeys(string);
lp.EmailLoginPage(EmailId);

}

@When("the User enter password as {string} on the login page")
public void the_user_enter_password_as_on_the_login_page(String password) {
    //driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']")).sendKeys(string);
lp.PasswordLoginPage(password);
}

@When("the User clicks on the login button on the page")
public void the_user_clicks_on_the_login_button_on_the_page() {
   // driver.findElement(By.xpath("((//div[@class='form-row text-center'][1])/descendant::*)[2]")).click();
    lp.Loginbuttonpage();
}

@When("the User hover My Account and clicks on logout button")
public void the_user_hover_my_account_and_clicks_on_logout_button() throws InterruptedException {
//	Actions a = new Actions(driver);
  //  WebElement Uname = driver.findElement(By.xpath("//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]"));
   // a.moveToElement(Uname).perform();
	Thread.sleep(1500);
	lp.My_Account();
  //driver.findElement(By.xpath("//div[@class='userpopup']/descendant::a[9]")).click();
 // lp.LogOutbutton();
	
	driver.close();
}

}
