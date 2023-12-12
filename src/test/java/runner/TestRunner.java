package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features={"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\fiction.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\ATE_BookSwagon_Project2\\src\\test\\java\\features\\searchbox.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\ATE_BookSwagon_Project2\\src\\test\\java\\features\\todaysdeal.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\bestSeller.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\boxSets.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\awardWinner.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\RequestBook.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\newArrivals.feature",
				"C:\\Users\\Vanak\\eclipse-workspace\\bookswagon_cucumberproject\\src\\test\\java\\features\\bookswagonLogin.feature"},
		
				
		glue = {"steps"},
				dryRun=false,
		plugin = { "html:target/report.html",
				"json:target/cucumber.json",
				
				"pretty"  ,
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	},
		tags="@booksswagon"
		)
		
				
		public class TestRunner {

	}


