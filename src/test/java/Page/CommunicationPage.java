package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommunicationPage {
WebDriver driver;
By communication = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[8]/a/span");
By addnewno = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div[1]/button");
By nameinaddnew = By.xpath("//input[@id='name0']");
By phnenoinaddnew = By.xpath("//input[@id='phone0']");
By submitaddnew = By.xpath("//button[normalize-space()='Submit']");
By threedots = By.xpath("//div[@id='cell-5-yldBHMcu-86']//span[@class='pr-1']//*[name()='svg']");
By shw = By.xpath("//select[@id='sort-select']");
By clls = By.xpath("//div[@class='d-flex flex-wrap']/button[2]");
By enteramnt = By.xpath("//input[@placeholder='Enter the Recharge Amount']");
By proceedtochckout = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div[3]/a/button");
By address = By.xpath("//*[@id=\"address\"]");
By state = By.xpath("//*[@id=\"state\"]/div/div[1]");
By selectstate = By.xpath("//*[@id=\"state\"]/div/div[1]");
By city = By.xpath("//*[@id=\"city_manual\"]");
By zip = By.xpath("//*[@id=\"zip\"]");
By addtype = By.xpath("//*[@id=\"type\"]/div[1]/div[1]");
By selctaddrtype = By.xpath("//*[@id=\"type\"]/div[2]");
By checkbox = By.xpath("//input[@id='basic-cb-checked']");
By confmaddr = By.xpath("//button[@type='submit']");
By selctcrd = By.xpath("//div[@class='collapse show']//input[@name='card']");
By cardno = By.xpath("//*[@id=\"card_number\"]");
By cardnm = By.xpath("//*[@id=\"name\"]");
By expirydt = By.xpath("//input[@id='expiration']");
By cvv = By.xpath("//input[@id='cvv']");
By pycheckbx = By.xpath("//div[@class='mb-1 ml-2 mt-1 col-sm-12 col-md-6']//div//input[@id='basic-cb-checked']");
By placeorder =By.xpath("//button[normalize-space()='Place Order']");
By uparrow = By.xpath("//button[@class='btn-icon btn btn-primary']//*[name()='svg']");
//By sameaddr = By.xpath("//input[@id='address59']");
public CommunicationPage(WebDriver driver) {
	this.driver = driver;
}
public void edit()
{
	driver.findElement(communication).click();
	WebElement shwno = driver.findElement(shw);
	Select shwelmnt = new Select(shwno);
	shwelmnt.selectByVisibleText("25");
	//driver.findElement(threedots).click();
}
public void cmctnpg(String name,String phone)
{
	
	driver.findElement(addnewno).click();
	driver.findElement(nameinaddnew).sendKeys(name);
	driver.findElement(phnenoinaddnew).sendKeys(phone);
	driver.findElement(submitaddnew).click();
	
}
public void calls(String amnt)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(clls).click();
	driver.findElement(enteramnt).sendKeys(amnt);
	driver.findElement(proceedtochckout).click();
}
public void addresspay(String addr,String cty,String zp) {
	driver.findElement(address).sendKeys(addr);
	driver.findElement(state).click();
	//driver.findElement(selectstate).click();
	List<WebElement> l= driver.findElements(selectstate);
	//System.out.println(l.size());
	for(WebElement ws:l)
	{
		System.out.println(ws.getText());
		String act = ws.getText();
		String exp="Arizona";
		if(act.contains(exp)) {
			ws.click();
		}
	}
	driver.findElement(city).sendKeys(cty);
	driver.findElement(zip).sendKeys(zp);
	driver.findElement(addtype).click();
	//driver.findElement(selctaddrtype).click();
	List<WebElement> adt= driver.findElements(selctaddrtype);
	//System.out.println(l.size());
	for(WebElement e:adt)
	{
		System.out.println(e.getText());
		String actu = e.getText();
		String expc="Home";
		if(actu.contains(expc)) {
			e.click();
		}
	}
	driver.findElement(checkbox).click();
	driver.findElement(confmaddr).click();
}
public void card(String crdn,String crdnam,String exprydat,String cardsec)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(selctcrd).click();
	driver.findElement(cardno).sendKeys(crdn);
	driver.findElement(cardnm).sendKeys(crdnam);
	driver.findElement(expirydt).sendKeys(exprydat);
	driver.findElement(cvv).sendKeys(cardsec);
	driver.findElement(pycheckbx).click();
	driver.findElement(placeorder).click();
	driver.findElement(uparrow).click();
}

}
