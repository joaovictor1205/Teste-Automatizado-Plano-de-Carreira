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

        WebElement txtUsuario = driver.findElement(By.name("userValue"));
        WebElement txtSenha = driver.findElement(By.name("passwordValue"));

        txtUsuario.sendKeys(nome);
        txtSenha.sendKeys(senha);

        WebElement botaoEntrar = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
        botaoEntrar.click(); //Clicar no botão
    }
}
