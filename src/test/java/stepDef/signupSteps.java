package stepDef;

import base.config;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class signupSteps extends config {
    @And("student enter their invalid firstname")
    public void studentEnterTheirInvalidFirstname() {
        driver.findElement(By.name("firstname")).sendKeys("qa");
    }
}
