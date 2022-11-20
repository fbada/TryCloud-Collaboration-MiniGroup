package com.trycloud.step_definitions;

import com.trycloud.pages.ContactsPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US13_Steps {
    ContactsPage contactsPage=new ContactsPage();
    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        contactsPage.contactsModule.click();
    BrowserUtils.sleep(4);}


    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        contactsPage.contactPageList.isDisplayed();
    }}



