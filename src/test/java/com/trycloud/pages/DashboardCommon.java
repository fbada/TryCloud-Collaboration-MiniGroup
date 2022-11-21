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
}
