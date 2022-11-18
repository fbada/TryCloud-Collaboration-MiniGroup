package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class TalkPage {{PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy (xpath = "(//div//ul//a[@aria-label='Talk'])[1]")
                public WebElement talkModul;

       @FindBy (xpath=" //input[@class='app-navigation-search__input']" )
                public WebElement searchBox;


        @FindBy (xpath = "//div[@role='textbox']")
                public WebElement messageBox;

        @FindBy (xpath = "//div[@class='scroller']")
                public WebElement fieldMessages;
        @FindBy (xpath = " //span[@class='acli__content__line-one__title']")
                public WebElement userNumber;
}

