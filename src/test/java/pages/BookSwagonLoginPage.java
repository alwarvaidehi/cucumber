package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.When;
import steps.LoginSteps;

public class BookSwagonLoginPage {
	public static WebDriver driver;
	
		@FindBy(xpath="//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]")
	WebElement MyAccount;
	//= driver.findElement(By.xpath("//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]"));
     @FindBy(xpath="//div[@class='userpopup']/descendant::a[1]")
     WebElement Login_button;
     @FindBy(xpath="//input[@id='ctl00_phBody_SignIn_txtEmail']")
     WebElement Email_LoginPage;
     @FindBy(xpath="//input[@id='ctl00_phBody_SignIn_txtPassword']")
     WebElement Password_Login_Page;
     @FindBy(xpath="((//div[@class='form-row text-center'][1])/descendant::*)[2]")
     WebElement Login_button_page;
     //@FindBy(xpath="//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]")
     //WebElement ;
     @FindBy(xpath="//div[@class='userpopup']/descendant::a[9]")
     WebElement LogOut_button;

public BookSwagonLoginPage()
{
	PageFactory.initElements(driver, this);
}
public void My_Account() throws InterruptedException
{
	
	
	
	//LoginBtn.click();
	MyAccount.click();
	//Actions a = new Actions(driver);
//a.moveToElement(MyAccount).perform();
//Thread.sleep(2000);
}
public void Loginbutton()
{
	Login_button.click();
}
public void EmailLoginPage(String  EmailId )
{
	Email_LoginPage.sendKeys( EmailId );
	String actual_emailid=EmailId;
	String Expected_emailid="vijay@123gmail.com";
	assertNotSame(actual_emailid, Expected_emailid);
	
}
public void PasswordLoginPage(String password)
{
	Password_Login_Page.sendKeys(password);
	
}
public void Loginbuttonpage()
{
	Login_button_page.click();
}
public void LogOutbutton()
{
	LogOut_button.click();
}
}