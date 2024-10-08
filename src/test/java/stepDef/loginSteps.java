package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;

public class loginSteps extends config {

    @Given("student at talentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
        String exp = "Login";
        String act = driver.getTitle();
        Assert.assertEquals(act, exp);
    }

    @And("student enter their valid email address")
    public void studentEnterTheirValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(studentEmail);
    }

    @And("student enter their valid email address {string}")
    public void studentEnterTheirValidEmailAddressWithDataProvider(String enterEmailAddress) {
        driver.findElement(By.name("email")).sendKeys(enterEmailAddress);
    }

    @And("student enter their valid password")
    public void studentEnterTheirValidPassword() {
        driver.findElement(By.name("password")).sendKeys(studentPassword);
    }

    @And("student enter their valid password {string}")
    public void studentEnterTheirValidPassword(String passwordValue) {
        driver.findElement(By.name("password")).sendKeys(passwordValue);
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

    @And("student enter their invalid password")
    public void studentEnterTheirInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys("InvalidPass$32232");
    }

    @Then("student should see Incorrect email or password error message")
    public void studentShouldSeeIncorrectEmailOrPasswordErrorMessage() {
        String exp = "Incorrect email or password";
        String act = driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        Assert.assertEquals(act, exp);
    }

}
