import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features", // Path of your all feature files means test cases
        glue = "stepDef", // all features are automated or scripted under the stepDef package
        plugin = {"json:target/cucumber.json"} // this is for making the report
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
