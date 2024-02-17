package test;

import org.testng.annotations.Test;

import Page.MPCheckoutPage;
import Page.MPHomePage;

public class MPCheckoutTest extends Baseclass {
	

	@Test
	public void checkoutLeads() throws InterruptedException {
		MPHomePage ob= new MPHomePage(driver);
		ob.mrp();
		MPCheckoutPage c =new MPCheckoutPage(driver);
		c.checkoutAddress();
		c.checkoutPromoCoupon();
		c.checkoutCard();
	}
}
