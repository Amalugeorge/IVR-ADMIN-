package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPPurchasedleads;

public class MPpurchasedleadstst extends Baseclass{
@Test
public void tstpurchsed() throws InterruptedException
{
	MPHomePage ob= new MPHomePage(driver);
	ob.mrp();
	MPPurchasedleads p = new MPPurchasedleads(driver);
	p.purchsed();
	//p.actions();
	//p.move();
	//p.status();
	//p.printslcted();
	//p.dwnld();
	//p.buttn();
	//p.applyfltr();
	//p.applyfltrcmp("m110");
	//p.applyfltrmrg("10087564");
	//p.applyfiltstate("la");
	//p.applyfiltrcnty("Jefferson");
	//p.applyfltrnme("Michael");
	//p.downloadapplyfltr("m110", "10087564", "la", "Jefferson", "Michael");
	//p.nte("txt");
	//p.shwnm();
	//p.silvercopy();
	//p.silvermove();
	//p.shwsilver();
	//p.statussilver();
	//p.printsilver();
	//p.dwnldsilver();
	//p.applyfiltrsilver();
	//p.applyfltrcmgslvr("m111");
	//p.applyfltrmrgslvr("2022");
//p.applyfltrstateslvr("MD");
	//p.applyfltrcountyslvr("Washington");
	//p.applyfltrnameslvr("atest");
//p.downloadapplyfltrslvr("m111", "2022", "MD", "Washington", "atest");
	p.ntesilver("test");
	p.bob();
}
}
