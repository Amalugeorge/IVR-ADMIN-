package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPOrdercost;

public class MPOrdercosttst extends Baseclass {
@Test
public void tstgld() throws InterruptedException
{
	MPHomePage ob= new MPHomePage(driver);
	ob.mrp();
	MPOrdercost m = new MPOrdercost(driver);
	m.ordrcst("ia");
	m.silver("il");
	
}
}
