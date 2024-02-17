package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logintomp {
WebDriver driver;
By lgntomp = By.xpath("//a[normalize-space()='Login to Marketplace']");

public Logintomp(WebDriver driver) {
	this.driver=driver;
}
public void lgnmp()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	WebElement lgn = driver.findElement(lgntomp);

	Actions actions = new Actions(driver);
	actions.scrollToElement(lgn).perform();
	lgn.click();
}
}
