package Extent_Report;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class GeneratesExtentReports implements ITestListener
{
	public ExtentReports reports;
	public ExtentSparkReporter Spark;
	ExtentTest test;
	
	@overrides
	public void OnTestStart(ITestResult result) {
	String name=result.getMethod().getMethodName();
	test=reports.createTest(name);
	System.out.println("OnTestStart");
	}

	
	@overrides
	public void OnTestSuccess(ITestResult result)
	{
		System.out.println("OnTestSuccess");
		String name=result.getMethod().getMethodName();
		System.out.println("OnTestFailure");
		test.log(Status.PASS,name+"is passed");

	}
	
	@overrides
	public void OnTestFailure(ITestResult result)
	{
		System.out.print("OnTestFailure");
	}
	
	@overrides
	public void OnTestSkipped(ITestResult result){
		System.out.print("OnTestSkipped");
	}
	
	@overrides
	public void OnStart(ITestContext context)
	{
		File path=new File("./ExtentReports/sample.html");
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("DemoWorkShop");
		spark.config().setReportName("Muskan");
		spark.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.setSystemInfo("os","Windows 10");
		reports.setSystemInfo("Browser","Chrome");
		reports.attachReporter(spark);
	
	}
}
