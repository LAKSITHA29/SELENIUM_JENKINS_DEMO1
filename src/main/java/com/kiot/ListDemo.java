package com.kiot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bstackdemo.com");
		driver.findElement(By.xpath("//select")).click();
		
		//method1 -store all options as list and iyerate through it
		
		List<WebElement> allOptions=driver.findElements(By.cssSelector("select option"));
		System.out.println("Options are:"+allOptions.size());
		String option="Lowest to highest";
		for(int i=0;i<allOptions.size();i++) {
			if(allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				System.out.println("clicked");
				break;
			}
		}
		
	}

}
