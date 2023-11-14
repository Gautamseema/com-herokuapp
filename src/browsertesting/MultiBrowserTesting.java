package browsertesting;
/**
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    public static void main(String[] args) {
         String baseUrl = "https://the-internet.herokuapp.com/login" ;
 // launch the Chrome browser
         WebDriver driver = new ChromeDriver() ;
 // Open the url into browser
         driver .get(baseUrl );
 // Maximise the browser
        driver.manage().window().maximize();
 // We give Implicit wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 // Get the title
         String title = driver.getTitle() ;
         System.out.println(title);
 // Get current Url
         System.out.println("The current Url : " + driver.getCurrentUrl() );
 // Get page source
         String p = driver.getPageSource();
         System.out.println("Page Source is : " + p);
 // Find usernameField element and type the username
         WebElement usernameField = driver.findElement(By.id("username") );
         usernameField .sendKeys("Prime Testing");
 // Find passwordField element and type the password
         WebElement passwordField = driver.findElement(By.name("password") );
         passwordField .sendKeys("Prime123") ;
 // Find loginButton to click
         WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']") );
         loginButton.click();
 // Print the current Url
          System.out.println("Current Url after clicking loginButton : " + driver.getCurrentUrl());
 // Refresh the page
         driver.navigate().refresh();
 // Close the browser
         driver .quit() ;




    }

}
