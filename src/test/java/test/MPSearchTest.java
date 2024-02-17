package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPSearchPage;

public class MPSearchTest extends Baseclass {
	

	@Test
	public void mortageIDSearch() throws InterruptedException {
		MPHomePage ob= new MPHomePage(driver);
		ob.mrp();
		MPSearchPage s = new MPSearchPage(driver);
		s.searchMID();
		s.getSearchResult();
		
	}
}

