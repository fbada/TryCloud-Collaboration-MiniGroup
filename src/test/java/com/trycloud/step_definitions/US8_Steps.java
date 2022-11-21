

package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.US8page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class US8_Steps {
FilesPage filesPage = new FilesPage();
     String name;

    @And("user click action-icon from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        name = filesPage.nameOfFirstFileSelected();
        System.out.println("Selected file name = " + name);
        filesPage.listActions.get(0).click();
    }
//    @And("user choose the {string} option")
//    public void userChooseTheOption(String deleteF) {
//        US8page.deleteFile(deleteF);
//        BrowserUtils.waitFor(1);
//    }

    @When("the user clicks the {string} sub-module on the left side")
    public void theUserClicksTheSubModuleOnTheLeftSide(String deletedFiles) {
        filesPage.subModule(deletedFiles).click();
        BrowserUtils.waitFor(5);
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {
        System.out.println(name);

       Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//tr//span[contains(.,'" + name+ "')])[4]")).isDisplayed());
    }
}
