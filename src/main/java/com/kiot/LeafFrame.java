package com.kiot;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafFrame{

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        
        driver.switchTo().frame(0);
        WebElement ele1=driver.findElement(By.xpath("//button[@id='Click']"));
        ele1.click();
        
        String text=driver.findElement(By.xpath("//button[@id='Click']")).getText();
        System.out.println(text);
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);//outer frame
        driver.switchTo().frame("frame2");//inner frame 
        
        WebElement ele2=driver.findElement(By.xpath("//button[@id='Click']"));
        ele2.click();
        String text1=driver.findElement(By.xpath("//button[@id='Click']")).getText();
        System.out.println(text1);
	}

}