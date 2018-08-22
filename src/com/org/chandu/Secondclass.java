package com.org.chandu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Secondclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://in.yahoo.com/");
		

	}

}
