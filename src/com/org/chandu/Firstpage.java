package com.org.chandu;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstpage {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws MalformedURLException {

		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		//capabilities.setPlatform(Platform.VISTA);
		
		driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444/wd/hub"), capabilities);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void t()
	{
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("saurab@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("pasw123");
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}




}


