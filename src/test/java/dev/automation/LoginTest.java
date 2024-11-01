package dev.automation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.getProperty("webdriver.chrome.driver","C:/Windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");

    }

    @AfterEach
    void tearsDown() throws Exception {
        driver.quit();
    }

    @Test
    void test() {
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@data-qa='login-button']"));

        email.sendKeys("denner@gmail.com");
        password.sendKeys("123123123");
        loginBtn.click();

        WebElement logged = driver.findElement(By.tagName("b"));
        String accountLogged = logged.getText();
        Assertions.assertEquals("Denner",accountLogged);

    }
}
