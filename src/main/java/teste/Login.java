package teste;

import org.openqa.selenium.WebDriver;

public class Login{

    private WebDriver driver;

    private Usuario usuario;

    public Login(WebDriver driver){
        this.driver = driver;
        this.usuario = new Usuario(driver);
    }

    public boolean loginSucesso() throws InterruptedException {

        usuario.logar("exemplo", "exemplo");    //Preencher os campos da tela de Login

        Thread.sleep(1000);                            //Aguardar a página atualizar
        return driver.getPageSource().contains("Tutor : ");  //Verifica se o usuário logou corretamente

    }

}