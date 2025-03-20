package com.kiot;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowSwitchDemo {
public static void main(String[] args) {
	    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://demoqa.com/browser-windows");
	   	    
	    //pass application url
	    String parentWindow=driver.getWindowHandle();
	    System.out.println("parentwindow");
	    
	    //count of window-1
	    Set<String> allWindowHandles=driver.getWindowHandles();
	    System.out.println("Count of Window: "+allWindowHandles.size());
	    
	    //open a child window
	    driver.findElement(By.id("windowButton")).click();
	    
	    //count of windows change from 1-2
	    Set<String> newAllWindowHandles=driver.getWindowHandles();
	    System.out.println("New Count of Window: "+newAllWindowHandles.size());
	    
	    //get detail of parent window
	    String ParentHandle=driver.getWindowHandle();
	    System.out.println("Parent Window: "+ParentHandle);
	    
	    //get details of parent and child window
	    Iterator<String> iterator=newAllWindowHandles.iterator();
	    String mainWindow=iterator.next();
	    String childWindow=iterator.next();
	    System.out.println(" Parent Window: "+mainWindow);
	    System.out.println(" Child Window: "+childWindow);
	    
	    //switch control to child window
	    driver.switchTo().window(childWindow);
	    
	    //verify text present on child window
	    WebElement text=driver.findElement(By.id("sampleHeading"));
	    System.out.println("InnerText "+text.getText());
	    driver.quit();
	  	    
}
}
