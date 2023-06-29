package Pages;

import Runner.RunCucumberTest;
import Suport.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.rmi.CORBA.Util;

import static Suport.Comands.clickElement;
import static Suport.Comands.fillField;

public class HomePage extends RunCucumberTest {

    public String url = "https://www.amazon.com.br/";

    private By btnCarrinho = By.id("nav-cart");

    private By btnVendaNaAmazon = By.xpath("//a[text()=\"Venda na Amazon\"]");

    private By btnMaisVendidos = By.xpath("//a[text()=\"Mais Vendidos\"]");

    private By waitElementVendaNaAmazon = By.xpath("//h1[text()=\"Venda na Amazon com mensalidade GRÁTIS por 1 ano\"]");

    private By btnPrime = By.xpath("//a/span[text()=\"Prime\"]/..");

    private By btnOfertasDoDia = By.xpath("//a[text()=\"Ofertas do Dia\"]");

    private By waitElementOfertasEPromo = By.xpath("//h1[text()=\"Ofertas e Promoções\"]");

    private By waitElementPrime = By.id("primeDetailPage");

    public void acessarAplicacao(){
        getDriver("chrome");
        getDriver().get(url);
    }

    public void acessarCarrinho(){
        clickElement(btnCarrinho);
    }


    public void acessarVendaNaAmazon(){
        clickElement(btnVendaNaAmazon);
        Utils.esperarPorElementoEstarVisivel(waitElementVendaNaAmazon,10);
    }

    public void acessarMaisVendidos(){clickElement(btnMaisVendidos);}

    public void acessarPrime(){
        clickElement(btnPrime);
        Utils.esperarPorElementoEstarVisivel(waitElementPrime,10);
    }

    public void acessarOfertasEPromocoes(){
        clickElement(btnOfertasDoDia);
        Utils.esperarPorElementoEstarVisivel(waitElementOfertasEPromo,10);
    }

    public void pesquisarPorUmItem(){
        fillField(By.id("twotabsearchtextbox"),"Echo Dot alexa");
        clickElement(By.id("nav-search-submit-button"));
    }
}
