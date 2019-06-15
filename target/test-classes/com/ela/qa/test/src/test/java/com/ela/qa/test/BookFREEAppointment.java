package com.ela.qa.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFREEAppointment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.elawoman.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//to select the coumtry and state 
		driver.findElement(By.id("btn-header-get-quote")).click();
		
		
		//river.close();

	}

}
