package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Runner.runnerA;

public class Utils extends runnerA {

    public void waitElementBePresent(By elemento, int tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public WebElement criarElementoID(String elemento){
        waitElementBePresent(By.id(elemento), 2000);
        WebElement resultado = driver.findElement(By.id(elemento));
        return resultado;
    }
}
