package extentlistner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class HtmlReportt {
	static ExtentReports extent;

	public static ExtentReports extentReportGenerator() {
String path =System.getProperty("user.dir")+"\\reports\\hatmllreport3.html";
ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
reporter.config().setReportName("Regression Test Reports");
reporter.config().setDocumentTitle("Report for Regression testing");
reporter.config().setTheme(Theme.DARK);
reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

extent=new ExtentReports();
extent.setSystemInfo("OS", "Windows");
extent.setSystemInfo("Browser", "Chrome");
extent.setSystemInfo("Org", "Velocity");
extent.attachReporter(reporter);
return extent;
}
}
