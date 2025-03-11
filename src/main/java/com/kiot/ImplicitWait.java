package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		   WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"reveal\"]")));
	        element.click();
	        
	        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"revealed\"]")));
	        inputField.sendKeys("Hello");

	        System.out.println("Display value is:"+inputField.getDomProperty("value"));   //it gets value inside the text box

	}

}