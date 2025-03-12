package com.kiot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;


public class Rediff {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		    driver.get("https://www.rediff.com/");
		    
		    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		    

			WebElement element = driver.findElement(By.xpath("(//a[@class=\"linkcolor bold\"])[2]"));
			element.click();;
			
			WebElement element1= driver.findElement(By.xpath("//span[@id=\"bseindex\"]"));
			System.out.println(element1.getText());
			driver.quit();
			
	}
}
