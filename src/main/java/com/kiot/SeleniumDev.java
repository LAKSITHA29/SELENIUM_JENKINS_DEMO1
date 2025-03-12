
package com.kiot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDev {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebElement auto = driver.findElement(By.xpath("//select[@id=\"multi\"]"));
        Select dropdown = new Select(auto);

        List<WebElement> list = dropdown.getOptions();
   
        List<String> optionText=new ArrayList<>();
        for (WebElement option : list) {
            optionText.add(option.getText());
        }
        Collections.sort(optionText);
        
        for (String i : optionText) {
            System.out.println("Sorted array is : " + i);
        }
        
        System.out.println("Total options: " + list.size());
        for (WebElement i : list) {
            System.out.println("Option: " + i.getText());
        }
       
        if (dropdown.isMultiple()) {
           
            dropdown.getAllSelectedOptions();
    
            List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
            System.out.println("Selected options:");
            for (WebElement option : selectedOptions) {
                System.out.println(option.getText());
            }

            dropdown.deselectByIndex(0);
            dropdown.deselectByIndex(3);
        } else {
            System.out.println("This dropdown does not support multiple selections");
        }

        driver.quit();
        
    }
}
