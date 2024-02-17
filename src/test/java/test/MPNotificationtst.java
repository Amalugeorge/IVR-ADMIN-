package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPNotification;

public class MPNotificationtst extends Baseclass{
@Test
public void tstnotifictn() throws InterruptedException
{
	MPHomePage ob= new MPHomePage(driver);
	ob.mrp();
	MPNotification n = new MPNotification(driver);
	n.ntfcn("ia");
	n.addntfn();
	n.threedts();
	n.delte();
}
}
