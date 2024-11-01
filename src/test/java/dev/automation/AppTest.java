package dev.automation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    private WebDriver driver;

    @Test
    public void helloSelenium() {
        System.getProperty("webdriver.chrome.driver","C:/Windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/";

        Assertions.assertEquals(currentUrl,expectedUrl);
        driver.quit();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
