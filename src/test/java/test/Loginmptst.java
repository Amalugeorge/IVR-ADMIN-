package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.Logintomp;

public class Loginmptst extends Baseclass{
@Test
public void tstlgnmp()
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	Logintomp lm = new Logintomp(driver);
	lm.lgnmp();
}
}
