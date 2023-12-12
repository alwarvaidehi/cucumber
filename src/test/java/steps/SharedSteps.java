package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.FictionPage;
import utilities.ScreenshotUtilitycucu;


public class SharedSteps {


	@Before(order=0)
	public void openBrowser()
	{
		System.out.println("opening the website");
		
	}
	@Before(order=1)
	public void creatingaccount()
	{
		System.out.println("login  website");
		
	}
   @After(order=1)
   public void search()
   {
	   System.out.println("Successfully searched in the  website");
   }
   @After(order=0)
   public void CloseBrowser() throws IOException
   {
	 
	   System.out.println("closing the browser");
	
   }
}
