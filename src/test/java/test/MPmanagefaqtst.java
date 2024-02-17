package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPmanageFAQ;

public class MPmanagefaqtst extends Baseclass{
@Test
public void tstmngfaq() throws InterruptedException, AWTException
{
	MPHomePage ob= new MPHomePage(driver);
	ob.mrp();
	MPmanageFAQ m = new MPmanageFAQ(driver);
	m.mngfaq();
	//m.mngfaqadd("categytstaut");
	//m.editfaq();
	m.delete();
	m.managefaq();
	m.addfaq("wbhdfnvsf","nfmalegedsbsdg");
	m.submitfaq();
}
}
