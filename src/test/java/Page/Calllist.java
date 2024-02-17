package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calllist {
WebDriver driver;
By calllist = By.xpath("//a[@href='/call-list']");

public Calllist(WebDriver driver)
{
	this.driver=driver;
}
public void callst()
{
	driver.findElement(calllist).click();
}
}
