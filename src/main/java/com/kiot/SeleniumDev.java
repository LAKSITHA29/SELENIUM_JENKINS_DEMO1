package com.kiot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDev {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement auto=driver.findElement(By.xpath("//select[@id=\"multi\"]"));
		Select dropdown=new Select(auto);
		List<WebElement> list=dropdown.getOptions();
        System.out.println("Total: "+list.size());
        for(WebElement i:list) {
        	 System.out.println("The options are "+i.getText());
        }
        dropdown.selectByIndex(0);
        dropdown.selectByIndex(3);
        Boolean multiple=dropdown.isMultiple();
        dropdown.getAllSelectedOptions();
        dropdown.deselectByIndex(0);
        dropdown.deselectByIndex(3);        
        
	}

}
