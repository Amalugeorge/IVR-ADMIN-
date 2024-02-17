package Page;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MPHomePage {
	WebDriver driver;
	
	By stateDropdown = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div[3]/div/div/div/div[1]/div[2]");
	By stateList = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[10]");
	By countyDropdown = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div[4]/div/div/div/div[1]/div[2]");
	By countyList = By.xpath("//div[text()='All']");
	By oneMonthGold = By.xpath("//div[@id='cell-4-1']//input[@name='quality']");
	By oneMonthSilver = By.xpath("//div[@id='cell-4-5']//input[@name='quality']");
	By twoMonthGold = By.xpath("//div[@id='cell-4-2']//input[@name='quality']");
	By twoMonthSilver = By.xpath("//div[@id='cell-4-6']//input[@name='quality']");
	By threeMonthGold = By.xpath("//div[@id='cell-4-3']//input[@name='quality']");
	By threeMonthSilver = By.xpath("//div[@id='cell-4-7']//input[@name='quality']");
	By nineMonthGold = By.xpath("//div[@id='cell-4-4']//input[@name='quality']");
	By addToCartButton = By.xpath("//button[@class='btn btn-primary']");
	By placeOrderButtonck=By.xpath("//button[@class='btn-next place-order btn btn-primary d-block w-100']");
	By mrkplce = By.xpath("//a[normalize-space()='Marketplace']");
	By home = By.xpath("//a[@class='d-flex align-items-center active']");
	By alert = By.xpath("//button[normalize-space()='OK']");
	By agree = By.xpath("//button[normalize-space()='I agree']");
	By uparrow = By.xpath("//div[@class='scroll-top d-block']");
	By fex9mnthslvr = By.xpath("//div[@id='cell-4-18']//input[@name='quality']");
	By fex9mnthgld = By.xpath("//div[@id='cell-4-17']//input[@name='quality']");
	By addtocart = By.xpath("//button[@class='btn btn-outline-primary']");
	By cart = By.xpath("//a[@class='nav-link position-relative']");
	By deleteicon = By.xpath("//div[@class='scrollbar-container scrollable-container media-list ps']//div[1]//div[1]//span[1]//*[name()='svg']");
	By yesdelete = By.xpath("//button[normalize-space()='Yes, delete it!']");
	By deleteok = By.xpath("//button[normalize-space()='OK']");
	By viewcart = By.xpath("//a[normalize-space()='View Cart']");
	By removeitem = By.xpath("//label[normalize-space()='Remove']");
	By ysdeleteremve = By.xpath("//button[normalize-space()='Yes, delete it!']");
	By plus = By.xpath("//li[4]//button[1]//*[name()='svg']");
	By minus = By.xpath("//li[2]//button[1]//*[name()='svg']");
	By placeorder = By.xpath("//button[@class='btn-next place-order btn btn-primary d-block w-100']");
	
	By addNewAddress=By.xpath("//button[@class='btn btn- d-block w-100']");
	By addressInput=By.xpath("//input[@id='address']");
	By stateSelect=By.xpath("//body/div[@id='root']/div[@class='wrapper vertical-layout navbar-floating footer-static vertical-menu-modern menu-expanded']/div[@class='app-content content overflow-hidden']/div[@class='container-xxl p-0']/div[@class='row']/div[@class='mb-2 col-md-8']/div[@class='accordion-without-arrow accordion']/div[@class='accordion-item']/div[@class='accordion-collapse collapse show']/div[@class='accordion-body']/form[@class='list-view product-checkout']/div[@class='row']/div[3]/div[1]/div[1]/div[1]/div[1]");
	By stateListck=By.xpath("//div[text()='Alaska']");
	By city=By.xpath("//input[@id='city_input']");
	By zipCode=By.xpath("//input[@id='zip']");
	By addressTypeSelect=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]");
	By addressTypeList=By.xpath("//div[text()='Home']");
	By saveAddressForFutureCheckbox=By.xpath("//input[@id='basic-cb-checked']");
	By confirmAddress=By.xpath("//button[normalize-space()='Confirm Address']");
	By addNewPayment=By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div[4]/div/div/div/div[2]/form/div[6]/div/h2/button/button");
	By cardSelectCheckbox=By.xpath("//button[@class='w-100 mb-1 btn btn-']");
	By cardNumberInput=By.xpath("//input[@placeholder='0000 0000 0000 0000']");
	By cardHolderName=By.xpath("//input[@id='name']");
	By expirationDate=By.xpath("//input[@id='expiration']");
	By cardSecurityCode=By.xpath("(//input[@id='security_code'])[1]");
	By placeOrderButton=By.xpath("//button[normalize-space()='Place Order']");
	By couponSelect=By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div[5]/div/div/div/div[1]/div/div/div[1]");
	By couponList=By.xpath("//div[@class='select__menu-list css-qr46ko']/div");
	By promoApply=By.xpath("//button[normalize-space()='Apply']");
	By totlcst = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div[5]/div/div/div/div[2]/div[3]/div[2]/b");
	By savedaddresschckbx = By.xpath("//input[@class='form-check-input'][1]");
	By savedaddress = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div[4]/div/div/div/div[2]/form/label[1]");
	By savedcardchckbx = By.xpath("//*[@id=\"40fef38a-125d-4956-9a4a-5969b04d96bb\"]");
	//By slctstate = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]");
	public MPHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void mrp() throws InterruptedException
	{
		//Thread.sleep(5000);
		
		driver.findElement(mrkplce).click();
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);*/
		
	}
	public void selectLeads() throws InterruptedException {
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	//Thread.sleep(9000);
		

		driver.findElement(alert).click();
		driver.findElement(home).click();
		/*Alert a = driver.switchTo().alert();
		String alerttext = a.getText();
		System.out.println(alerttext);
		a.accept();*/
		Thread.sleep(2000);
		WebElement statedp = driver.findElement(stateDropdown);
		Thread.sleep(2000);
		/*Actions actions = new Actions(driver);
		actions.scrollToElement(statedp).perform();
		statedp.click();*/
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",statedp);*/
		Actions actions = new Actions(driver);
		try {
        actions.moveToElement(statedp).perform();
        Thread.sleep(2000);
        statedp.click();
		}
		catch (MoveTargetOutOfBoundsException moveTargetOutOfBoundsException){

		Thread.sleep(3000);
		statedp.click();
		}
		/*WebElement Element = driver.findElement(By.linkText("Brand New Buy Per Lead - Mortgage Protection Leads"));
		js.executeScript("arguments[0].scrollIntoView();", Element);*/
		//driver.findElement(stateDropdown).click();
		Thread.sleep(2000);
		//try {
		driver.findElement(stateList).click();
		//}
		/*catch(StaleElementReferenceException e)
		{
			driver.findElement(stateList).click();
		}*/
		Thread.sleep(2000);
	}
	public void county() throws InterruptedException
	{
		/*WebElement statedp = driver.findElement(stateDropdown);
		Actions actions = new Actions(driver);
        actions.moveToElement(statedp).perform();*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(countyDropdown).click();
		Thread.sleep(2000);
		driver.findElement(countyList).click();
	}
	public void item() throws InterruptedException
	{
		driver.findElement(fex9mnthslvr).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(addtocart).click();
		driver.findElement(fex9mnthgld).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(addtocart).click();
		driver.findElement(threeMonthGold).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(addtocart).click();
		//driver.findElement(threeMonthSilver).sendKeys("2");
		
		//driver.findElement(uparrow).click();
		//driver.findElement(uparrow).click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		
		
	}
public void delete() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(cart).click();
	driver.findElement(deleteicon).click();
	driver.findElement(yesdelete).click();
	driver.findElement(deleteok).click();
}
public void viewcrt() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Thread.sleep(2000);
	driver.findElement(cart).click();
	driver.findElement(viewcart).click();
	driver.findElement(removeitem).click();
	driver.findElement(ysdeleteremve).click();
	/*Thread.sleep(2000);
	driver.findElement(plus).click();
	Thread.sleep(2000);
	driver.findElement(minus).click();*/
	driver.findElement(placeorder).click();
	driver.findElement(agree).click();
}






