package steps;

import cucumber.api.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BuscaPage;
import Runner.runnerA;

import java.io.IOException;

public class buscasSoc extends runnerA {
    BuscaPage BuscaPage = new BuscaPage(driver);

    @Dados("^que estou no site da AgeTechnology")
    public void acessar_site() throws IOException {
        BuscaPage.acessarAplicacao();
        BuscaPage.print("1acessar_site");

    }

    @Quando("^eu preencho o campo de pesquisa$")
    public void eu_preencho_pesquisa() throws IOException {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input")).sendKeys("Serviços");
        BuscaPage.print("2eu_preencho_pesquisa");

    }

    @Quando("^clico em pesquisar$")
    public void clico_em_pesquisar() throws IOException {
        driver.findElement(By.cssSelector("body > div.elementor.elementor-839 > div > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-879acbe.elementor-section-full_width.elementor-section-height-min-height.elementor-section-items-top.elementor-section-height-default.exad-glass-effect-no.exad-sticky-section-no > div > div > div > div > div > section.elementor-section.elementor-inner-section.elementor-element.elementor-element-1b0845e.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.exad-glass-effect-no.exad-sticky-section-no > div > div > div.elementor-column.elementor-col-50.elementor-inner-column.elementor-element.elementor-element-b475227.exad-glass-effect-no.exad-sticky-section-no > div > div > div > div > form > div > button")).click();
        BuscaPage.print("3clico_em_pesquisar");
    }

    @Então("^eu recebo a pagina com resultado correspondente$")
    public void resultado_pesquisa() throws IOException {
        String pesquisado = driver.findElement(By.cssSelector("body > div.elementor.elementor-3524.elementor-location-archive > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-4185e33f.elementor-section-full_width.elementor-section-height-min-height.elementor-section-items-top.elementor-section-height-default.exad-glass-effect-no.exad-sticky-section-no > div > div > div > div > div > section > div > div > div > div > div > div.elementor-element.elementor-element-a57d20c.exad-sticky-section-no.exad-glass-effect-no.elementor-widget.elementor-widget-heading > div > h2")).getText();
        Assert.assertEquals("Search Results for: Serviços", pesquisado);
        BuscaPage.print("4resultado_pesquisa");

    }

}