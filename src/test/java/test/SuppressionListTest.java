package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.SuppressionListPage;



public class SuppressionListTest extends Baseclass{

	@Test
	public void suppressionList() throws InterruptedException {
		Arialeads ob = new Arialeads(driver);
		ob.arialeads();
		SuppressionListPage s = new SuppressionListPage(driver);
		s.approveSuppression();
		s.approval();
		s.reject();
		
	
	}

}
