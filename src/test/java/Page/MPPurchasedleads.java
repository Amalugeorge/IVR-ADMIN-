package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MPPurchasedleads {
WebDriver driver;
By purchasedleads = By.xpath("//a[@href='/purchased-leads']");
By checkbox = By.xpath("//div[@class='sc-fFGjHI sc-gxYJeL cedzYy kFkqPg rdt_TableCell']/input[1]");
By actions = By.xpath("//div[@class='select__input-container css-19bb58m'][1]");
By copy = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[1]");
By selectagntdrp = By.xpath("//div[@class='react-select css-b62m3t-container']//div[@class='select__input-container css-19bb58m']");
By slctagnt = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[3]");
By submitagentcpy = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button[1]");
By move = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[2]");
By search = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]");
By slctsrch = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[1]");
By entrsrch = By.xpath("//*[@id=\"search-input\"]");
By sbmtsrch = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[2]/button");
By setstatus = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[3]/div[1]/div/span/div/div/div[1]");
By selectstatus= By.xpath("//div[@class='select__menu css-1nmdiq5-menu']/div/div[3]");
By update = By.xpath("//button[normalize-space()='Update']");
By printselected  = By.xpath("//button[@class='me-1 btn btn-outline-primary']");
By dwnldbutn  = By.xpath("//button[@class='btn btn-outline-primary']");
By dwnldselectd = By.xpath("//a[normalize-space()='Download Selected Leads']");
By dwnldall = By.xpath("//a[normalize-space()='Download All']");
By silver = By.xpath("//a[normalize-space()='Silver']");
By bookofbus = By.xpath("//a[normalize-space()='Book of Business']");
By applyfilter = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-primary']");
By applyfiltrstats = By.xpath("//div[@class='react-select setStatus css-b62m3t-container']//div[@class='select__input-container css-19bb58m']");
By slctedapplyfltr = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[3]");
By submitstatusfiltr = By.xpath("//button[normalize-space()='Submit']");
By editfilter = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-danger']");
By resetstatus = By.xpath("//button[normalize-space()='Reset Status']");
By resetfilter = By.xpath("//button[normalize-space()='Reset Filters']");
By cmpgnid = By.xpath("//input[@class='form-control'][1]");
By mrgid = 	By.xpath("//input[@inputmode='numeric']");
By state = By.xpath("//div[@role='dialog']//div[4]//div[1]//input[1]");
By county = By.xpath("//div//div[5]//div[1]//input[1]");
By name = By.xpath("//input[@id='summary1']");
By note = By.xpath("//div[@id='cell-1-undefined']/span[1]");
By txtnte = By.xpath("//textarea[@id='add_note']");
By submitnte = By.xpath("//button[normalize-space()='Submit']");
By shw = By.xpath("//select[@id='sort-select']");
By setstatussilver = By.xpath("//div[@class='react-select dataTable-filter-select select-status setStatus me-1 css-b62m3t-container']//div[@class='select__value-container css-hlgwow']");
public MPPurchasedleads(WebDriver driver) {
	this.driver=driver;
}
public void purchsed()
{
	driver.findElement(purchasedleads).click();
}
public void actions() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(checkbox).click();
	driver.findElement(actions).click();
	driver.findElement(copy).click();
	driver.findElement(selectagntdrp).click();
	driver.findElement(slctagnt).click();
	driver.findElement(submitagentcpy).click();
}
public void move() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(checkbox).click();
	driver.findElement(actions).click();
	driver.findElement(move).click();
	driver.findElement(selectagntdrp).click();
	driver.findElement(slctagnt).click();
	driver.findElement(submitagentcpy).click();
}
public void shwnm()
{
driver.findElement(shw).click();
Select drp = new Select(driver.findElement(shw));
drp.selectByVisibleText("10");
System.out.println("number selected");
}
/*public void search()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(search).click();
	driver.findElement(slctsrch).click();
	driver.findElement(entrsrch).sendKeys("Kelly");
	driver.findElement(sbmtsrch).click();
}*/
public void status()

{
	driver.findElement(checkbox).click();
	driver.findElement(setstatus).click();
	driver.findElement(selectstatus).click();
	driver.findElement(update).click();
	System.out.println("Status updated");
}
public void printslcted()
{
	driver.findElement(checkbox).click();
	driver.findElement(printselected).click();
	System.out.println("print selected");
}
public void dwnld() throws InterruptedException
{
	driver.findElement(checkbox).click();
	driver.findElement(dwnldbutn).click();
	driver.findElement(dwnldselectd).click();
	System.out.println("Download selected");
	Thread.sleep(2000);
	driver.findElement(dwnldbutn).click();
	driver.findElement(dwnldall).click();
	System.out.println("Download all");
}

