package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPOrdersummary {
WebDriver driver;
By ordrsmmry = By.xpath("//span[normalize-space()='Order Summary']");
By selctstartenddte = By.xpath("//input[@id='range-picker']");
By prevarrw = By.xpath("//span[@class='flatpickr-prev-month']//*[name()='svg']");
By startdte = By.xpath("//span[@aria-label='September 1, 2023']");
By enddate = By.xpath("//span[@aria-label='September 30, 2023']");
By download = By.xpath("//span[@class='align-middle ms-50']");
public MPOrdersummary(WebDriver driver)
{
	this.driver=driver;
}
public void ordrsmm()
{
	driver.findElement(ordrsmmry).click();
	driver.findElement(selctstartenddte).click();
	driver.findElement(prevarrw).click();
	driver.findElement(startdte).click();
	driver.findElement(enddate).click();
	driver.findElement(download).click();
}
}
