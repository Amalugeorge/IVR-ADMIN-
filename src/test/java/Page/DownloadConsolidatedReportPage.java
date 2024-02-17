package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadConsolidatedReportPage {
	WebDriver driver;
	By downloadconsolidated = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[5]/a/span");
	By typeDropdown=By.xpath("//div[@class='select__placeholder css-1wa3eu0-placeholder']");
	By selectType=By.xpath("//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control']");
	By types=By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[2]");
	By date=By.xpath("//input[@id='range-picker']");
	By prevSelect=By.xpath("//span[@class='flatpickr-prev-month']//*[name()='svg']");
	By startDate=By.xpath("//span[@aria-label='September 1, 2023']");
	By endDate=By.xpath("//span[@aria-label='September 30, 2023']");
	By downloadButton=By.xpath("//button[@type='button']");
	By alert=By.xpath("//div[@class='Toastify__toast-container Toastify__toast-container--top-right']");
	By noData=By.xpath("//div[@role='alert']/div[2]/span");
	
	public DownloadConsolidatedReportPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void consolidateDownload() {
		driver.findElement(downloadconsolidated).click();
		driver.findElement(typeDropdown).click();
		driver.findElement(selectType).isDisplayed();
		driver.findElement(types).click();
		driver.findElement(date).click();
		driver.findElement(prevSelect).click();
		driver.findElement(startDate).click();
		driver.findElement(endDate).click();
		driver.findElement(downloadButton).click();
		
	}
}
