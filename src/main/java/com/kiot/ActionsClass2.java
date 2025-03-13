package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com");
	    WebElement blog=driver.findElement(By.id("blogsmenu"));
	    Actions action=new Actions(driver);
	    action.moveToElement(blog).perform();
	    
	    WebElement search=driver.findElement(By.xpath("//input[@name='q']"));  // //input[@class=\"gsc-input\"]"));
	    action.moveToElement(search).perform();
	    action.contextClick(search).perform(); //right click
	   // search.sendKeys("hii");
  
	    //action.click().perform()    
	    WebElement search2=driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
	    action.moveToElement(search2).perform();
	    action.doubleClick(search2).perform();

	}

}
