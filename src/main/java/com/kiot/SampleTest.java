package com.kiot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			   driver.get("https://www.naukri.com");

			   WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a"));

		        String text = element.getText();
		       System.out.println("Text: " + text);
		       driver.quit();

			    }
			
		}
