package dev.automation.tests;

import dev.automation.pages.DressesPage;
import dev.automation.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DressesPageTest {
    private DressesPage dressesPage;
    private final String URL = "https://automationexercise.com/" ;

    @BeforeEach
    void setUp() throws Exception{
        this.dressesPage =  new DressesPage();
        this.dressesPage.visit(URL);
    }

    @AfterEach
    void tearDown() throws Exception{
        this.dressesPage.quitWebDriver();
    }

    @Test
    void test() {
        //When
        this.dressesPage.viewWomanDressesPage();
        //Then
        Assertions.assertEquals("WOMEN -  DRESS PRODUCTS", this.dressesPage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
        System.out.println(this.dressesPage.getTitlePage());
    }
}
