package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import support.Utils;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class BuscaPage extends Utils {

    WebDriver driver;

    public BuscaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://www.soc.com.br/blog-de-sst/");
        driver.manage().window().maximize();
    }

    public void print(String nome) throws IOException {
        TakesScreenshot shot = (TakesScreenshot) driver;
        File arquivo = shot.getScreenshotAs(OutputType.FILE);
        copyFile(arquivo, new File("target/evidencias/" + nome + ".jpg"));
    }

}
