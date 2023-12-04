package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickabelButton extends BaseClass {
	WebDriver driver;
@FindBy(id="btnLogin")
private WebElement btnlogin;

public ClickabelButton(WebDriver driver ) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void buttonsclickable() {
	btnlogin.isEnabled();
}
}
