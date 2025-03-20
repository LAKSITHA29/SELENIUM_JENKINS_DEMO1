package com.kiot;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        // Login process
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sr@kiot.ac.in");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("1234567");

        WebElement sub = driver.findElement(By.id("submit"));
        sub.click();

        // Fetch and print table headers
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='myTable']//tr[1]/th"));
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println(); // Move to the next line

        String expectedName = "Sakthi";

        // Fetch all rows from the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='myTable']//tr"));

        int i = 1; // Row index (starting from 1)
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));

            if (!columns.isEmpty()) { // Ensure it's not a header row
                String nameText = columns.get(0).getText(); // Assuming name is in the first column

                if (nameText.equals(expectedName)) {
                    System.out.println("\nRow data for " + expectedName + ":");
                    
                    for (WebElement col : columns) {
                        System.out.print(col.getText() + "\t");
                    }
                    System.out.println(); // Move to next line
                }
            }
            i++;
        }
        
        // driver.quit();
    }
}
