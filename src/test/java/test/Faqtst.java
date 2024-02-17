package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Faq;

public class Faqtst extends Baseclass{
@Test
public void tstfq()
{	
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Faq f= new Faq(driver);
	f.fq();
}
/*@AfterTest()
public void cls()
{
	driver.close();
}*/
}
