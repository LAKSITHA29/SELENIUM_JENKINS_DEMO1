package com.kiot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bing.com");
		System.out.println("New Page- Bing is opened");	
		
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		// Opens duckduckgo homepage in the new opened window
		driver.navigate().to("https://www.duckduckgo.com/");
		System.out.println("New Page - DuckDuckGo is opened");
		driver.quit();
		}
		}
		
		