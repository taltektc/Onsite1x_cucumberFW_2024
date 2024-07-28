package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class config {
    // Initialize WebDriver
   public static WebDriver driver;

   public static WebDriver setupBrowser(String browserType) {
       if (browserType.equalsIgnoreCase("chrome")) {
           driver = new ChromeDriver();
       } else if (browserType.equalsIgnoreCase("firefox")) {
           driver = new FirefoxDriver();
       } else if (browserType.equalsIgnoreCase("edge")) {
           driver = new EdgeDriver();
       } else if (browserType.equalsIgnoreCase("safari")) {
           driver = new SafariDriver();
       } else {
           throw new IllegalArgumentException("Invalid browser type: " + browserType);
       }
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       return driver;
   }


}
