package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPPromoCodePage {
	WebDriver driver;
	By promocode = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[6]/a/span");
	By addPromoButton = By.xpath("//button[@class='ml-2 btn btn-primary']");
	By promoNameInput = By.xpath("//input[@name='PromocodeCode']");
	By promoDescriptionInput = By.xpath("//textarea[@name='Description']");
	By promoLimitInput=By.xpath("//input[@name='Limit']");
	By typeField=By.xpath("//label[normalize-space()='Type']//following::div[1]");
	By statusField=By.xpath("//label[normalize-space()='Status']//following::div[1]");
	By statusEnable=By.xpath("//div[@id='react-select-9-listbox' or @class=' css-1nmdiq5-menu']/div/div[1]");
	By statusDisable=By.xpath("//div[@id='react-select-9-listbox' or @class=' css-1nmdiq5-menu' ]/div/div[2]");
	By oneMonthGold = By.xpath("//div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[7]");
	By oneMonthSilver = By.xpath("//div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[6]");
	By twoMonthGold = By.xpath("//div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[3]");
	By twoMonthSilver = By.xpath("//div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[1]");
	By threeMonthGold = By.xpath("///div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[4]");
	By threeMonthSilver = By.xpath("//div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[2]");
	By nineMonthGold = By.xpath("//div[@id='react-select-8-listbox' or @class=' css-1nmdiq5-menu']/div/div[5]");
	By submitButton=By.xpath("//button[normalize-space()='Submit']");

	By promoCreated= By.xpath("//a[normalize-space()='PromoAutomation']");
	By addMemberButton=By.xpath("//button[@type='button']");
	By selectUser=By.xpath("//div[@class='select__input-container css-19bb58m']");
	By memberList=By.xpath("//div[text()='Geethu test user2']");
	By memberSubmitButton=By.xpath("//button[normalize-space()='Submit']");
	By selectMember=By.xpath("//input[@name='select-all-rows']");
	By removeMemberButton=By.xpath("//button[@type='button']");
	By deleteMemberConfirm=By.xpath("//button[normalize-space()='Yes, delete it!']");
	
	public MPPromoCodePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addPromoCode() throws InterruptedException {
		driver.findElement(promocode).click();
		driver.findElement(addPromoButton).click();
		driver.findElement(promoNameInput).sendKeys("PromoAutomation");
		driver.findElement(promoDescriptionInput).sendKeys("automation testing");
		driver.findElement(promoLimitInput).sendKeys("3");
		driver.findElement(typeField).click();
		driver.findElement(threeMonthSilver).click();
		driver.findElement(statusField).click();
		driver.findElement(statusEnable).click();
		driver.findElement(submitButton).click();
	}
	
	public void addPromoUsers() throws InterruptedException   {
		driver.findElement(promoCreated).click();
		Thread.sleep(2000);
		driver.findElement(addMemberButton).click();
		driver.findElement(selectUser).click();
		driver.findElement(memberList).click();
		driver.findElement(memberSubmitButton).click();
	}
	
	public void removeUsers() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(selectMember).click();
		driver.findElement(removeMemberButton).click();
		driver.findElement(deleteMemberConfirm).click();
	}
	

}
