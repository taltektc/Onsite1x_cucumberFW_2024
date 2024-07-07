package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginSteps {
    WebDriver driver;
    @Given("student at talentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
        driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com");
    }

    @And("student enter their valid email address")
    public void studentEnterTheirValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("QAEnv1@gmail.com");
    }

    @And("student enter their valid password")
    public void studentEnterTheirValidPassword() {
        driver.findElement(By.name("password")).sendKeys("QAEnvPas$");
    }

    @When("student clicks on Login Button from login page")
    public void studentClicksOnLoginButtonFromLoginPage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='login_form']/input")).click();
        Thread.sleep(1500);
    }

    @Then("student should be able to successfully login")
    public void studentShouldBeAbleToSuccessfullyLogin() {
        // assert if student successfully logged in or NOT
        // Expected: comes from Project Manager or Business owner/Analyst
        // Actual comes from what developer has been developed
        String exp = "Student Information";
        String act = driver.findElement(By.xpath("//*[@id='wrap']/div/div/div[1]/h2")).getText();
        Assert.assertEquals(act, exp);
    }

    @And("student enter their invalid email address")
    public void studentEnterTheirInvalidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("invalidEmail23232@gmail.com");
    }

    @Then("student should not be able to successfully login")
    public void studentShouldNotBeAbleToSuccessfullyLogin() {
        String exp = "Invalid email address";
        String act = driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        Assert.assertEquals(act, exp);
    }
}
