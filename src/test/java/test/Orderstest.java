package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Orders;

public class Orderstest extends Baseclass {
@Test
public void tstorder()
{ 
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Orders	or = new Orders(driver);
	or.dwnldordr();
	
}
}
