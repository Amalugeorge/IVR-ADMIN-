package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.CommunicationPage;

public class Communicationtest extends Baseclass {
@Test
public void tstcmmnctn()
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	CommunicationPage c = new CommunicationPage(driver);
	c.edit();
	//c.cmctnpg("test","4475552931");
	c.calls("1");
	c.addresspay("sdfask","dskmo","234125455");
	c.card("5424000000000015","abc","122025","123");
	
}
}
