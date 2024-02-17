package Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadMailerPage {
	WebDriver driver;
	By downloadmailer = By.xpath("//span[normalize-space()='Download Mailer CSV']");
	By uploadDateDropdown = By.xpath("//div[@class='select__value-container css-1hwfws3']");
	By selectDates = By.xpath(
			"//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control']");
	By dates = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By downloadButton = By.xpath("//button[@type='button']//*[name()='svg']");

	public DownloadMailerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void downloadCSV() throws InterruptedException {
		driver.findElement(downloadmailer).click();
		driver.findElement(uploadDateDropdown).click();
		driver.findElement(selectDates).isDisplayed();
		
Thread.sleep(10);
		driver.findElement(dates).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(downloadButton).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement downloadBtn = driver.findElement(downloadButton);
		String sourceLocation = downloadBtn.getAttribute("xmlns");
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P D:\\Selenium_Wget --no-check-certificate " + sourceLocation;
		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (InterruptedException | IOException ex) {
			System.out.println(ex.toString());
		}

	}

}
