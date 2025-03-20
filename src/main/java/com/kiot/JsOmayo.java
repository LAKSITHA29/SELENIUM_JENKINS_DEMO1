package com.kiot;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JsOmayo {
  public static void main(String args[]) {
      ChromeOptions options = new ChromeOptions();
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://omayo.blogspot.com/");

      WebElement button1 = driver.findElement(By.id("alert1"));
      javaScriptClick(driver, button1);

      //driver.quit(); 
  }

  public static void javaScriptClick(WebDriver driver, WebElement element) {
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click();", element);
  }
}