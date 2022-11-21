package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.US9page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US9_Steps {
    FilesPage filesPage = new FilesPage();
    US9page us9page = new US9page();
    String sendMsg = "Testing123";

    @And("the user choose the {string} option")
public void theUserChooseTheOption(String details) {

        filesPage.selectOption(details);
   // US9page.detailsOnRightClickMenu(details);

    BrowserUtils.waitFor(1);
}

    @And("user write a comment inside the input box")
    public void userWriteACommentInsideTheInputBox() {

        filesPage.commentIcon.click();
        BrowserUtils.verifyElementDisplayed(filesPage.commentField);

        filesPage.commentField.sendKeys(sendMsg);
        BrowserUtils.waitFor(1);
//        us9page.commentBtn.click();
//        BrowserUtils.waitFor(1);
//        US9page.textAreaInDetails.sendKeys(US9page.sendMsg());
//        BrowserUtils.waitFor(1);
    }

    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {
        filesPage.submitComment.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verifyTheCommentIsDisplayedInTheCommentSection() {
//        US9page.verifyMsgUS9();

        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//aside//div[.='" + sendMsg + "']")).isDisplayed());
    }

}
