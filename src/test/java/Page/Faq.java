package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Faq {
WebDriver driver;
By faq= By.xpath("//a[@href='/faq']");
By lgntomp = By.xpath("//li[@class='nav-item active']//child::a[@href='/faq']");
public Faq(WebDriver driver) {
	this.driver=driver;
}
public void fq()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//WebElement Element = driver.findElement(By.linkText("FAQ"));
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		WebElement faqpg = driver.findElement(faq);

		Actions actions = new Actions(driver);
		actions.scrollToElement(faqpg).perform();
		faqpg.click();
	//js.executeScript("arguments[0].ScrollIntoView();",f);
	//f.click();
	 	//driver.findElement(lgntomp).click();

	

}
}
