package Steps;

import Pages.HomePage;
import Suport.ScreenShotUtils;
import Suport.Utils;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;

public class RedirecionamentosNavBarSteps {


    HomePage homePage = new HomePage();

    @Quando("^eu clico no botao carrinho$")
    public void eu_clico_no_botao_carrinho() {
        homePage.acessarCarrinho();
    }

    @Dado("^que eu estou na tela inicial$")
    public void que_eu_estou_na_tela_inicial() {
        homePage.acessarAplicacao();
    }


    @After
    public static void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenShotUtils.takeScreenshotOnScenario(scenario);
        }
    }


    @Entao("^sou redirecionado para a tela e o titulo e validado \"([^\"]*)\"$")
    public void souRedirecionadoParaATelaEOTituloEValidado(String tituloEsperado){
        Utils.validarTitulo(tituloEsperado);
    }

    @Quando("^eu clico no botao Venda na amazon$")
    public void euClicoNoBotaoVendaNaAmazon() {
        homePage.acessarVendaNaAmazon();
    }

    @Quando("^eu clico no Mais Vendidos$")
    public void euClicoNoMaisVendidos() {
        homePage.acessarMaisVendidos();
    }

    @Quando("^eu clico no botao Prime$")
    public void euClicoNoBotaoPrime() {
        homePage.acessarPrime();
    }

    @Quando("^eu clico no botao Ofertas do Dia$")
    public void euClicoNoBotaoOfertasDoDia() {
        homePage.acessarOfertasEPromocoes();
    }
}
