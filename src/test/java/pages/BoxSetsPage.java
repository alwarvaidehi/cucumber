package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoxSetsPage extends SearchBoxPage{
	@FindBy(linkText="Box Sets")
	WebElement click_on_Boxsets;
	@FindBy(xpath="//div[@class='row bestsellerbox']/descendant::a[1]")
	WebElement click_on_one_book;
	@FindBy(xpath="//div[@id='ctl00_phBody_ProductDetail_divaction']/descendant::input[1]")
	WebElement click_on_buynow;
	
	public BoxSetsPage()
	{
		PageFactory.initElements(driver, this);

	}
	public void clickonBoxsets()
	{
		click_on_Boxsets.click();
		assertTrue(true);
	}
	public void clickononebook()
	{
		click_on_one_book.click();
	}
	public void clickonbuynow()
	{
		click_on_buynow.click();
	}
}
