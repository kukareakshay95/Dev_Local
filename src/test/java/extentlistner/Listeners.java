package extentlistner;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcases.BaseTest;



public class Listeners extends BaseTest implements ITestListener {
	ExtentReports extents=HtmlReportt.extentReportGenerator();
	ExtentTest test;
	
	
	
@Override
	public void onTestStart(ITestResult result) {
	test=extents.createTest(result.getMethod().getMethodName());
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test is pass");
	
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extents.flush();
	}
	@Override
	public void onTestFailure(ITestResult result)  {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
		
	}
	

