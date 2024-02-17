package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ManageFAQ {
WebDriver driver;
By mangefaq = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[13]/a/span");
By addnew = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div[2]/div[2]");
By category = By.xpath("//input[@placeholder='Enter Category Name']");
By submitcateg = By.xpath("//button[@type='submit']");
By editcate = By.xpath("//div[@class='card-body']//div[2]//span[1]//*[name()='svg']");
By editcattext = By.xpath("//input[@placeholder='Enter Category Name']");
By submiteditcate = By.xpath("//button[@type='submit']");
By addnewfaq  = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[2]/button");
By selectcate = By.xpath("//div[@id='category']//div[contains(@class,'css-1hwfws3')]");
By categryselected = By.xpath("//*[@id=\"category\"]/div[2]");
By qstn = By.xpath("//div[@class='mb-1 col-sm-12'][2]/input");
By desc = By.xpath("//div[@class='rdw-editor-main']");
By slctfaq = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div");
By faqselcted = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]");
By addcateg = By.xpath("//*[@id=\\\"root\\\"]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div[2]/div[2]");
By entrctgnm = By.xpath("//input[@placeholder='Enter Category Name']");
//By submitfileupl = By.xpath("//div[@class='d-flex justify-content-end modal-footer']/button[2]");
By managefaqdrpdn = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/div[1]");
By selctmngefaq = By.xpath("//*[@id=\"react-select-2-option-1\"]");
By delete = By.xpath("//div[@class='card-body']//div[2]//span[1]//*[name()='svg'][2]");
By ysdlt = By.xpath("//button[normalize-space()='Yes, Confirm!']");
By ok = By.xpath("//button[normalize-space()='OK']");
By slctcatgry = By.xpath("//div[@id='category']//div[@class=' css-1hwfws3']");
By slctedctg = By.xpath("//div[@class=' css-11unzgr']/div[3]");
By qn = By.xpath("//div[@class='mb-1 col-sm-12'][2]/input");
By descr = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
By browser  = By.xpath("//span[@class='uppy-DragDrop-browse']");
By submitfileupl = By.xpath("//div[@class='d-flex justify-content-end modal-footer']/button[2]");
By arrowmngefaq = By.xpath("//div[@class='d-flex justify-content-end col'][1]/div[1]/span[4]");
By hidden = By.xpath("//div[@class='d-flex justify-content-end col']/div/span[1]");
By ysconfrm = By.xpath("//button[@class='swal2-confirm btn btn-primary']");
By okhddn = By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled']");
By editmangefaq = By.xpath("//div[@class='d-flex justify-content-end col']/div/span[2]");
By submiteditmngefaq = By.xpath("//button[normalize-space()='Submit']");
By viewdocs = By.xpath("//div[@class='mt-1 collapse show']/div[2]/button");
By deletfaq  =By.xpath("//div[@class='d-flex justify-content-end col'][1]/div[1]/span[3]");
By ysdeletefaq = By.xpath("//button[@class='swal2-confirm btn btn-primary']");
By okdeletefaq = By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled']");
By opendoc = By.xpath("//div[@class='modal-body']/p/a");
By closeviewdoc = By.xpath("//button[@class='btn btn-outline-primary']");
public ManageFAQ(WebDriver driver)
{
	this.driver=driver;
}
public void  mngfaq()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(mangefaq).click();
	/*driver.findElement(addnew).click();
	driver.findElement(category).sendKeys(cate);
	driver.findElement(submitcateg).click();*/
	
}
public void addcat(String cate)
{
	driver.findElement(addnew).click();
	driver.findElement(category).sendKeys(cate);
	driver.findElement(submitcateg).click();
}
public void delete()
{
	driver.findElement(delete).click();
	driver.findElement(ysdlt).click();
	driver.findElement(ok).click();
}
public void managefaq()
{
	driver.findElement(managefaqdrpdn).click();
	driver.findElement(selctmngefaq).click();
	driver.findElement(arrowmngefaq).click();
	driver.findElement(hidden).click();
	driver.findElement(ysconfrm).click();
	driver.findElement(okhddn).click();
	driver.findElement(editmangefaq).click();
	driver.findElement(submiteditmngefaq).click();

	driver.findElement(deletfaq).click();
	driver.findElement(ysdeletefaq).click();
	driver.findElement(okdeletefaq).click();
}
public void viewdocs()
{
	driver.findElement(managefaqdrpdn).click();
	driver.findElement(selctmngefaq).click();
	driver.findElement(arrowmngefaq).click();
	driver.findElement(viewdocs).click();
	driver.findElement(opendoc).click();
	//driver.findElement(closeviewdoc).click();
}
public void addfaq() throws InterruptedException, AWTException, IOException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(addnewfaq).click();
	
	/*Thread.sleep(2000);
	
	WebElement sbmt = driver.findElement(submitfileupl);

	Actions actions = new Actions(driver);
	actions.scrollToElement(sbmt).perform();*/
	//sbmt.click();

	//Thread.sleep(2000);
	driver.findElement(browser).click();
	fileupload("C:\\Users\\annuk\\Downloads\\382_1691646278_download (3).png");
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
public void addnewfaqslctd(String q,String d) throws InterruptedException
{
	driver.findElement(slctcatgry).click();
	driver.findElement(slctedctg).click();
	driver.findElement(qn).sendKeys(q);
	Thread.sleep(2000);
	driver.findElement(descr).sendKeys(d);
}
public void submitfaq()
{

	driver.findElement(submitfileupl).click();
}
}




