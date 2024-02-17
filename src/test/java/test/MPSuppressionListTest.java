package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPSuppressionListPage;

public class MPSuppressionListTest extends Baseclass {
	

	@Test
	public void suppressionList() throws InterruptedException {
		MPHomePage ob= new MPHomePage(driver);
		ob.mrp();
		MPSuppressionListPage sl = new MPSuppressionListPage(driver);
		sl.approveSuppression();
		sl.approval();
		sl.reject();
		
		
		
	}
}
