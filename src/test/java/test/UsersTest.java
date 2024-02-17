package test;

import org.testng.annotations.Test;

import Page.Arialeads;
import Page.UsersPage;


public class UsersTest extends Baseclass{
	

	@Test
	public void users() {
		Arialeads ob = new Arialeads(driver);
		ob.arialeads();
		UsersPage us= new UsersPage(driver);
		us.addNewUser();
		us.searchUser();
		
	}
}
