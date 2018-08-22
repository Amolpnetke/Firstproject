package com.org.chandu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Thirdclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","Resources/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/login/");
	
	}

}
