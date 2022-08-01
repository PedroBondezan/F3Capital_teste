package modulos.metods;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("testes webs para po site x")
public class Logar {
    @Test
    @DisplayName("testes webs para po site x")
    public void executandoLogin() {
        //Abrindo
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://front.serverest.dev/login");
        chrome.manage().window().maximize();
        //preenchedo campos com informações necessárias
        chrome.findElement(By.id("email")).sendKeys("pedro.pedro@pedro.com");
        chrome.findElement(By.id("password")).sendKeys("pedro123");
        chrome.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button")).click();
        //fechar navegador
        chrome.quit();
    }
}
