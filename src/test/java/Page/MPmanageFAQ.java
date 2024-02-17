package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPmanageFAQ {
WebDriver driver;
By mngefaq = By.xpath("//a[@href='/faq-manage']");
By addnw = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div[2]/div[2]");
By entrctgnm = By.xpath("//div[@class='popover-body']/input");
By submitctg = By.xpath("//div[@class='d-flex justify-content-center mt-1']/button");
By edit = By.xpath("//div[@class='category-body']//div[1]//span[1]//*[name()='svg']");
By close = By.xpath("//h3[normalize-space()='Edit Category']//*[name()='svg']");
By addnewfaq  = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[2]/div[2]/button");
By slctcatgry = By.xpath("//*[@id=\"category\"]/div/div[1]/div[2]");
By slctedctg = By.xpath("//div[@class=' css-qr46ko']/div[1]");
By qn = By.xpath("//div[@class='mb-1 col-sm-12'][2]/input");
By descr = By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']");
By upload = By.xpath("//div[@class='d-flex align-items-center justify-content-center flex-column']//*[name()='svg']");
By submitfileupl = By.xpath("//div[@class='d-flex justify-content-end modal-footer']/button[2]");
By managefaqdrpdn = By.xpath("//div[@class=' css-hlgwow']");
By selctmngefaq = By.xpath("//div[@class=' css-qr46ko']/div[1]");
By delete = By.xpath("//div[@class='card-body']//div[2]//span[1]//*[name()='svg'][2]");
By ysdlt = By.xpath("//button[normalize-space()='Yes, Confirm!']");
By ok = By.xpath("//button[normalize-space()='OK']");
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
public MPmanageFAQ(WebDriver driver)
{
	this.driver=driver;
}
public void mngfaq()
{
	driver.findElement(mngefaq).click();
}
public void mngfaqadd(String ctg)
{
	
	driver.findElement(addnw).click();
	driver.findElement(entrctgnm).sendKeys(ctg);
	driver.findElement(submitctg).click();
	
}
public void editfaq()
{
	driver.findElement(edit).click();
	driver.findElement(close).click();
	System.out.println("Edit faq closed");

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

public void addfaq(String q,String d) throws InterruptedException, AWTException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(addnewfaq).click();
	driver.findElement(slctcatgry).click();
	driver.findElement(slctedctg).click();
	driver.findElement(qn).sendKeys(q);
	Thread.sleep(2000);
	driver.findElement(descr).sendKeys(d);
	driver.findElement(upload).click();
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
public void submitfaq()
{

	driver.findElement(submitfileupl).click();
}
}
