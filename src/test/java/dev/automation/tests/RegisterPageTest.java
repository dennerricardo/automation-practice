package dev.automation.tests;

import dev.automation.pages.DressesPage;
import dev.automation.pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegisterPageTest {
    private RegisterPage registerPage;
    private final String URL = "https://automationexercise.com/login" ;

    @BeforeEach
    void setUp() throws Exception{
        this.registerPage =  new RegisterPage();
        this.registerPage.visit(URL);
    }

    @AfterEach
    void tearDown() throws Exception{
//        this.registerPage.quitWebDriver();
    }

//    @Test
//    void test() {
//        //When
//        this.registerPage.insertNametoRegister();
//        this.registerPage.insertEmailtoRegister();
//        //Then
//        Assertions.assertEquals("john01@email.com", this.registerPage.getEmailAccountInformation());
//        Assertions.assertEquals("john", this.registerPage.getNameAccountInformation());
//
//        System.out.println(this.registerPage.getEmailAccountInformation());
//        System.out.println(this.registerPage.getNameAccountInformation());
//    }

    @Test
    void test2() {
        //When
        this.registerPage.fillOutForm();

        //Then
        Assertions.assertEquals("john", this.registerPage.loggedInAs());
//        Assertions.assertEquals("john", this.registerPage.getNameAccountInformation());
//
//        System.out.println(this.registerPage.getEmailAccountInformation());
//        System.out.println(this.registerPage.getNameAccountInformation());
    }

}
