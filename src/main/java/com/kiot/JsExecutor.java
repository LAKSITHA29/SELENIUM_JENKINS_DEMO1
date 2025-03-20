package com.kiot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Cast WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute JavaScript to set the value of the input field
        js.executeScript("document.getElementsByName('q')[0].value='Selenium'");
        
        js.executeScript("document.getElementsById('input')[0].click()");
        
        //js.executeAsyncScript("document.get", args)
        String tit=(String)js.executeScript("return document.domain");
    	System.out.println(tit);
    	String tit1=(String)js.executeScript("return document.title");
    	System.out.println(tit1);

        
//        Threads.sleep()
//        
//        driver.quit();
    }
}
