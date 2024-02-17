package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UsersPage {
	WebDriver driver;
	By users = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/a/span");
	By addUserButton= By.xpath("//span[text()='Add New User']");
	By nameField= By.xpath("//input[@id='name']");
	By emailField=By.xpath("//input[@id='email']");
	By phoneField=By.xpath("//input[@id='phone']");
	By userRoleField=By.xpath("//select[@id='user_role']");
	By typeField=By.xpath("//div[@class='select__control css-1eyvi4t-control']");
	By mtgType=By.xpath("//div[contains(text(),'NEW MTG')]");
	By retroType=By.xpath("//div[contains(text(),'RETRO MTG')]");
	By fexType=By.xpath("//div[contains(text(),'FEX')]");
	By submitButton=By.xpath("//button[@type='submit']");
	By autoGenerate=By.xpath("//div[@class='mb-1 col-md-2']/div/label");
	By searchField=By.xpath("//input[@id='search-input']");
	By agentIDField=By.xpath("//input[@name='value']");
	By autogener = By.xpath("//div[@class='customCheck custom-checkbox custom-control']/input");
	public UsersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addNewUser() {
		driver.findElement(users).click();
		driver.findElement(addUserButton).click();
		driver.findElement(nameField).sendKeys("sample1");
		driver.findElement(emailField).sendKeys("irj58500@omeie.com");
		driver.findElement(phoneField).sendKeys("9874563210");
		Select userRole = new Select(driver.findElement(userRoleField));
		userRole.selectByValue("2");
		driver.findElement(typeField).click();
		driver.findElement(fexType).click();
		//driver.findElement(autoGenerate).click();
		driver.findElement(agentIDField).sendKeys("7890");
		driver.findElement(submitButton).click();
	}
	
	public void searchUser() {
		driver.findElement(searchField).sendKeys("sample1");
		
	}

}
