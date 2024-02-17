package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPCheckoutPage {
	WebDriver driver;

	By addNewAddress=By.xpath("//button[@class='btn btn- d-block w-100']");
	By addressInput=By.xpath("//input[@id='address']");
	By stateSelect=By.xpath("//body/div[@id='root']/div[@class='wrapper vertical-layout navbar-floating footer-static vertical-menu-modern menu-expanded']/div[@class='app-content content overflow-hidden']/div[@class='container-xxl p-0']/div[@class='row']/div[@class='mb-2 col-md-8']/div[@class='accordion-without-arrow accordion']/div[@class='accordion-item']/div[@class='accordion-collapse collapse show']/div[@class='accordion-body']/form[@class='list-view product-checkout']/div[@class='row']/div[3]/div[1]/div[1]/div[1]/div[1]");
	By stateList=By.xpath("//div[text()='Alaska']");
	By citySelect=By.xpath("//div[@id='city']//div[@class=' css-19bb58m']");
	By cityList=By.xpath("//div[text()='Akutan']");
	By zipCode=By.xpath("//input[@id='zip']");
	By addressTypeSelect=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]");
	By addressTypeList=By.xpath("//div[text()='Home']");
	By saveAddressForFutureCheckbox=By.xpath("//input[@id='basic-cb-checked']");
	By confirmAddress=By.xpath("//button[normalize-space()='Confirm Address']");
	By addNewPayment=By.xpath("//button[@class='w-100 mb-1 btn btn-']");
	By cardSelectCheckbox=By.xpath("//label[normalize-space()='Credit/Debit Card']//input");
	By cardNumberInput=By.xpath("//input[@placeholder='0000 0000 0000 0000']");
	By cardHolderName=By.xpath("//input[@id='name']");
	By expirationDate=By.xpath("//input[@id='expiration']");
	By cardSecurityCode=By.xpath("(//input[@id='security_code'])[1]");
	By placeOrderButton=By.xpath("//button[normalize-space()='Place Order']");
	By couponSelect=By.xpath("//div[@class='select__input-container css-19bb58m']");
	By couponList=By.xpath("//div[@class='select__menu css-1nmdiq5-menu']/div/div[text()='PromoAutomation']");
	By promoApply=By.xpath("//button[normalize-space()='Apply']");

	public MPCheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkoutAddress() {
	
		driver.findElement(addNewAddress).click();
		driver.findElement(addressInput).sendKeys("Test Automation");
		driver.findElement(stateSelect).click();
		driver.findElement(stateList).click();
		driver.findElement(citySelect).click();
		driver.findElement(cityList).click();
		driver.findElement(zipCode).sendKeys("12345");
		driver.findElement(addressTypeSelect).click();
		driver.findElement(addressTypeList).click();
		driver.findElement(saveAddressForFutureCheckbox).click();
		driver.findElement(confirmAddress).click();
	}
	
	public void checkoutPromoCoupon() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(couponSelect).click();
		driver.findElement(couponList).click();
		driver.findElement(promoApply).click();
	}
	
	public void checkoutCard() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(addNewPayment).click();
		driver.findElement(cardSelectCheckbox).click();
		driver.findElement(cardNumberInput).sendKeys("6011000000000012");
		driver.findElement(cardHolderName).sendKeys("Geethu");
		driver.findElement(expirationDate).click();
		driver.findElement(expirationDate).sendKeys("122025");
		driver.findElement(cardSecurityCode).sendKeys("123");
		Thread.sleep(3000);

		driver.findElement(placeOrderButton).click();
	}
}