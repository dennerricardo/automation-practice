package dev.automation.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
    //Locator
    private By categoryWoman = By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a");
    private By categoryWomanDresses = By.cssSelector("#Women > div > ul > li:nth-child(1) > a");
    private By addDressesToCard = By.cssSelector("body > section > div > div.row > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.product-overlay > div > a");
    private By titlePageWomanDresses = By.xpath("//h2[@class='title text-center']");


    public void viewWomanDressesPage() {
        if(super.isDisplayed(categoryWoman)){
            super.click(categoryWoman);
            super.scrollTo(categoryWomanDresses);
            super.click(categoryWomanDresses);
            super.actionMoveToElementPerform(addDressesToCard);
            super.actionMoveToElementClickPerform(addDressesToCard);
        }else{
            System.out.println("category woman dresses was not found");
        }
    }

    public String getTitlePage(){
        return super.getText(titlePageWomanDresses);
    }
}
