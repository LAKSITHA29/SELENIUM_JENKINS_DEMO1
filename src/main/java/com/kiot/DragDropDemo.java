package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
	    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    WebElement box1=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
//	    WebElement box2=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
	    WebElement box1=driver.findElement(By.id("box5"));
	    WebElement box2=driver.findElement(By.id("box105"));
	    Thread.sleep(3000);
	   action.clickAndHold(box1).moveToElement(box2).release().build().perform();
	   //action.dragAndDrop(box1, box2).build().perform();
	   
	    //get actual color 
	    String actualColor = box1.getCssValue("background-color");
	    
	    String expectedColor="rgba(0, 255, 0, 1)";
	    if(actualColor.equals(expectedColor)) {
	    	System.out.println("The colors match");	    	
	    }else {
	    	System.out.println("The colors do not match");	 
	    	System.out.println("Actual color"+actualColor);
	    	System.out.println("Expected color"+expectedColor);	 
	    }
		
		//driver.close();		

	}
}