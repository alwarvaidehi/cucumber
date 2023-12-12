package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionPage extends SearchBoxPage {
	
Actions a = new Actions(driver);
@FindBy(xpath="(//li[@id='ctl00_liTextBook'])/child::a")
WebElement navigates_to_the_Textbooks_section ;
@FindBy(xpath="(//div[@class='text-center position-relative blackhover'])[1]")
WebElement selects_a_book  ;
@FindBy(xpath="//input[@class='btn themebackground text-white']")
WebElement adds_the_book_to_the_cart_in_fiction ;
@FindBy(xpath="(//span[@class='itemcount'])[1]")
WebElement verifies_the_book_is_in_the_cart;

public FictionPage()
{
	PageFactory.initElements(driver, this);

}
public void navigatestotheTextbookssection()
{
	navigates_to_the_Textbooks_section.click();
	assertTrue(true);
}
public void selectsabook()
{
	selects_a_book.click();
}
public void addsthebooktothecartinfiction()
{
	adds_the_book_to_the_cart_in_fiction.click();
}
public void verifiesthebookisinthecart()
{
	verifies_the_book_is_in_the_cart.click();
}
}
