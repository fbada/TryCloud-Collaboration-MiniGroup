package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div//ul//a[@aria-label='Contacts'])[1]")
    public WebElement contactsModule;
}