package com.ela.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchForDoctoreTest 
{
public static void main(String[] args) {
	

	System.setProperty("webdriver.gecko.driver", "C:\\selenium driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://ivf.talentaim.com/india/surrogacy");
	//driver.findElement(By.id("treat_in")).click();
	
	//click on the coll now link
	driver.findElement(By.xpath("(//a[text()='call now'])[1]")).click();
	
	//entre the name
	driver.findElement(By.name("name")).sendKeys("vivek");
	//Enter the mobile number
	driver.findElement(By.name("mobile")).sendKeys("0000000000");
			
	//click on the sumbit button
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}