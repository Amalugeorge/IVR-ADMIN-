package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Weeklystatus;

public class Weeklystatustest extends Baseclass {
@Test
public void tstwklysts()
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Weeklystatus w = new Weeklystatus(driver);
	w.wklysts();
}
}