public void checkoutAddress(String cty) {

	driver.findElement(addNewAddress).click();
	driver.findElement(addressInput).sendKeys("Test Automation");
	driver.findElement(stateSelect).click();
	driver.findElement(stateListck).click();
	driver.findElement(city).sendKeys(cty);
	driver.findElement(zipCode).sendKeys("12345");
	driver.findElement(addressTypeSelect).click();
	driver.findElement(addressTypeList).click();
	driver.findElement(saveAddressForFutureCheckbox).click();
	driver.findElement(confirmAddress).click();
}

public void checkoutPromoCoupon() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	Thread.sleep(3000);
	driver.findElement(couponSelect).click();
	Thread.sleep(3000);
	driver.findElement(couponList).click();
	driver.findElement(promoApply).click();
}

public void checkoutCard() throws InterruptedException {
	int p=1;
	switch(p)
	{
	case 1 : 	Thread.sleep(2000);
				WebElement plceorderbtn=driver.findElement(placeOrderButtonck);
				Actions action = new Actions(driver);
				action.scrollToElement(plceorderbtn).perform();
				plceorderbtn.click();	
				
				break;
	case 2 : 	WebElement addnewcard = driver.findElement(savedcardchckbx);
				Actions actions = new Actions(driver);
				actions.scrollToElement(addnewcard).perform();
				addnewcard.click();	

				driver.findElement(cardNumberInput).sendKeys("6011000000000012");
				driver.findElement(cardHolderName).sendKeys("Geethu");
				driver.findElement(expirationDate).click();
				driver.findElement(expirationDate).sendKeys("122025");
				driver.findElement(cardSecurityCode).sendKeys("123");
				break;
				
	case 3 :	Thread.sleep(2000);
				WebElement newcrd = driver.findElement(placeOrderButton);
				Actions act = new Actions(driver);
				act.scrollToElement(newcrd).perform();
				Thread.sleep(2000);
				driver.findElement(addNewPayment).click();
}

	Thread.sleep(3000);
	/*WebElement totalcst = driver.findElement(totlcst);
	String zerocst="$0.00";
	if(totalcst.equals(zerocst))
	{
		Thread.sleep(2000);
		driver.findElement(placeOrderButtonck).click();
	}
	else {
	//driver.findElement(addNewPayment).click();
		WebElement addnewcard = driver.findElement(cardSelectCheckbox);

		Actions actions = new Actions(driver);
		actions.scrollToElement(addnewcard).perform();
		addnewcard.click();	
	//driver.findElement(cardSelectCheckbox).click();
	driver.findElement(cardNumberInput).sendKeys("6011000000000012");
	driver.findElement(cardHolderName).sendKeys("Geethu");
	driver.findElement(expirationDate).click();
	driver.findElement(expirationDate).sendKeys("122025");
	driver.findElement(cardSecurityCode).sendKeys("123");
	Thread.sleep(3000);

	driver.findElement(placeOrderButtonck).click();*/
	}
}