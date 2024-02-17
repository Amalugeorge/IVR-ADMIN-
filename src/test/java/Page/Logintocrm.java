package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logintocrm {
WebDriver driver;
By logintocrm = By.xpath("//a[normalize-space()='Login to CRM']");
By mrkplce = By.xpath("//a[@class='btn btn-outline-primary btn-lg mb-2']");
By home = By.xpath("//a[@class='d-flex align-items-center active']");
By alert = By.xpath("//button[normalize-space()='OK']");
public Logintocrm(WebDriver driver) {
	this.driver=driver;
}
public void mrp()
{
	driver.findElement(mrkplce).click();
}
public void lgncrm() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	driver.findElement(alert).click();
	WebElement lgn = driver.findElement(logintocrm);
	
	Actions actions = new Actions(driver);
	actions.moveToElement(lgn);
	actions.perform();
	lgn.click();
	//WebElement lgn = driver.findElement(logintocrm);
}
/*public void lgnmp()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	WebElement lgn = driver.findElement(logintocrm);

	Actions actions = new Actions(driver);
	actions.scrollToElement(lgn).perform();
	lgn.click();
}*/
}
