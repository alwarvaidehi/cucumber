package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestSellerPage extends SearchBoxPage {
	//WebDriver driver;

		@FindBy(xpath=("//li[@id='ctl00_libestseller']"))
		static WebElement Best_Sellers_section;
		@FindBy(xpath=("/html/body/form/div[10]/div[1]/div[3]/div[2]/div[2]/div[1]/div/a/img"))
        static WebElement book_from_the_Best_Sellers;
		@FindBy(xpath=("//input[@class='btn themebackground text-white']"))
        static WebElement book_to_the_cart;
		@FindBy(xpath=("(//span[@class='itemcount'])[1]"))
				static WebElement quantity_in_the_cart;
		
		public BestSellerPage()
		{
			PageFactory.initElements(driver, this);
		}
		public void bestsellersection()
		{
			Best_Sellers_section.click();
			assertTrue(true);

		}
		public void BookfromtheBestSeller()
		{
			book_from_the_Best_Sellers.click();
			assertTrue(true);

		}
		public void booktothecart()
		{
			book_to_the_cart.click();
			assertTrue(true);

		}
		
		public void quantityinthecart()
		{
			quantity_in_the_cart.click();
		}
		
}
