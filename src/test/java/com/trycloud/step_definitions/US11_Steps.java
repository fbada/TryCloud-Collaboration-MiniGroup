package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Config;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US11_Steps {
    TalkPage talkPage=new TalkPage();
    LoginPage loginPage=new LoginPage();

   @Given("user on the dashboard page.")
   public void user_on_the_dashboard_page() {
       Driver.getDriver().get(Config.getProperty("trycloudEnv"));
       loginPage.loginConfigCreds();
   }
    @When("the user clicks the {string} module.")
    public void the_user_clicks_the_module(String string) {
        talkPage.talkModul.click();
    }
    @Then("verify the page title is {string}.")
    public void verify_the_page_title_is(String string) {
       String expected="Talk - Trycloud";
        Assert.assertEquals(Driver.getDriver().getTitle(),expected);
    }
    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
       BrowserUtils.sleep(4);
        talkPage.searchBox.sendKeys("User34"+Keys.ENTER);
        talkPage.userNumber.click();
        BrowserUtils.sleep(4);
    }
    @And("user write a message")
    public void user_write_a_message() {
        talkPage.messageBox.sendKeys("Hello");
    }
    @And("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        talkPage.messageBox.click();
    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
       talkPage.fieldMessages.isDisplayed();
        System.out.println(talkPage.fieldMessages.getText());
    }


}