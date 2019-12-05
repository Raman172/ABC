package main;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentR {

	public static void main(String A[]) throws IOException
	{
		
		SearchBox o = new SearchBox();
		o.search();
		o.get();
		
//		ExtentReports report ;
//		
//		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html",true);
//		
//		
//		ExtentTest test ;
//		
//		test = report.startTest("ExtentR") ;
//		
//		test.log(LogStatus.PASS, "pass test");
//
//		
//		test.log(LogStatus.INFO, "information status");
//		
//		test.log(LogStatus.PASS, "details");
//		
//		
//
//		
//		test.log(LogStatus.INFO, "page loaded");
//		
//	test.setDescription("this is my first report ");
//	
//	
//	
//	test.getDescription();
//	
//	
//		report.endTest(test);
//		
//		report.flush();
//		
//		
		
	}
}
