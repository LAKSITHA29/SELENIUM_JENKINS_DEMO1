package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TotalViews {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html");
	 	 WebElement count=driver.findElement(By.xpath("//span[@id=\"Stats1_totalCount\"]"));
	   	 System.out.println("views "+count.getText());
	   //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	   	 
//	       WebElement view=driver.findElement( By.xpath("(//a[contains(text(),'SELENIUM')] )[1]"));	
//	       WebElement ele=driver.findElement(By.xpath("//*[@id=\"Stats1_totalCount\"]"));
//	       System.out.println("Total views: "+ele.getText());
//	       ele.click();
//	       
//	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	       wait.until(ExpectedConditions.visibilityOf(ele));
//	       System.out.println("Total views: "+ele.getText());

	       
	    WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'SELENIUM')] )[1]"));
	   	ele.click();
	   	
//	   	WebElement c=driver.findElement(By.xpath("//span[@id=\"Stats1_totalCount\"]"));
//	   	System.out.println(c.getText());
	   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   	//wait.until(ExpectedConditions.visibilityOf(c));
		WebElement c=driver.findElement(By.xpath("//span[@id=\"Stats1_totalCount\"]"));
	   	wait.until(ExpectedConditions.visibilityOf(c));
	   	System.out.println(c.getText());
	   	driver.quit();
	       }

}