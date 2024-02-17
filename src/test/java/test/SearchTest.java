package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.SearchPage;





public class SearchTest extends Baseclass {
	@Test
	public void mortageIDSearch() {
		Arialeads ob = new Arialeads(driver);
		ob.arialeads();
		SearchPage s = new SearchPage(driver);
		s.searchMID();
		s.getSearchResult();
		}
}
