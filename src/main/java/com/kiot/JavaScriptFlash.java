package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptFlash {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        
       // WebElement fname=driver.findElement(By.)
      //  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement flash = driver.findElement(By.name("email"));
        flashElement(driver,flash);
      
        
	}
	
	public static void flashElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		String originalColor =element.getCssValue("backgroundColor");
		for(int i=0;i<3;i++) {
			js.executeScript("argument[0].style.bbackgroundColor ='red';", element);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			js.executeScript("arguments[0].style.backgroundColor= '"+ originalColor + "';",element);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
