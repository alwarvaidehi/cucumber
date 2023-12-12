package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArrivalsPage {
	public static WebDriver driver = null;
	
 @FindBy(linkText="New Arrivals")
 WebElement New_Arrival_Button;
 @FindBy(xpath="(//a[@class='nav-link'])[1]")
 WebElement Select_the_Paper;
 @FindBy(linkText="English")
 WebElement Language;
 @FindBy(xpath="(//a[@class='nav-link'])[7]")
 WebElement select_language;
 @FindBy(xpath="(//a[@class='nav-link'])[9]")
 WebElement type_language;
 @FindBy(xpath="(//img[@class='card-img-top bklazy'])[1]")
 WebElement Select_one_book;
 @FindBy(xpath="//input[@value='Buy Now']")
 WebElement buy_one_book;
 public NewArrivalsPage()
 {
 	PageFactory.initElements(driver, this);

 }
 
 public void NewArrivalButton()
 {
	 New_Arrival_Button.click();
 }
 public void SelectthePaper()
 {
	 Select_the_Paper.click();	 
 }
 public void Select_the_Language() throws InterruptedException
 {
	 Language.click();
	 Thread.sleep(1000);
	 select_language.click();
	 Thread.sleep(1000);
	 type_language.click();
 }
 public void Selectonebook() throws InterruptedException
 {
	 Thread.sleep(1000);
	 Select_one_book.click();
 }
 public void buyonebook()
 {
	 buy_one_book.click();
 }
}
