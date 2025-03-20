package com.kiot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertDemoQA{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alerts");

        // Locate the alert button
//        WebElement alertButton = driver.findElement(By.id("alert1"));        
//        alertButton.click();
//        // Switch to the alert and accept it
//
//        Alert Salert = driver.switchTo().alert();
//        System.out.println("Alert Text: " + Salert.getText()); 
//        Salert.accept(); 


	}

}
