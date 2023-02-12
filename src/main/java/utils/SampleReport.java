package utils;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	
	@Test
	public void generateReport() {
		
		//start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC004", "To Verify IRCTC Registration for the new user sign up");
		
		test.assignAuthor("Aami");
		
		test.assignCategory("Regression");
		
		// log steps
		
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched witht he given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
		
		
	}

}
