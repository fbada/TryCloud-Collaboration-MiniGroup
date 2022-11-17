package com.trycloud.step_definitions;

import com.trycloud.pages.TalkPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US11_Steps {
    TalkPage talkPage=new TalkPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
    talkPage.talkModul.click();


    }




    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
     talkPage.searchBox.sendKeys("User34");


    }
    @When("user write a message")
    public void user_write_a_message() {

    }
    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {

    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {

    }

}
