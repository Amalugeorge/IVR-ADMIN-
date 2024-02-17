package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Uploadleaddata {
WebDriver driver;
By uploadlddata= By.xpath("//span[normalize-space()='Upload Lead Data with Mortgage']");
By cmpaignid = By.xpath("//input[@id='campaign-id']");
By slcttype = By.xpath("//div[@class='select__value-container css-1hwfws3']");
By type = By.xpath("//div[@class='select__menu css-26l3qy-menu']");
By browser  = By.xpath("//span[@class='uppy-DragDrop-browse']");
By selcttmplte = By.xpath("//div[@class='select__value-container css-1hwfws3'][1]");
By selectedtmp = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[2]");
By firstname = By.xpath("//div[@class='select__value-container css-1hwfws3'][1]");
By selectedfrstnme = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[16]");
By submit = By.xpath("//button[normalize-space()='Submit']");
public Uploadleaddata(WebDriver driver)
{
	this.driver=driver;
}
public void upload(String cmp)
{
	driver.findElement(uploadlddata).click();
	driver.findElement(cmpaignid).sendKeys(cmp);
	driver.findElement(slcttype).click();
	List<WebElement> ty= driver.findElements(type);
	//System.out.println(l.size());
	for(WebElement t:ty)
	{
		System.out.println(t.getText());
		String actu = t.getText();
		String expc="NEW MTG";
		if(actu.contains(expc)) {
			t.click();
		}
	}
	
}
public void browser() throws AWTException
{
	driver.findElement(browser).click();
	fileupload("C:\\Users\\annuk\\Downloads\\nwk.csv");
	}
	private void fileupload(String p) throws AWTException {
		StringSelection strSelection = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void form() throws InterruptedException
	{
		driver.findElement(selcttmplte).click();
		driver.findElement(selectedtmp).click();
		Thread.sleep(2000);
		driver.findElement(firstname).click();
		driver.findElement(selectedfrstnme).click();
		driver.findElement(submit).click();
	}

	
}

