package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass {
	WebDriver driver;
@FindBy(id="welcome")
private WebElement btndropdown;

@FindBy(xpath="//a[contains(text(),'Logout')]")
private WebElement btnlogout;

public LogoutPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void logoutapp() throws InterruptedException {
	btndropdown.click();
	Thread.sleep(5000);
	btnlogout.click();
}
}
