package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTutorialNinja {

    public static void main(String[] args) {
     
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            WebDriver driver = new ChromeDriver();
  
            driver.manage().window().maximize();
            driver.get("https://tutorialsninja.com/demo/");

          
            WebElement search = driver.findElement(By.name("search")); // Use the correct locator
         
            WebElement searchBtn = driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")); // Use CSS selector for multiple classes
            javaScriptSendKeys(driver, search, "HP");

            javaScriptClick(driver, searchBtn);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("history.go(0)");

           
            js.executeScript("window.scrollBy(0, 500)");

        
    }

    public static void javaScriptSendKeys(WebDriver driver, WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1];", element, text);
    }


    public static void javaScriptClick(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}