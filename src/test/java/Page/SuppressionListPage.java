package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuppressionListPage {
	WebDriver driver;

	By idCheck = By.xpath("//div[@id='row-0']//div[@class='sc-AxhCb sc-AxheI hlQzeM rdt_TableCell']");
	By approveSelected = By.xpath("//button[@class='ml-1 btn btn-outline-success']");
	By rejectSelected = By.xpath("//button[@class='ml-1 btn btn-outline-danger']");
	By tableRow = By.xpath("//div[@class='sc-AxiKw jeFspv rdt_TableHeadRow']/div");
	By tableColumn = By.xpath("//div[@class='sc-fzpjYC jDDtMW rdt_TableBody']/div");
	By acceptApprove = By.xpath("//button[normalize-space()='Accept']");
	By cancelApprove = By.xpath("//button[normalize-space()='Cancel']");
	By okMessage = By.xpath("//button[normalize-space()='OK']");
	By rejectReason = By.xpath("//textarea[@id='rejectReason']");
	By rejectReasonSubmit = By.xpath("//button[normalize-space()='Submit']");
	By rejectReasonCancel = By.xpath("//button[normalize-space()='Cancel']");
	By suppressionlst = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[7]/a/span");

	public SuppressionListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void approveSuppression() throws InterruptedException {
		driver.findElement(suppressionlst).click();
		String input = "254";
		Thread.sleep(1500);
		List<WebElement> rowCount = driver.findElements(tableRow);
		rowCount.size();
		List<WebElement> columnCount = driver.findElements(tableColumn);
		columnCount.size();

		for (int i = 0; i < columnCount.size(); i++) {
			WebElement name = columnCount.get(i);
			String Output = name.getText();
			System.out.println(Output);
			if (Output.contains(input)) {
				System.out.println("Dynamic table contains the data " + input);
				driver.findElement(idCheck).click();
				break;
			}
		}
	}
	public void approval() {
		driver.findElement(approveSelected).click();
		driver.findElement(acceptApprove).click();
		/*
		 * driver.findElement(cancelApprove).click();
		 * driver.findElement(okMessage).click();
		 */
	}

	public void reject() {
		driver.findElement(rejectSelected).click();
		driver.findElement(rejectReason).sendKeys("lead rejected,upload data");
		driver.findElement(rejectReasonSubmit).click();
		// driver.findElement(rejectReasonCancel).click();

	}

}
