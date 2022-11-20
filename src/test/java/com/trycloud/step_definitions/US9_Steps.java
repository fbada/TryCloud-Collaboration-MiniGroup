package com.trycloud.step_definitions;

import com.trycloud.pages.US9page;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US9_Steps {
    @And("the user choose the {string} option")
public void theUserChooseTheOption(String details) {
    US9page.detailsOnRightClickMenu(details);

    BrowserUtils.waitFor(1);
}

    @And("user write a comment inside the input box")
    public void userWriteACommentInsideTheInputBox() {
        US9page.commentBtn.click();
        BrowserUtils.waitFor(1);
        String sendMsg = "Testing123";
        US9page.textAreaInDetails.sendKeys(US9page.sendMsg());
        BrowserUtils.waitFor(1);
    }

    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {
        US9page.textSubmit.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verifyTheCommentIsDisplayedInTheCommentSection() {
        US9page.verifyMsgUS9();
    }

}
