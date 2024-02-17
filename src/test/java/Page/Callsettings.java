package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Callsettings {
WebDriver driver;
By callsettings = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[11]/a/span");
By threedots = By.xpath("(//*[name()='svg'])[26]");
By edit = By.xpath("//div[@class='dropdown-menu show']//button[@role='menuitem'][normalize-space()='Edit']");
By cost = By.xpath("//*[@id=\"cost\"]");
By submit = By.xpath("//button[normalize-space()='Submit']");
public Callsettings(WebDriver driver)
{
	this.driver=driver;
}
public void callset(String c)
{
	driver.findElement(callsettings).click();
	driver.findElement(threedots).click();
	driver.findElement(edit).click();
	driver.findElement(cost).sendKeys(c);
	driver.findElement(submit).click();
}
}