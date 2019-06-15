package com.ela.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElaHomepage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://ivf.talentaim.com/");
		driver.findElement(By.linkText("/ela-offers")).click();
		
		//click the Book FREE Appointment
		driver.findElement(By.id("btn-header-get-quote")).click();
		//enter the name and mobile number 
		driver.findElement(By.name("required")).sendKeys("test");
		driver.findElement(By.name("mobile")).sendKeys("0000000000000");
		driver.findElement(By.name("form_submit")).click();
	}

}
