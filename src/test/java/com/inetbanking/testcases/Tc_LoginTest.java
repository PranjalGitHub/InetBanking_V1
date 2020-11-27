package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;

public class Tc_LoginTest extends Base{
@Test
	public void LoginTest() throws InterruptedException, IOException {
		
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.Login();

		
		if(driver.getTitle().contains("Guru")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
			captureScreen(driver,"LoginTest");
		}
	}
	
	
}
