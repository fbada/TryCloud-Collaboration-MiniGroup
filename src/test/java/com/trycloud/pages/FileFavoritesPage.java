package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.trycloud.step_definitions.US10_Steps.filePath;

public class FileFavoritesPage {
    public FileFavoritesPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}
    public static String fileName = filePath.substring(filePath.lastIndexOf('/') + 1, filePath.lastIndexOf('.'));
    @FindBy(xpath = "(//span[@class='icon icon-more'])[9]")
public static WebElement  firstactionbtn;


    @FindBy(xpath = "(//span[.='Modified'])[1]")
public static WebElement sortbtn;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg active']")
public static  WebElement FavoritesSubmodule;

    @FindBy(xpath = "//*[@id='rightClickMenu']/ul/li[1]")
    public static WebElement addFavorites;

    @FindBy(xpath = "(//span[@class='nametext'])[1]")
    public static WebElement ClickOnFile;

    @FindBy (xpath = "//li[@data-id='favorites']")
    public static WebElement favoritesButton;


    @FindBy (xpath = "//section[@id='tab-activityTabView']//li[1]//div[1]")
    public static WebElement verifyFavorites;

    @FindBy (xpath = "(//span[@class='icon icon-starred'])")
    public static WebElement FavoritesOption;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> listInFavorites;
}

