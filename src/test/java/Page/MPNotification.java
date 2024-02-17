package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MPNotification {
WebDriver driver;
By notfictn = By.xpath("//a[@href='/notification']");
By addntfcn = By.xpath("//button[@class='btn btn-primary']");
By slctstate = By.xpath("//div[@class='select__input-container css-19bb58m']");
By state  = By.xpath("//div[@id='react-select-2-option-0']");
By checkbxgd = By.xpath("//div[4]//div[2]//input[1]");
By submitaddnt = By.xpath("//button[@type='submit']");
By threedts = By.xpath("//span[@class='pr-1']//*[name()='svg']");
By edit = By.xpath("//button[normalize-space()='Edit']");
By cancel = By.xpath("//button[normalize-space()='Cancel']");
By delete = By.xpath("//div[@class='notification-dropdown dropdown-menu show']//button[@role='menuitem'][normalize-space()='Delete']");
By ysdlt = By.xpath("//button[normalize-space()='Yes, delete it!']");
By shw = By.xpath("//select[@id='sort-select']");
public MPNotification(WebDriver driver) {
	this.driver=driver;
}
public void ntfcn(String st)
{
	driver.findElement(notfictn).click();
	
	
}
public void addntfn()
{
	driver.findElement(addntfcn).click();
	driver.findElement(slctstate).click();
	driver.findElement(state).click();
	driver.findElement(checkbxgd).click();
	driver.findElement(submitaddnt).click();
	
}
public void threedts()
{
	driver.findElement(threedts).click();
	driver.findElement(edit).click();
	driver.findElement(cancel).click();
}
public void delte()
{
	driver.findElement(threedts).click();
	driver.findElement(delete).click();
	driver.findElement(ysdlt).click();
	WebElement shwno = driver.findElement(shw);
	Select shwelmnt = new Select(shwno);
	shwelmnt.selectByVisibleText("25");
}
}
