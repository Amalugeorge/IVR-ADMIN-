package test;

import org.testng.annotations.Test;

import Page.MPHomePage;



public class MPHomeTest extends Baseclass {


	@Test
	public void marketHome() throws InterruptedException {
		MPHomePage ob= new MPHomePage(driver);
		ob.mrp();
		ob.selectLeads();
		//ob.county();
		ob.item();
		//ob.delete();
		ob.viewcrt();
		ob.checkoutAddress("hgkbn");
		ob.checkoutPromoCoupon();
		ob.checkoutCard();
	}
}
