package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
@BeforeClass
public void lgn()
{

	driver=new ChromeDriver();
	driver.get("https://ivr-test-app.herokuapp.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	By eml = By.xpath("//*[@id=\"login-email\"]");
	By pswrd = By.id("login-password");
	By hddnpsrd = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/div/form/div[2]/div[2]/div");
	By rmbrme = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/div/form/div[3]/div");
	By login = By.xpath("//button[normalize-space()='Login']");


		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(eml).sendKeys("arun@abacies.com");
		driver.findElement(pswrd).sendKeys("Abacies@123");
		driver.findElement(hddnpsrd).click();
		driver.findElement(rmbrme).click();
		driver.findElement(login).click();

		
	}
	/*driver.findElement( By.xpath("//*[@id=\"login-email\"]")).sendKeys("kevin@wordpressmonk.com");
	driver.findElement(By.id("login-password")).sendKeys("Samsung@ginserv!2");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/div/form/div[2]/div[2]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/div/form/div[3]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/div/form/button[1]")).click();
	//driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[1]/div/div/div/div/div[3]/div/div/div/button")).click();*/

	
}

