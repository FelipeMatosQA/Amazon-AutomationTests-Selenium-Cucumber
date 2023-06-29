package Pages;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;

import static Suport.Comands.clickElement;

public class PesquisaDeItensPage extends RunCucumberTest {

    private By primeiroItemResultadoPesquisa = By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]");


    public void selecionarPrimeiroItemResultadoDaPesquisa(){
        clickElement(primeiroItemResultadoPesquisa);
    }


}
