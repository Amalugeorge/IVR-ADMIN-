package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.DownloadMailerPage;

public class DownloadMailerTest extends Baseclass{
	@Test
	public void downloadMailer() throws InterruptedException {
		Arialeads ob = new Arialeads(driver);
		ob.arialeads();
		DownloadMailerPage d = new DownloadMailerPage(driver);
		d.downloadCSV();
	}

}