public void applyfltr() throws InterruptedException
{
	driver.findElement(applyfilter).click();
	driver.findElement(applyfiltrstats).click();
	Thread.sleep(2000);
	driver.findElement(slctedapplyfltr).click();
	driver.findElement(submitstatusfiltr).click();
	System.out.println("filter status");
	driver.findElement(editfilter).click();
	driver.findElement(resetstatus).click();
	System.out.println("reset status");
	driver.findElement(resetfilter).click();
	System.out.println("reset filter");
}
public void applyfltrcmp(String cmpg)
{
	driver.findElement(applyfilter).click();
	driver.findElement(cmpgnid).sendKeys(cmpg);
	System.out.println("Filter campgainid");
	driver.findElement(submitstatusfiltr).click();
	System.out.println("filter cmgid");
	driver.findElement(editfilter).click();
	driver.findElement(resetstatus).click();
	System.out.println("reset campgainid");
	driver.findElement(resetfilter).click();
	System.out.println("reset filter");
}
public void applyfltrmrg(String mrtg) 
{
	driver.findElement(applyfilter).click();
	driver.findElement(mrgid).sendKeys(mrtg);
	System.out.println("Filter mortgageid");
	driver.findElement(submitstatusfiltr).click();
	System.out.println("filter mortgageid");
	driver.findElement(editfilter).click();
	driver.findElement(resetstatus).click();
	System.out.println("reset mortgageid");
	driver.findElement(resetfilter).click();
	System.out.println("reset filter");
	
}
public void applyfiltstate(String ste) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(applyfilter).click();
	driver.findElement(state).sendKeys(ste);
	driver.findElement(submitstatusfiltr).click();
	System.out.println("filtered state");
	driver.findElement(editfilter).click();
	driver.findElement(resetfilter).click();
	System.out.println("reset filter--state");
}
public void applyfiltrcnty(String cnty)
{
	driver.findElement(applyfilter).click();
	driver.findElement(county).sendKeys(cnty);
	driver.findElement(submitstatusfiltr).click();
	System.out.println("filtered county");
	driver.findElement(editfilter).click();
	driver.findElement(resetfilter).click();
	System.out.println("reset filter--county");
}
public void applyfltrnme(String nme) {
	driver.findElement(applyfilter).click();
	driver.findElement(name).sendKeys(nme);
	driver.findElement(submitstatusfiltr).click();
	System.out.println("filtered name");
}
public void downloadapplyfltr(String cmp,String id,String ste,String cnty,String nme)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(applyfilter).click();
	driver.findElement(applyfiltrstats).click();
	driver.findElement(slctedapplyfltr).click();
	driver.findElement(cmpgnid).sendKeys(cmp);
	driver.findElement(mrgid).sendKeys(id);
	driver.findElement(state).sendKeys(ste);
	driver.findElement(county).sendKeys(cnty);
	driver.findElement(name).sendKeys(nme);
	driver.findElement(submitstatusfiltr).click();
	driver.findElement(dwnldbutn).click();
	driver.findElement(dwnldall).click();
}
public void nte(String notetxt)
{
	driver.findElement(note).click();
	driver.findElement(txtnte).sendKeys(notetxt);
	driver.findElement(submitnte).click();
	System.out.println("note submitted");
	//driver.findElement(mrtgidopn).click();
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");	
	driver.findElement(addeditnote).click();*/
}
public void silvercopy() throws InterruptedException
{
	driver.findElement(silver).click();
	actions();	
}
public void silvermove()
{
	driver.findElement(silver).click();
	move();
}
public void shwsilver()
{
	driver.findElement(silver).click();
	shwnm();
}
public void statussilver()
{
	driver.findElement(silver).click();
	driver.findElement(checkbox).click();
	driver.findElement(setstatussilver).click();
	driver.findElement(selectstatus).click();
	driver.findElement(update).click();
	
}
public void printsilver()
{
	driver.findElement(silver).click();
	printslcted();
}
public void dwnldsilver() throws InterruptedException
{
	driver.findElement(silver).click();
	dwnld();
}
public void applyfiltrsilver() throws InterruptedException
{
	driver.findElement(silver).click();
	applyfltr();
}
public void applyfltrcmgslvr(String cmpg)
{
	driver.findElement(silver).click();
	applyfltrcmp(cmpg);
}
public void applyfltrmrgslvr(String mrtg)
{
	driver.findElement(silver).click();
	applyfltrmrg(mrtg);
}
public void applyfltrstateslvr(String ste)
{
	driver.findElement(silver).click();
	applyfiltstate(ste);
}
public void applyfltrcountyslvr(String cnty)
{
	driver.findElement(silver).click();
	applyfiltrcnty(cnty);
}
public void applyfltrnameslvr(String nme)
{
	driver.findElement(silver).click();
	applyfltrnme(nme);
}
public void downloadapplyfltrslvr(String cmp,String id,String ste,String cnty,String nme)
{
	downloadapplyfltr(cmp,id,ste, cnty, nme);
}
public void ntesilver(String notetxt)
{
	driver.findElement(silver).click();
	nte(notetxt);
}
public void bob()
{
	driver.findElement(bookofbus).click();
}
}


