package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Usuario {

    private final WebDriver driver;

    public Usuario(WebDriver driver){
        this.driver = driver;
    }

    public void logar(String nome, String senha) {

        WebElement txtUsuario = driver.findElement(By.name("userValue"));   //Selenium procura o campo "Usuário"
        WebElement txtSenha = driver.findElement(By.name("passwordValue")); //Selenium procura o campo "Senha"

        txtUsuario.sendKeys(nome);                                          //Selenium preenche o campo "Usuário"
        txtSenha.sendKeys(senha);                                           //Selenium preenche o campo "Senha"

        WebElement botaoEntrar = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")); //Selenium procura o botão para realizar Login
        botaoEntrar.click();                                                //Selenium clica no botão
    }
}