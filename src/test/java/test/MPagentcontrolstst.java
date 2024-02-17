package test;

import org.testng.annotations.Test;

import Page.MPHomePage;
import Page.MPagentcontrols;

public class MPagentcontrolstst extends Baseclass{
@Test
public void tstagntcntrl() throws InterruptedException
{
	MPHomePage ob= new MPHomePage(driver);
	ob.mrp();
	MPagentcontrols ac = new MPagentcontrols(driver);
	ac.agntcntrls("geethu");
	//ac.actions();
	//ac.move();
	//ac.status();

	//ac.printslcted();
	//ac.dwnld();
	//ac.buttn();
	//ac.shwnm();
	//ac.applyfltr();
	//ac.applyfltrcmp("m110");
	//ac.applyfltrmrg("5015927");
	//ac.applyfiltstate("AL");
//	ac.applyfiltrcnty("Saint Clair");
	//ac.applyfltrnme("Jennifer");
	//ac.downloadapplyfltr("m110", "5015927", "AL", "Saint Clair", "Jennifer");
	//ac.nte("txt");
	//ac.silver();
	//ac.movesilver();
	//ac.shwnsilver();
	//ac.statussilver();
	//ac.printsilver();
//	ac.dwnldsilver();
//	ac.applyfltrsilver();
	//ac.applyfiltercmgsilver("M11");
	//ac.applyfiltermrgsilver("32042018");
	//ac.applyfilterstatesilver("al");
	//ac.applyfiltrcntysilver("Marshall");
	//ac.applyfltrnmesilver("Teresa");
	//ac.downloadapplyfltrsilver("M11", "32042018", "AL", "Marshall", "Teresa");
	//ac.ntesilver("test");
	//ac.bob();
	//ac.prntbob();
	//ac.dwnldbob();
	//ac.filtercmgbob("m06");
	//ac.filtermrgbob("46038258");
//ac.filterstatebob("AL");
	//ac.filtercntybob("Jefferson");
	//ac.filternamebob("Cynthia");
	//ac.downloadapplyfltrbob("m06", "46038258", "AL", "Jefferson", "Cynthia");
	ac.ntebob("txt");
	ac.viewuploaddoc();
}
}
