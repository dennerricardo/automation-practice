package dev.automation.tests;

import dev.automation.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest {
    private LoginPage loginPage;
    private final String BASE_URL = "https://automationexercise.com/";

    @BeforeEach
    void setUp() throws Exception{
        loginPage = new LoginPage();
        loginPage.visit(BASE_URL);
    }

    @AfterEach
    void tearDown() throws Exception{
        loginPage.quitWebDriver();
    }

    @Test
    void test() {
        //when
        loginPage.signin();
        //then
        Assertions.assertTrue(this.loginPage.accountLogged().equals("Denner"));
        Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.BASE_URL));
    }
}
