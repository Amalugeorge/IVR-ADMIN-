package test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.ManageFAQ;

public class ManageFAQtst extends Baseclass {
@Test
public void tstmngfaq() throws InterruptedException, AWTException, IOException
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	ManageFAQ mf =new ManageFAQ(driver);
	mf.mngfaq();
	mf.viewdocs();
	//mf.managefaq();
	//mf.delete();
	//mf.addfaq();
	//mf.addnewfaqslctd("wbhdfnvsf","nfmalegedsbsdg");
//	mf.submitfaq();


	
	
	
	//mf.editcategory("1");
	//mf.addcat("s");
	
	//mf.addfaq("autotstng","testing autom");
	//mf.selectfaq();
}
}
