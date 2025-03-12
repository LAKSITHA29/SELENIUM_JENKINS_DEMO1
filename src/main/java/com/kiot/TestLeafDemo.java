package com.kiot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestLeafDemo{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/select.xhtml");
	    WebElement menu = driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
	    Select dropdown = new Select(menu);
	    
        List<WebElement> list = driver.findElements(By.xpath("//option[@class=\"ui-selectonemenu-label\"]"));
		System.out.println("Options are:"+list.size());
		String option="Playwright";
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().contains(option)) {
				list.get(i).click();
				System.out.println("clicked");
				break;
			}
		}

		  WebElement menu1=driver.findElement(By.xpath("//i[@class=\"pi pi-server layout-menuitem-icon\"]"));
		  menu1.click();
		  WebElement checkbox=driver.findElement(By.xpath("//li[@id=\"menuform:m_checkbox\"]"));
		  checkbox.click();
		  WebElement check=driver.findElement(By.xpath("//table[@class=\"ui-selectmanycheckbox ui-widget\"]//descendant::tr//td"));
		  check.click();
		  
		  WebElement checkbox1=driver.findElement(By.xpath("//div[@id=\"j_idt87:multiple\"]"));
		  checkbox1.click();
		  List<WebElement> checkboxes = driver.findElements(By.xpath("//ul[@class=\"ui-selectcheckboxmenu-items ui-selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset\"]//li//label"));
	        for (WebElement box : checkboxes) {
	            if (!box.isSelected()) {
	                box.click();
	            }
	        }
	        
	        System.out.println("MULTIPLE checkboxes selected");
	    }
	
	}
		
			
			
		
	

		 