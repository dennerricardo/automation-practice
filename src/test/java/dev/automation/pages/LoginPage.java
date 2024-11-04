package dev.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    //Locators
    private By email = By.name("email") ;
    private By password = By.name("password") ;
    private By loginBtn = By.xpath("//button[@data-qa='login-button']") ;
    private By logged = By.tagName("b") ;



    public void signin(){
        if(super.isDisplayed(email)){
            super.type("denner@gmail.com",email);
            super.type("123123123",password);
            super.click(loginBtn);
        }else {
            System.out.println("Textbox was not present");
        }
    }

    public String accountLogged(){
       return super.getText(logged);
    }
}
