
package com.kiot;

		import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {

			public static void main(String[] args) { // throws InterruptedException {
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Actions action=new Actions(driver);
			    driver.get("https://omayo.blogspot.com");
			    
			    WebElement link=driver.findElement(By.xpath("//a[contains(text(),'jqueryui')]"));
			    action.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).build().perform();

	}

}
