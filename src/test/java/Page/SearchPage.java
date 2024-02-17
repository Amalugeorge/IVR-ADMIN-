package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	String input = "251";
	By Search = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[12]/a/span");
	By midDropdown = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div[1]/div[1]");
	By midOption = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div");
	By searchInput = By.xpath("//*[@id=\"search-input\"]");
	By searchButton = By.xpath("//button[@type='button']");
	By tableRow= By.xpath("//div[@class='sc-AxiKw jeFspv rdt_TableHeadRow']/div");
	By tableColumn=By.xpath("//div[@role='row']");

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchMID() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(Search).click();
		driver.findElement(midDropdown).click();
		driver.findElement(midOption).click();
		//driver.findElement(searchInput).click();
		driver.findElement(searchInput).sendKeys(input);
		driver.findElement(searchButton).click();
	}
	
	public void getSearchResult() {
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
				break;
			}
	}
	}

}
