package teste;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Main {

    private WebDriver driver;

    @Before
    public void inicializa(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joao.goncalves\\Downloads\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://10.10.0.47:8080/login");

    }

    @Test
    public void login() throws InterruptedException {

        Login login = new Login(driver);
        assertTrue(login.loginSucesso());
        driver.close();

    }
}
