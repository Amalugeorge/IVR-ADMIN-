package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Orders {
WebDriver driver;
By orders = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[10]/a/span");
By elementstrtenddt = By.xpath("//*[@id=\"range-picker\"]");
By startdateorder = By.xpath("//span[@aria-label='September 1, 2023']");
By enddateorder = By.xpath("//span[@aria-label='September 30, 2023']");
By downloadordr = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[1]/div/div/div[2]/button/span");
By drpdownmnth = By.xpath("//select[@class='flatpickr-monthDropdown-months']");
By listmonth = By.xpath("/html/body/div[5]/div[1]/div/div/select");
By prevmonth = By.xpath("/html/body/div[2]/div[1]/span[1]");
By shw = By.xpath("//select[@id='sort-select']");
By uparrwor =By.xpath("//button[@class='btn-icon btn btn-primary']//*[name()='svg']//*[name()='line' and contains(@x1,'12')]");
public Orders(WebDriver driver) {
	this.driver=driver;
}
public void dwnldordr()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(orders).click();
	driver.findElement(elementstrtenddt).click();
	driver.findElement(drpdownmnth).click();
	driver.findElement(prevmonth).click();
	driver.findElement(startdateorder).click();
	driver.findElement(enddateorder).click();
	driver.findElement(downloadordr).click();
	/*WebElement lst=driver.findElement(listmonth);
	lst.click();
	Select mnthelement=new Select(lst);
	mnthelement.selectByVisibleText("September");*/
	WebElement shwno = driver.findElement(shw);
	Select shwelmnt = new Select(shwno);
	shwelmnt.selectByVisibleText("25");
	/*JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight");*/
	//driver.findElement(uparrwor).click();
	
	
	
}
}
