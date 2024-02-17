package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPOrdersummary;

public class MPOrdersmmrytst extends Baseclass{
@Test
public void tstordsmry() throws InterruptedException
{
	MPHomePage ob= new MPHomePage(driver);
	ob.mrp();
	MPOrdersummary os = new MPOrdersummary(driver);
	os.ordrsmm();
}
}
