package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentREportGenerator {
	
	//ExpertSparkReporter
	//ExpertReports
	
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\Batch11_Framework\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter (path);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("Batch 11 Report");
		reporter.config().setTheme(Theme.DARK);
		
		
	    extent=new ExtentReports ();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Batch 11 Demo Project");
		extent.setSystemInfo("Module Name", "ABC Name");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("Version selenium", "3.141.59");
		extent.setSystemInfo("QA", "ABC");
		
		
		return extent;
		

		
	}

}
