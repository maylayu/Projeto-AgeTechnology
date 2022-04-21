package steps;

import Runner.runnerA;
import cucumber.api.java.pt.Dados;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BuscaPage;

import java.io.IOException;


public class buscascredenciado extends runnerA {

    BuscaPage BuscaPage = new BuscaPage(driver);

    @Dados("^que eu estou no site da AgeTechnology")
    public void acessar_sitee() throws IOException {
        BuscaPage.acessarAplicacao();
        BuscaPage.print("5acessar_sitee");
    }

    @Quando("^eu clico em funcionalidades$")
    public void eu_clico_em_funcionalidades() throws IOException {
        driver.findElement(By.xpath("/html/body/div[1]/div/header[1]/div/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/nav[1]/ul/li[2]/a")).click();
        BuscaPage.print("6eu_clico_em_funcionalidades");

    }

    @Quando("^clico em Rede SocNET$")
    public void clico_em_Rede_SocNET() throws IOException {
        driver.findElement(By.linkText("Rede SOCNET")).click();
        BuscaPage.print("7clico_em_Rede_SocNET");

    }

    @Quando("^clico em Buscar credenciados$")
    public void clico_em_Buscar_credenciados() {
        driver.findElement(By.cssSelector("body > div.elementor.elementor-129 > div > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-de8c182.elementor-section-full_width.elementor-section-height-min-height.elementor-section-items-top.elementor-section-height-default.exad-glass-effect-no.exad-sticky-section-no > div > div > div > div > div > section > div > div > div > div > div > div.elementor-element.elementor-element-41966c6.elementor-align-center.exad-sticky-section-no.exad-glass-effect-no.elementor-widget.elementor-widget-button > div > div > a")).click();
    }

    @Quando("^preencho os campos de pesquisa$")
    public void preencho_os_campos_de_pesquisa() throws IOException {
        Actions action = new Actions(driver);
        WebElement elemento = BuscaPage.criarElementoID("ipt-busca-credenciado-2");
        elemento.click();
        elemento.sendKeys("Santos");
        BuscaPage.print("8preencho_os_campos_de_pesquisa1");


        WebElement botao = driver.findElement(By.id("botao-buscar"));
        action.moveToElement(botao).build().perform();
        botao.click();
        BuscaPage.print("9preencho_os_campos_de_pesquisa2");

        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > button"))).click();
        //driver.findElement(By.cssSelector("#root > div > button")).click();


        WebElement perfil = driver.findElement(By.cssSelector("#conteudo-resultados > div.estrutura-card > div > div:nth-child(2) > div > section > div.dados-empresa.row.col-12.col-sm-9.col-xl-10"));
        action.moveToElement(perfil).build().perform();
        perfil.click();
        BuscaPage.print("10preencho_os_campos_de_pesquisa3");


        WebElement saibamais = driver.findElement(By.xpath("//*[@id=\"conteudo-resultados\"]/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[29]/a/button"));
        BuscaPage.waitElementBePresent(By.xpath("//*[@id=\"conteudo-resultados\"]/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[29]/a/button"), 2000);
        action.moveToElement(saibamais).build().perform();
        saibamais.click();
        BuscaPage.print("11preencho_os_campos_de_pesquisa4");
    }

    @Então("^eu consigo exibir seu perfil$")
    public void eu_consigo_exibir_seu_perfil() throws IOException {
        String perfilConfirm = driver.findElement(By.cssSelector("#div-header-perfil > div > div.perfil-dados-empresa > div:nth-child(1) > span")).getText();
        Assert.assertEquals("VETOR CONSULTORIA E GESTAO CORPORATIVA", perfilConfirm);
        BuscaPage.print("12eu_consigo_exibir_seu_perfil5");
    }

}
