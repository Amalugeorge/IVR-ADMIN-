package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.CommunicationPage;
import Page.Communicationsavedaddrpay;

public class Communicationsavedaddrpaytest extends Baseclass{
@Test
public void tstcm()
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	CommunicationPage c = new CommunicationPage(driver);
	c.edit();
	c.calls("1");
	Communicationsavedaddrpay cs = new Communicationsavedaddrpay(driver);
	cs.alreadyentraddr("234");
}
}
