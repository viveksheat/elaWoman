package com.ela.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FairTreatmentCost {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver", "C:\\selenium driver\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("http://ivf.talentaim.com/ftc");
			driver.findElement(By.linkText("Cost Calculator")).click();
			driver.findElement(By.id("your-name")).sendKeys("vivek");
			driver.findElement(By.id("yourNumber")).sendKeys("011111111111111111");
			driver.findElement(By.id("select2-ftc_city-container")).click();
			Select obj=new Select(driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")));
			obj.selectByValue("Agra");
		
	}}
