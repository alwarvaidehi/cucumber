package steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SearchBoxPage;


public class SearchSteps extends SearchBoxPage{
	SearchBoxPage sb;
//	public static WebDriver driver=null;


@Given("user entering the search item in the search box")
public void user_entering_the_item_in_the_search_box() {
	driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.bookswagon.com/");
	sb=PageFactory.initElements(driver, SearchBoxPage.class);
	
	sb.searchitem("Beyond The Story: 10-Year Record of BTS\\r\\n");
}

@Given("User click on search button")
public void user_click_on_search_button() throws InterruptedException {
	sb.searchbtn();
   
}

@When("User click on wishList")
public void user_click_on_wish_list() throws InterruptedException {
	sb.wishlistsearch();
	Thread.sleep(1500);
}


@When("User enter the login Email as {string} and password as {string}")
public void user_enter_the_login_email_as_and_password_as(String email, String password) {
   sb.loginsearch(email, password);
}

@When("user click on login button")
public void user_click_on_login_button() {
	sb.loginbutton1();
	
}


}


