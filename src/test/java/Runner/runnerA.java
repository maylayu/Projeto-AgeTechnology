package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/relatorio.json", "html:target/reports/"},
        features = "src/test/resources/features/",
        tags = {"~@ignore"},
        glue = {"steps"}
)
public class runnerA {
    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        System.out.println("Iniciou!");
        driver = new ChromeDriver();
    }


    @AfterClass
    public static void stop() throws IOException {
        System.out.println("Finalizou!");
    }
}
