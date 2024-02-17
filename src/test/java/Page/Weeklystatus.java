package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Weeklystatus {
WebDriver driver;
By weeklystatus = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[6]/a/span");
By slctcmpgn = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div[1]");
By cmpgnid = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[2]");
public Weeklystatus(WebDriver driver)
{
	this.driver = driver;
}
public void wklysts()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(weeklystatus).click();
	driver.findElement(slctcmpgn).click();
	driver.findElement(cmpgnid).click();
	List<WebElement> l= driver.findElements(cmpgnid);
	//System.out.println(l.size());
	for(WebElement ws:l)
	{
		System.out.println(ws.getText());
	}
}
}
