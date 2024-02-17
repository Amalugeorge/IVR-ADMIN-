package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.DownloadConsolidatedReportPage;


public class DownloadConsolidatedReportTest extends Baseclass {
	@Test
	public void downloadConsolidate() throws InterruptedException {
		Arialeads ob = new Arialeads(driver);
		ob.arialeads();
		DownloadConsolidatedReportPage dc =new DownloadConsolidatedReportPage(driver);
		dc.consolidateDownload();
	}
}
