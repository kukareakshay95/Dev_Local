package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import testpages.BaseClass;
import testpages.ClickabelButton;
import testpages.LoginPage;
import testpages.LogoutPage;

public class BaseTest extends BaseClass {
@BeforeSuite
public void initializebrowser() {
	WebDriverManager.chromedriver().setup();
	options=new ChromeOptions();
	options.addArguments("--start-maximized");
	driver=new ChromeDriver(options);
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
@BeforeClass
public void allPageObj() {
	login=new LoginPage(driver);
	logout=new LogoutPage(driver);
	btnclick=new ClickabelButton(driver);

}

@AfterSuite
public void teardown() {
	driver.quit();
}
}
