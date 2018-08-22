package com.org.chandu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fourthclas {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Resources/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://stackoverflow.com/");
		

	}

}
