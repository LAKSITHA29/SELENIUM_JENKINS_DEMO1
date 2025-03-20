package com.kiot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://demoqa.com/frames");
	    
	    //switch iframe using any of locator strategy
	    WebElement iframeElement=driver.findElement(By.id("frame1"));
	    driver.switchTo().frame(iframeElement);
	    String frame1=driver.findElement(By.id("sampleHeading")).getText();
	    System.out.println("The text is: "+frame1);
	    
	    //switch to main window
	    driver.switchTo().defaultContent();
	    String main=driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/h1")).getText();
	    System.out.println("Back to Main page: "+main);
	    
	    
	   // WebElement iframeElement2=driver.findElement(By.id("frame2"));
	    
	    //switch iframe using index
	    driver.switchTo().frame(3);
	    
	    String frame2=driver.findElement(By.id("sampleHeading")).getText();
	    System.out.println("The switch by index: "+frame2);
	   
	    
	    driver.quit();

	}

}

