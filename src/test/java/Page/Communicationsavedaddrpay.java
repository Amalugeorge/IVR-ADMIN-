package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Communicationsavedaddrpay {
WebDriver driver;
By sameaddr = By.xpath("//input[@id='address240']");
By editaddr = By.xpath("//div[@class='col-md-4']//div[2]//div[1]//*[name()='svg']");
By confmaddr = By.xpath("//button[@type='submit']");
By savedpaym = By.xpath("//input[@id='522322791']");
By cvv = By.xpath("//*[@id=\"card_holder_cvv\"]");
By placeorder =By.xpath("//button[normalize-space()='Place Order']");

public Communicationsavedaddrpay(WebDriver driver) {
	this.driver=driver;
}
public void alreadyentraddr(String cardcod)
{
	driver.findElement(sameaddr).click();
	driver.findElement(editaddr).click();
	driver.findElement(confmaddr).click();
	driver.findElement(savedpaym).click();
	driver.findElement(cvv).sendKeys(cardcod);
	driver.findElement(placeorder).click();
	
}

}
