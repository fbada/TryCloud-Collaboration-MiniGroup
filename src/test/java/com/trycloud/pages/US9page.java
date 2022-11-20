package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US9page extends BasePage{

    @FindBy (xpath = "//div[@id='rightClickMenu']/ul/li[2]/a/span/following-sibling::span[.='Details']")
    public WebElement detailsOnRightClickMenu;

    public static void detailsOnRightClickMenu(String str){
        String locator = "//div[@id='rightClickMenu']/ul/li[2]/a/span/following-sibling::span[.='"+str+"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }

    @FindBy (xpath = "//a[@id='commentsTabView']/span")
    public static WebElement commentBtn;

    @FindBy (xpath = "(//div[@class='message'])[1]")
    public static WebElement textAreaInDetails;

    @FindBy (xpath = "//div[@class='message']/following-sibling::input[@type='submit']")
    public static WebElement textSubmit;

    @FindBy (xpath = "//div[@class='message']")
    public static List<WebElement> verifyMsg;

    public static String sendMsg(){
        String sendMsg = "Testing321";
        return sendMsg;
    }

    public static void verifyMsgUS9(){
        String str = "";
        for (WebElement each : verifyMsg) {
            if (each.getText().equalsIgnoreCase(sendMsg())) {
                str += each.getText();
                break;
            }
        }
        Assert.assertEquals(sendMsg(),str);
    }

}