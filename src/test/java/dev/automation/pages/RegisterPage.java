package dev.automation.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    //Locator
    private By nameSignup = By.xpath("//input[@data-qa='signup-name']");
    private By emailAddress = By.xpath("//input[@data-qa='signup-email']");
    private By signupBtn = By.xpath("//button[@data-qa='signup-button']");
    private By nameInformation = By.id("name");
    private By emailInformation = By.id("email");
    private By alertAddress = By.xpath("//span[@class='inline-infos']");
    private By mrTitle = By.id("id_gender1");
    private By passwordField = By.id("password");
    private By dayBirth = By.id("days");
    private By monthBirth = By.id("months");
    private By yearBirth = By.id("years");
    private By newsletterCheck = By.id("newsletter");
    private By receiveCheck = By.id("optin");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address = By.id("address1");
    private By coutry = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");
    private By createAccount = By.xpath("//button[@type='submit']");
    private By userLogged = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b");




    public void insertNametoRegister() {
        if(super.isDisplayed(nameSignup)){
            type("john", nameSignup);
        }else{
            System.out.println("name textbox was not found");
        }
    }
    public void insertEmailtoRegister() {
        if(super.isDisplayed(emailAddress)){
           type("john01@email.com", emailAddress);
           click(signupBtn);
        }else{
            System.out.println("email textbox was not found");
        }
    }

    public String getEmailAccountInformation(){
        super.waitVisibilityOfElementLocated(alertAddress);
        return super.getTextByAttribute(this.emailInformation,"value" );
    }

    public String getNameAccountInformation(){
        super.waitVisibilityOfElementLocated(alertAddress);
        return super.getTextByAttribute(this.nameInformation,"value" );
    }

    public void fillOutForm(){
        this.insertNametoRegister();
        this.insertEmailtoRegister();
        super.waitVisibilityOfElementLocated(alertAddress);
        if(super.isDisplayed(mrTitle)){
            super.click(mrTitle);
            super.type("john",firstName);
            super.type("jones",lastName);
            super.type("jj@123",passwordField);
            super.selectByValue(dayBirth,"2");
            super.selectByValue(monthBirth,"5");
            super.selectByValue(yearBirth,"1990");
            super.click(newsletterCheck);
            super.click(receiveCheck);
            super.type("IT",company);
            super.type("RIO DE JANEIRO",address);
            super.selectByValue(coutry,"Canada");
            super.type("Quebeq",state);
            super.type("vancouver",city);
            super.type("123264",zipcode);
            super.type("999993",mobileNumber);
            super.actionMoveToElementPerform(zipcode);
            super.waitVisibilityOfElementLocated(createAccount);
            super.click(createAccount);
        }else{
            System.out.println("Message was not found");
        }
    }

    public String loggedInAs(){
        return super.findElement(this.userLogged).getText();

    }


}
