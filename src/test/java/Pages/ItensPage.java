package Pages;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;

import static Suport.Comands.clickElement;

public class ItensPage extends RunCucumberTest {


    private By btnAdicionarAoCarrinho = By.id("add-to-cart-button");


    public void clicarAdicionarAoCarrinho(){
        clickElement(btnAdicionarAoCarrinho);
    }
}
