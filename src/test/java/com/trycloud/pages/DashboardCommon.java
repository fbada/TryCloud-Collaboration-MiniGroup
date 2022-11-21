package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardCommon {
    public DashboardCommon(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement WeatherLocationButton;

    @FindBy(xpath = "//ul[@id='appmenu']//span")
    public List<WebElement> allModules;


    @FindBy(xpath = "//span[@aria-label='Magnify icon']")
    public WebElement magnifiierIcon;

    @FindBy(xpath = "//input[@placeholder='Search apps, files, comments, deck, messages, contacts, conversations, events, tasks, settings, messages …']")
    public WebElement searchField;

    public List<String> getActualModules(){

        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : allModules) {
            elemTexts.add(el.getAttribute("innerHTML").strip().trim());
        }
        return elemTexts;
    }

    public WebElement accessModules(String module){
        String xpath = "//ul[@id='appmenu']//a[@aria-label='"+module+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement searchQueryResult(String search) {
        String xpath = "//div[@id ='header-menu-unified-search']//a//h3[contains(@title, '" + search + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


}
