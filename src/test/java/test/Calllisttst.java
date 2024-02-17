package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Calllist;

public class Calllisttst extends Baseclass{
@Test
public void tstcalllst()
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Calllist cl = new Calllist(driver);
	cl.callst();
}
}
