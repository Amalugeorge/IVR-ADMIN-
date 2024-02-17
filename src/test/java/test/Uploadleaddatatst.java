package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Uploadleaddata;

public class Uploadleaddatatst extends Baseclass {
@Test
public void tstuploadlddata() throws AWTException, InterruptedException
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Uploadleaddata u = new Uploadleaddata(driver);
	u.upload("test121023");
	u.browser();
	u.form();
}
}
