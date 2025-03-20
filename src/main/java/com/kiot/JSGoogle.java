package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSGoogle {
	
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
//	JavascriptExecutor jse=(JavascriptExecutor) driver;
//	jse.executeScript("document.getElementById('APjFqb').value='Java'");
	WebElement ip=driver.findElement(By.id("APjFqb"));
	sendKeys(driver,ip);
	WebElement ele=driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[2]"));
	click(driver,ele);
//	String tit=(String)jse.executeScript("return document.domain");
//	System.out.println(tit);
//	String tit1=(String)jse.executeScript("return document.title");
//	System.out.println(tit1);
	driver.quit();
	}
	public static void sendKeys(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='Java'",ele);
	}
	public static void click(WebDriver driver,WebElement ele){
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()",ele);
	}
}