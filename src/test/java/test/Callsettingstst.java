package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Callsettings;

public class Callsettingstst extends Baseclass {
@Test
public void tstcallstng()
{	
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Callsettings cs = new Callsettings(driver);
	cs.callset("1");
}
}
