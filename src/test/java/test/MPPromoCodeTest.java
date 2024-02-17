package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPPromoCodePage;

public class MPPromoCodeTest extends Baseclass {
	
	
	@Test
	public void marketHome() throws InterruptedException {
		MPHomePage ob= new MPHomePage(driver);
		ob.mrp();
		MPPromoCodePage p = new MPPromoCodePage(driver);
		p.addPromoCode();
		p.addPromoUsers();
		p.removeUsers();
	}
}

