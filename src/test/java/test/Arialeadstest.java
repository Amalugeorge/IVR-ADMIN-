package test;

import org.testng.annotations.Test;

import Page.Arialeads;

public class Arialeadstest extends Baseclass{
@Test
public void testarialeads() throws InterruptedException
{
	Arialeads ob = new Arialeads(driver);
	ob.arialeads();
	ob.agentControls();
	//ob.gold();
	//ob.movegld();
	//ob.shwnm();
	//ob.applyfiltrsts();
	//ob.applyfltercmp("wk0");
	//ob.applyfiltrmrg("29000042");
	//ob.applyfiltstate("id");
	//ob.applyfiltrcnty("Bonneville");
	//ob.applyfltrnme("Btest");
	//ob.downloadapplyfltr("duplicate", "2012", "IN", "Marion", "Ctest");
	//ob.setstatus();
	//ob.printslcted();
	//ob.dwnld();
	//ob.nte("tst");
	//ob.agentSinglePage();
	//ob.agentSilverLeads();
	//ob.movesilver();
	//ob.shwslvr();
	//ob.filtersilver("wk0","29000042","id","Bonneville","Btest","tst");
	//ob.dwnldfiltersilver("duplicate", "2012", "IN", "Marion", "Ctest");
	//ob.setstatussilver();
	//ob.prntsilver();
	//ob.dwnldsilver();
	//ob.ntesilver("tst");
	//ob.mailed();
	//ob.movemailed();
	//ob.shwmailed();
	//ob.filtermailed("wk0","29000042","id","Bonneville","Btest","tst");
	//ob.dwnldfiltermailed("WK0", "47947921", "UT", "Salt Lake", "KIM");
	//ob.setstatusmailed();
	//ob.prntmailed();
	//ob.dwnldmailed();
	//ob.ntemailed("tst");
	//ob.shwbob();
	//ob.filterbob("test","259","ia","Ackley","LUTFEY");
	//ob.downloadapplyfltrbob("test","258","ia","ackley","Michael");
	//ob.prntbob();
	//ob.dwnldbob();
	//ob.ntebob("tst");
	ob.viewuploaddoc();
	
	
}
}
