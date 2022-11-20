package com.trycloud.step_definitions;

import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Config;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_Steps {
    ContactsPage contactsPage=new ContactsPage();
    LoginPage loginPage=new LoginPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(Config.getProperty("trycloudEnv"));
        loginPage.loginConfigCreds();
    }
    @When("the user clicks the Contacts module")
    public void the_user_clicks_the_contacts_module() {
        contactsPage.contactsModule.click();
    }
    @Then("verify the page title is Contacts - Trycloud")
    public void verify_the_page_title_is_contacts_trycloud() {
        String expected="Contacts - Trycloud";
        Assert.assertEquals(Driver.getDriver().getTitle(),expected);
    }

}


