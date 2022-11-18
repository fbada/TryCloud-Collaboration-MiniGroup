package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileFavoritesPage {
    public FileFavoritesPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}


    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
public static  WebElement FavoritesSubmodule;

    @FindBy(xpath = "//*[@id='rightClickMenu']/ul/li[1]")
    public static WebElement addFavorites;

    @FindBy(xpath = "(//span[@class='nametext'])[1]")
    public static WebElement ClickOnFile;

    @FindBy (xpath = "//li[@data-id='favorites']")
    public static WebElement favoritesButton;


    @FindBy (xpath = "//*[@id='fileList']/tr/td[1]/a/span[1]/span[1]")
    public WebElement verifyFavorites;
}
