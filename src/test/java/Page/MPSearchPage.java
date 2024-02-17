package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MPSearchPage {
	WebDriver driver;
	String input = "44009684";
	By search = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[7]/a/span");
	By searchInput = By.xpath("//input[@id='search-input']");
	By searchButton = By.xpath("//button[@type='button']");
	By tableRow= By.xpath("//div[@class='sc-AxiKw jeFspv rdt_TableHeadRow']/div");
	By tableColumn=By.xpath("//div[@role='row']");

	public MPSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchMID() {
		driver.findElement(search).click();
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
