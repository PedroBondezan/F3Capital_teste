package modulos.metods;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;


public class Cadastrar {
    @Test
    public void cadastrandoUsuario() {
        //Abrindo
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://front.serverest.dev/cadastrarusuarios");
        chrome.manage().window().maximize();
        Faker faker = new Faker();

        String name = faker.name().firstName();
        String email = faker.internet().emailAddress();
        String password = faker.number().digits(12);
        //preenchedo campos com informações necessárias
        chrome.findElement(By.id("nome")).sendKeys(name);
        chrome.findElement(By.id("email")).sendKeys(email);
        chrome.findElement(By.id("password")).sendKeys(password);
        chrome.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[5]/button")).click();
        //fechar navegador
        chrome.quit();
    }
}
