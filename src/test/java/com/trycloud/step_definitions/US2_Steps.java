package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_Steps {
    LoginPage loginPage = new LoginPage();

    @When("user types invalid username {string} and password {string}")
    public void user_types_invalid_username_and_password(String string, String string2) {
       loginPage.trycloud_login(string, string2);
    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String string) {
        BrowserUtils.verifyElementDisplayed(loginPage.wrongMsg);
        System.out.println(loginPage.wrongMsg.getText());
        Assert.assertEquals(string, loginPage.wrongMsg.getText());

    }

}
