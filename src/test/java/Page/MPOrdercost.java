package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MPOrdercost {
WebDriver driver;
By ordercst = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/a");
By threedtsgld = By.xpath("//div[@class='accordion-collapse collapse show']//div[@id='row-1']//span[@class='pr-1']//*[name()='svg']");
By editgld = By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//button[@role='menuitem'][normalize-space()='Edit']");
By editfield = By.xpath("//input[@name='cost']");
By cancelgld = By.xpath("//button[normalize-space()='Cancel']");
By dwnld = By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//button[@role='menuitem'][normalize-space()='Download']");
By enbleordsable = By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[@class='link']//button[@role='menuitem']");
By searchenb = By.xpath("//input[@id='search-input']");
By silverordrcst = By.xpath("//button[normalize-space()='Silver']");
By goldordrcst = By.xpath("//button[normalize-space()='Gold']");
By threedtsslvr = By.xpath("//div[@class='accordion-collapse collapse show']//div[@id='row-5']//span[@class='pr-1']//*[name()='svg']");
By dwnloadsilver= By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//button[@role='menuitem'][normalize-space()='Download']");
By editslvr = By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//button[@role='menuitem'][normalize-space()='Edit']");
By canceledtslvr = By.xpath("//button[normalize-space()='Cancel']");
By editorenbleslvr = By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[@class='link']//button[@role='menuitem']");
By searchslvr = By.xpath("//input[@id='search-input']");
public MPOrdercost(WebDriver driver)
{
	this.driver=driver;
}
public void ordrcst(String state)
{
	driver.findElement(ordercst).click();
	System.out.println("ordercst is working");
	WebElement threedtgld=driver.findElement(threedtsgld);
	threedtgld.click();
	driver.findElement(editgld).click();
	//driver.findElement(editfield).sendKeys("1");
	driver.findElement(cancelgld).click();
	threedtgld.click();
	driver.findElement(dwnld).click();
	threedtgld.click();
	driver.findElement(enbleordsable).click();
	driver.findElement(searchenb).sendKeys(state);
}
public void silver(String ss) throws InterruptedException
{
	driver.navigate().back();
	driver.findElement(goldordrcst).click();
	Thread.sleep(2000);
	driver.findElement(silverordrcst).click();
	WebElement threedtslv=driver.findElement(threedtsslvr);
	threedtslv.click();
	driver.findElement(editslvr).click();
	driver.findElement(canceledtslvr).click();
	threedtslv.click();
	driver.findElement(dwnloadsilver).click();
	threedtslv.click();
	driver.findElement(editorenbleslvr).click();
	driver.findElement(searchslvr).sendKeys(ss);
}
}
