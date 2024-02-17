package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Arialeads {
	WebDriver driver;
	By searchAgent = By.xpath("//input[@id='search-input']");
	By agentsearchButton = By.xpath("//button[@type='button']");
	By actions = By.xpath("//div[@class='d-flex']/div/span");
	By viewLeads = By.xpath("//span[text()='View Lead']");
	By goldLeads = By.xpath("//a[text()='Gold']");
	By silverLeads = By.xpath("//a[text()='Silver']");
	By mailedLeads = By.xpath("//a[text()='Mailed Data visible to agent']");
	By bookofbusinessLeads = By.xpath("//a[text()='Book of Business']");
	By tableRow = By.xpath("//div[@class='sc-AxiKw jeFspv rdt_TableHeadRow']/div");
	By tableColumn = By.xpath("//div[@role='row']");

	By downloadAllLeadInformationButton = By
			.xpath("//div[@class='d-flex align-items-center justify-content-end mb-1']//button[@type='button']");
	By downloadButton = By.xpath("//span[normalize-space()='Download']");
	By downloadAllButton = By.xpath("//a[normalize-space()='Download All']");
	By downloadSelectedLeadButton = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By printSelectedLeadButton = By.xpath("//span[normalize-space()='Print Selected Leads']");
	By applyfilters = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-primary']");
	By selectAllRows = By.xpath(
			"//div[@class='sc-AxhCb sc-fznKkj khGtBZ rdt_TableCol']//div[@class='custom-control custom-checkbox']");
	By listSearchElements = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div");
	By searchInput = By.xpath("//input[@id='search-input']");
	By searchButton = By.xpath("//button[normalize-space()='Search']");
	By selectBox = By.xpath("2");
	By setStatus = By.xpath("//div[@class='react-select setStatus css-2b097c-container']");
	By soldStatus = By.xpath("//div[@id='react-select-7-option-8']");
	By updateStatusButton = By.xpath("//button[normalize-space()='Update']");
	By browseupload = By.xpath("//div[@class='uppy-DragDrop-inner']");
	By uploadSubmitButton = By.xpath("//button[normalize-space()='Submit']");
	By addNotes=By.xpath("//div[@id='row-0']/div[3]/span[1]");
	By noteContent=By.xpath("//textarea[@id='add_note']");
	By submitNotes=By.xpath("//button[normalize-space()='Submit']");
	By arialeads = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/button");
	By ariacntrls = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[1]/a/span");
	By downloadalllead = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[1]/div/button/span");
	By checkboxgld = By.xpath("//*[@id=\"row-3\"]/div[1]/div");
	By actionsgld = By.xpath("//div[@class='select__value-container css-1hwfws3'][1]");
	By copy = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By selectagntgld = By.xpath("//div[@class='react-select css-2b097c-container']//div[@class='select__value-container css-1hwfws3']");
	By selectedagentgld = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[100]");
	By submitgld = By.xpath("//button[@class='me-1 btn btn-primary']");
	By movegld = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[2]");
	By applyfiltersgld = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-primary']");
	By cancelgld = By.xpath("//button[@class='btn btn-outline-secondary']");
	By status = By.xpath("//span[@class='d-flex']//div[@class='select__value-container css-1hwfws3']");
	By statustype = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[2]");
	By submitfilter = By.xpath("//button[normalize-space()='Submit']");
	By campaign = By.xpath("//input[@class='form-control'][1]");
	By mrgtid = By.xpath("//input[@inputmode='numeric']");
	By state = By.xpath("//div[@role='dialog']//div[4]//div[1]//input[1]");
	By county = By.xpath("//div//div[5]//div[1]//input[1]");
	By name = By.xpath("//input[@id='summary1']");
	By submitfiltr = By.xpath("//button[normalize-space()='Submit']");
	By resetfltr = By.xpath("//button[normalize-space()='Reset Filters']");
	By editfltr = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-danger']");
	By downloadbtn = By.xpath("//div[@class='ml-1 btn-group']");
	By downloadall = By.xpath("//a[normalize-space()='Download All']");
	By settstatusmailed = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div[3]/div[1]/div/span/div/div/div[1]");
	By slctdstatusmailed = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[1]");
	By update = By.xpath("//button[@class='ml-1 btn btn-primary']");
	By shw = By.xpath("//select[@id='sort-select']");
	By prntslctdlds = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div[3]/div[2]/button");
	By dwnldslctd = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By note = By.xpath("//div[@class='sc-AxhCb sc-AxhUy sc-AxgMl kSZwH rdt_TableCell'][1]/span[1]");
	By txtnte = By.xpath("//textarea[@id='add_note']");
	By submitnte = By.xpath("//button[normalize-space()='Submit']");
	By mrtgidopn = By.xpath("//div[@class='sc-AxhCb sc-AxhUy sc-AxgMl kSZwH rdt_TableCell'][1]/a[1]");
	By addeditnote = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div[2]/button");
	By chckbxsilver = By.xpath("//*[@id=\"row-0\"]/div[1]/div");
	By dwnldalllead = By.xpath("//button[@class='ml-1 btn btn-outline-primary'][1]");
	By maileddata = By.xpath("//a[normalize-space()='Mailed Data visible to agent']");
	By bookofbusiness = By.xpath("//a[normalize-space()='Book of Business']");
	By setstatussilver = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/span/div/div/div[1]");
	By selectedstatussilver = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[1]");
	By setstatusgold = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div[3]/div[1]/div/span/div/div/div[1]");
	By selectedstatusgold = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[1]");
	By printselectedsilver = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/button");
	By downloadsilver = By.xpath("//button[@class='btn btn-outline-primary']");
	By downloadselectedsilver = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By printselectedmailed = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div[3]/div[2]/button");
	By downloadmailed  = By.xpath("//button[@class='btn btn-outline-primary']");
	By downloadselectedmailed = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By filtrstatebob = By.xpath("//div[@role='dialog']//div[3]//div[1]//input[1]");
	By filtermrgbob = By.xpath("//input[@inputmode='numeric']");
	By printselectedbob = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[4]/div[1]/div[3]/div[2]/button");
	By filtercountybob = By.xpath("//div[@role='dialog']//div[4]//div//input");
	By filternamebob = By.xpath("//div[@role='dialog']//div[5]//div//input");
	By viewuplddoc = By.xpath("//div[@id='row-1']//span[@title='Click Here to List Uploaded Documents']//*[name()='svg']");
	By upldeddoc = By.xpath("//a[normalize-space()='382_1698938035_Screenshot (1).png']");
	//By shw = By.xpath("//select[@id='sort-select']");
	public Arialeads(WebDriver driver)
	{
		this.driver=driver;
	}
	public void arialeads()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(arialeads).click();
	//driver.findElement(ariacntrls).click();
	}
	public void agentControls() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(ariacntrls).click();
		driver.findElement(searchAgent).sendKeys("1002");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(agentsearchButton).click();
		Thread.sleep(1000);
		driver.findElement(actions).click();
		driver.findElement(viewLeads).click();

	}

	public void agentSinglePage() {
		List<WebElement> rowCount = driver.findElements(tableRow);
		rowCount.size();
		List<WebElement> columnCount = driver.findElements(tableColumn);
		columnCount.size();

		for (int i = 0; i < columnCount.size(); i++) {
			WebElement name = columnCount.get(i);
			String Output = name.getText();
			System.out.print("output of column: "+Output);
		}
	}
	public void gold() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkboxgld).click();
		driver.findElement(actionsgld).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntgld).click();
		WebElement slct = driver.findElement(selectedagentgld);
		Actions actions = new Actions(driver);
		actions.scrollToElement(slct).perform();
		slct.click();
		driver.findElement(submitgld).click();
		driver.findElement(cancelgld).click();
	}
	public void movegld() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkboxgld).click();
		driver.findElement(actionsgld).click();
		driver.findElement(movegld).click();
		driver.findElement(selectagntgld).click();
		WebElement slctm = driver.findElement(selectedagentgld);
		Actions action = new Actions(driver);
		action.scrollToElement(slctm).perform();
		slctm.click();
		driver.findElement(submitgld).click();
		driver.findElement(cancelgld).click();
		}
	public void shwnm()
	{
	driver.findElement(shw).click();
	Select drp = new Select(driver.findElement(shw));
	drp.selectByVisibleText("10");
	System.out.println("number selected");
	}
	public void applyfiltrsts()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(applyfiltersgld).click();
		driver.findElement(status).click();
		driver.findElement(statustype).click();
		driver.findElement(submitfiltr).click();
		System.out.println("filtered status");
		driver.findElement(editfltr).click();
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--status");
	}
	public void applyfltercmp(String cmp)
	{
		driver.findElement(applyfiltersgld).click();
		driver.findElement(campaign).sendKeys(cmp);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered cmpid");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--cmp");
	}
	public void applyfiltrmrg(String id) {
		
		driver.findElement(applyfiltersgld).click();
		driver.findElement(mrgtid).sendKeys(id);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered mrgid");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--mrgid");
	}
	public void applyfiltstate(String ste) {
		driver.findElement(applyfiltersgld).click();
		driver.findElement(state).sendKeys(ste);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered state");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--state");
	}
	public void applyfiltrcnty(String cnty)
	{
		driver.findElement(applyfiltersgld).click();
		driver.findElement(county).sendKeys(cnty);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered county");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--county");
	}
	public void applyfltrnme(String nme) {
		driver.findElement(applyfiltersgld).click();
		driver.findElement(name).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered name");
	}
	public void downloadapplyfltr(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(applyfiltersgld).click();
		driver.findElement(status).click();
		driver.findElement(statustype).click();
		driver.findElement(campaign).sendKeys(cmp);
		driver.findElement(mrgtid).sendKeys(id);
		driver.findElement(state).sendKeys(ste);
		driver.findElement(county).sendKeys(cnty);
		driver.findElement(name).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		driver.findElement(downloadbtn).click();
		driver.findElement(downloadall).click();
	
	}
	public void setstatus()
	{
		driver.findElement(checkboxgld).click();
		driver.findElement(setstatusgold).click();
		driver.findElement(selectedstatusgold).click();
		driver.findElement(update).click();
		System.out.println("status updates");
	}
	public void printslcted()
	{
		driver.findElement(checkboxgld).click();
		driver.findElement(prntslctdlds).click();
		System.out.println("print selected lead");
	}
	public void dwnld()
	{
		driver.findElement(checkboxgld).click();
		driver.findElement(downloadbtn).click();
		driver.findElement(dwnldslctd).click();
		System.out.println("download selected");
		driver.findElement(downloadbtn).click();
		driver.findElement(downloadall).click();
		System.out.println("download all");
		driver.findElement(dwnldalllead).click();
		System.out.println("dwnldalllead");
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

	public void agentSilverLeads() {
		driver.findElement(silverLeads).click();
		driver.findElement(chckbxsilver).click();
		driver.findElement(actionsgld).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntgld).click();
		WebElement slct = driver.findElement(selectedagentgld);
		Actions actions = new Actions(driver);
		actions.scrollToElement(slct).perform();
		slct.click();
		driver.findElement(submitgld).click();
		driver.findElement(cancelgld).click();
	}
	public void movesilver()
	{
		driver.findElement(silverLeads).click();
		driver.findElement(chckbxsilver).click();
		driver.findElement(actionsgld).click();
		driver.findElement(movegld).click();
		driver.findElement(selectagntgld).click();
		WebElement slctm = driver.findElement(selectedagentgld);
		Actions action = new Actions(driver);
		action.scrollToElement(slctm).perform();
		slctm.click();
		driver.findElement(submitgld).click();
		driver.findElement(cancelgld).click();
	}
	public void shwslvr()
		{
		driver.findElement(silverLeads).click();
		shwnm();
		}
	public void filtersilver(String cmp,String id,String ste,String cnty,String nme)
		{
		driver.findElement(silverLeads).click();
		applyfiltrsts();
		applyfltercmp(cmp);
		applyfiltrmrg(id);
		applyfiltstate(ste);
		applyfiltrcnty(cnty);
		applyfltrnme(nme);
		}
	public void dwnldfiltersilver(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(silverLeads).click();
		downloadapplyfltr(cmp,id,ste, cnty, nme);
	}
	public void setstatussilver() throws InterruptedException {
		driver.findElement(silverLeads).click();
		Thread.sleep(2000);
		driver.findElement(chckbxsilver).click();
		driver.findElement(setstatussilver).click();
		driver.findElement(selectedstatussilver).click();
		driver.findElement(update).click();
		System.out.println("Status updated");
	}
	public void prntsilver() throws InterruptedException {
		driver.findElement(silverLeads).click();
		Thread.sleep(2000);
		driver.findElement(chckbxsilver).click();
		driver.findElement(printselectedsilver).click();
	}
	public void dwnldsilver()
	{
			driver.findElement(silverLeads).click();
			driver.findElement(chckbxsilver).click();
			driver.findElement(downloadsilver).click();
			driver.findElement(downloadselectedsilver).click();
			System.out.println("download selected");
			driver.findElement(downloadsilver).click();
			driver.findElement(downloadall).click();
			System.out.println("download all");
			driver.findElement(dwnldalllead).click();
			System.out.println("dwnldalllead");
		
	}
	public void ntesilver(String notetxt)
	{
		driver.findElement(silverLeads).click();
		nte(notetxt);
	
	}
	public void mailed()
	{
		driver.findElement(maileddata).click();
		driver.findElement(chckbxsilver).click();
		driver.findElement(actionsgld).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntgld).click();
		WebElement slct = driver.findElement(selectedagentgld);
		Actions actions = new Actions(driver);
		actions.scrollToElement(slct).perform();
		slct.click();
		driver.findElement(submitgld).click();
		driver.findElement(cancelgld).click();
	}
		public void movemailed()
		{
			driver.findElement(maileddata).click();
			driver.findElement(chckbxsilver).click();
			driver.findElement(actionsgld).click();
			driver.findElement(movegld).click();
			driver.findElement(selectagntgld).click();
			WebElement slctm = driver.findElement(selectedagentgld);
			Actions action = new Actions(driver);
			action.scrollToElement(slctm).perform();
			slctm.click();
			driver.findElement(submitgld).click();
			driver.findElement(cancelgld).click();
		}
		public void shwmailed()
		{
			driver.findElement(maileddata).click();
		shwnm();
		}
	public void filtermailed(String cmp,String id,String ste,String cnty,String nme)
		{
		driver.findElement(maileddata).click();
		applyfiltrsts();
		applyfltercmp(cmp);
		applyfiltrmrg(id);
		applyfiltstate(ste);
		applyfiltrcnty(cnty);
		applyfltrnme(nme);
		}
	public void dwnldfiltermailed(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(maileddata).click();
		downloadapplyfltr(cmp,id,ste, cnty, nme);
	}
	public void setstatusmailed() throws InterruptedException {
		driver.findElement(maileddata).click();
		Thread.sleep(2000);
		driver.findElement(chckbxsilver).click();
		Thread.sleep(2000);
		driver.findElement(settstatusmailed).click();
		driver.findElement(slctdstatusmailed).click();
		driver.findElement(update).click();
		System.out.println("Status updated");
	}
	public void prntmailed() throws InterruptedException {
		driver.findElement(maileddata).click();
		Thread.sleep(2000);
		driver.findElement(chckbxsilver).click();
		driver.findElement(printselectedmailed).click();
	}
	public void dwnldmailed()
	{
		driver.findElement(maileddata).click();
		driver.findElement(chckbxsilver).click();
		driver.findElement(downloadmailed).click();
		driver.findElement(downloadselectedmailed).click();
		System.out.println("download selected");
		driver.findElement(downloadmailed).click();
		driver.findElement(downloadall).click();
		System.out.println("download all");
		driver.findElement(dwnldalllead).click();
		System.out.println("dwnldalllead");
	}
	public void ntemailed(String notetxt)
	{
		driver.findElement(maileddata).click();
		nte(notetxt);
	
	}
	
		
	public void shwbob()
		{
			driver.findElement(bookofbusiness).click();
		shwnm();
		}
	public void filterbob(String cmp,String id,String ste,String cnty,String nme)
		{
		driver.findElement(bookofbusiness).click();
		applyfltercmp(cmp);
		applyfiltrmrg(id);
		applyfiltstate(ste);
		applyfiltrcnty(cnty);
		applyfltrnme(nme);
		}
	public void downloadapplyfltrbob(String cmp,String mrg,String ste,String cty,String nme)
	{
		driver.findElement(bookofbusiness).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(applyfiltersgld).click();
		//driver.findElement(status).click();
		//driver.findElement(statustype).click();
		driver.findElement(campaign).sendKeys(cmp);
		driver.findElement(filtermrgbob).sendKeys(mrg);
		driver.findElement(filtrstatebob).sendKeys(ste);
		driver.findElement(filtercountybob).sendKeys(cty);
		driver.findElement(filternamebob).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		driver.findElement(downloadbtn).click();
		driver.findElement(downloadall).click();
	}

	
	public void prntbob() throws InterruptedException {
		driver.findElement(bookofbusiness).click();
		Thread.sleep(2000);
		driver.findElement(chckbxsilver).click();
		driver.findElement(printselectedbob).click();
	}
	public void dwnldbob()
	{
		driver.findElement(bookofbusiness).click();
		dwnld();
	}
	public void ntebob(String notetxt)
	{
		driver.findElement(bookofbusiness).click();
		nte(notetxt);
	
	}
	public void viewuploaddoc() throws InterruptedException
	{
		driver.findElement(bookofbusiness).click();
		Thread.sleep(2000);
		driver.findElement(viewuplddoc).click();
		driver.findElement(upldeddoc).click();
	}
		/*driver.findElement(applyfilters).click();
		WebElement count = driver.findElements(listSearchElements).get(0);
		count.click();
		driver.findElement(searchInput).sendKeys("LUTFEY Garcia");
		driver.findElement(searchButton).click();
		driver.findElement(downloadButton).click();
		driver.findElement(downloadAllButton).click();
		driver.findElement(downloadalllead).click();*/
	}
	
	
	

