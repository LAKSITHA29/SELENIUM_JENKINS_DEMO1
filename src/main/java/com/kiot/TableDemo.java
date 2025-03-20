package com.kiot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {
	 public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Table Heading:");
        System.out.print("Size of header: "+headers.size() + "\t");
 
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");       
        }
        
        List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        System.out.print("\nFirst row:");
        for (WebElement data: row) {
            System.out.print(data.getText() + "\t");
        }
       
        WebElement cell=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
        System.out.println(cell.getText());
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='table1']//thead//th"));

     
        System.out.println((rows.size() + 1)); 
        System.out.println( column.size());

  
        for (WebElement header : column) {
            System.out.print(header.getText() + " ");
        }
        System.out.println();

        
        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            for (WebElement index : cells) {
                System.out.print(index.getText() + "  ");
            }
            System.out.println(); 
        }

        driver.quit();
    }
        }
