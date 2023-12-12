
	package utilities;

	import java.io.File;
	import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import pages.SearchBoxPage;

	public class ScreenshotUtilitycucu {
WebDriver driver;
		public  String takeScreenshot() throws IOException {

			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target=new File("./screenshots/BookSwagOnFailure.png");
			//String path = "D:\\Screenshots-RLL\\myScreenshot_"+System.currentTimeMillis()+".png";
		//	File target = new File(path);

			FileUtils.copyFile(source, target);
			
			String targetpath = target.getAbsolutePath();
			return targetpath;
	}
		
}
	//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File target=new File("./screenshots/BookSwagOnFailure.png");
	//FileUtils.copyFile(srcFile,destFile);