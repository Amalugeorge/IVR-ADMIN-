package test;

import org.testng.annotations.Test;

import Page.Logintocrm;

public class Logintocrmtst extends Baseclass {
	@Test
	public void tstlgncrm() throws InterruptedException
	{
		Logintocrm cr = new Logintocrm(driver);
		cr.mrp();
		cr.lgncrm();
	}

}
