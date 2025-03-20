package com.kiot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        WebElement dateInput = driver.findElement(By.xpath("//input[@id='datepicker']"));
        dateInput.clear();
        dateInput.sendKeys("01/29/2004" + Keys.ENTER);

        System.out.println(dateInput.getAttribute("value"));
        driver.quit();
    }
}

