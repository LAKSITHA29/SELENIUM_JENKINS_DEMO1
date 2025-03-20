//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		//Actions action=new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    driver.get("https:omayo.blogspot.com/");
//	   	    
//	    //pass application url
//	    String parentWindow=driver.getWindowHandle();
//	    System.out.println("parentwindow");
//	    
//	    driver.findElement(By.id("selenium143")).click();
//	    driver.findElement(By.linkText("Open a popup window")).click();
//	    
//	    Iterator<String> iterator=newAllWindowHandles.iterator();
//	    
//	    Set<String> allWindowHandles=driver.getWindowHandles();
//	    System.out.println("Count of Window: "+allWindowHandles.size());
//	    
//	    
//	    WebElement text=driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
//	    System.out.println("Inner text "+text.getText());
//	    
//	  //  /Set<String> allWindowHandles=driver.getWindowHandles();
//	    
//	  //  clcik sele,click popup,h3 with new winodw,move to parent
////	    
////	    //count of window-1
////	    Set<String> allWindowHandles=driver.getWindowHandles();
////	    System.out.println("Count of Window: "+allWindowHandles.size());
////	    
////	    //open a child window
////	    driver.findElement(By.id("windowButton")).click();
////
//	}
//
//}
package com.kiot;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOmayo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://omayo.blogspot.com/");
        
        // Store the parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        
        // Click to open child windows
        driver.findElement(By.id("selenium143")).click();
//        String ele=driver.findElement(By.linkText("What is Selenium?")).getText();
//        System.out.println(ele);
//     
        
        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total windows opened: " + allWindowHandles.size());
        
        // Iterate through all windows
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to window: " + windowHandle);
                
                try {
                    // Find the h3 tag and get its text
                    String text = driver.findElement(By.linkText("What is Selenium?")).getText();
                    System.out.println("Inner text: " +text);
                } catch (Exception e) {
                    System.out.println("Nothing found");
                }
                
                // Close the child window
                driver.close();
            }
        }
        
        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
        String text1=driver.findElement(By.linkText("Page One")).getText();
        System.out.println("Text:"+text1);
        
        Set<String> allWindowHandles1= driver.getWindowHandles();
        System.out.println("Total windows opened: " + allWindowHandles1.size());
        
        // Close the parent window and quit the driver
        driver.quit();
    }
}