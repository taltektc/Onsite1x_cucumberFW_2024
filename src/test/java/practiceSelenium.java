import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceSelenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/signup.html");
        driver.findElement(By.name("firstName")).sendKeys("Hassan");
        driver.findElement(By.name("lastName")).sendKeys("QAEnv");
        driver.findElement(By.name("email")).sendKeys("hassan.qaenv2@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test12345");
        driver.findElement(By.xpath("//form[@id='signup-form']/div[4]/span/i")).click();
        driver.findElement(By.name("confirmPassword")).sendKeys("Test12345");
        driver.findElement(By.xpath("//form[@id='signup-form']/div[5]")).click();
        driver.findElement(By.xpath("//form[@id='signup-form']/div[5]/span/i")).click();
        driver.findElement(By.name("month")).click();
        new Select(driver.findElement(By.name("month"))).selectByVisibleText("Feb");
        driver.findElement(By.name("day")).click();
        new Select(driver.findElement(By.name("day"))).selectByVisibleText("4");
        driver.findElement(By.name("year")).click();
        new Select(driver.findElement(By.name("year"))).selectByVisibleText("1985");
        driver.findElement(By.xpath("//form[@id='signup-form']/label[3]")).click();
        driver.findElement(By.xpath("//form[@id='signup-form']/div[7]/label/span")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
