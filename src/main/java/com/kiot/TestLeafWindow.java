package com.kiot;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafWindow {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://leafground.com/window.xhtml");
	
	 String parentWindow = driver.getWindowHandle();
     System.out.println("Parent Window Handle: " + parentWindow);
     
     driver.findElement(By.id("j_idt88:new")).click();
     
     Set<String> handles=driver.getWindowHandles();
     for(String handle:handles) {
    	  System.out.println(handle);
    	  if(!handle.equals(parentWindow)) {
    		  driver.switchTo().window(handle);
    		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		  driver.findElement(By.xpath("//div[@id=\"j_idt107\"]")).click();
    	  
    	  driver.close();
    	  }
     }
  
//     driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
//     driver.switchTo().window(parentWindow);
//     
//     WebElement open=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]"));
//     open.click();
//     System.out.println(open.getText());
//     driver.close();     
//     Set<String> allWindowHandles = driver.getWindowHandles();
//     System.out.println("Total windows opened: " + allWindowHandles.size());
//     
//     driver.switchTo().window(parentWindow);
//     WebElement openmultiple=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
//     openmultiple.click();
//     System.out.println(openmultiple.getText());
//
//     driver.close();
	}
}












/*package com.kiot;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafWindow {
    public static voimain(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://leafground.com/window.xhtml");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);

        // Open single new window
        WebElement open = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
        open.click();
        System.out.println("Clicked on: " + open.getText());

        // Open multiple windows
        WebElement openMultiple = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
        openMultiple.click();
        System.out.println("Clicked on: " + openMultiple.getText());

        // Click to open child windows (Close Windows)
        WebElement closeWindows = driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]"));
        closeWindows.click();
        System.out.println("Clicked on: Close Windows");
        
        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total windows opened: " + allWindowHandles.size());
        
        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to parent window");
        
        // Close the driver
        driver.quit();
    }
}*/