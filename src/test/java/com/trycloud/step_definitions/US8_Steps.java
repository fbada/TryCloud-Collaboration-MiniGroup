

package com.trycloud.step_definitions;

import com.trycloud.pages.US8page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US8_Steps {
//    @When("the user clicks the {string} module")
//    public void theUserClicksTheModule(String files) {
//        US8page.selectTopModule(files);



    @And("user click action-icon from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(US8page.deletedFileName).build().perform();
        US8page.fileName();
        BrowserUtils.waitFor(2);
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String deleteF) {
        US8page.deleteFile(deleteF);
        BrowserUtils.waitFor(1);
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void theUserClicksTheSubModuleOnTheLeftSide(String deletedFiles) {

        US8page.deletedFiles(deletedFiles);
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {

        US8page.verifyDeletedFileUS8();
    }}
//    @When("user click action-icon from any file on the page")
//public void user_click_action_icon_from_any_file_on_the_page() {
//
//}
//    @When("user choose the {string} option")
//    public void user_choose_the_option(String string) {
//
//
//    }
//    @When("the user clicks the {string} sub-module on the left side")
//    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
//
//    }
//    @Then("Verify the deleted file is displayed on the page.")
//    public void verify_the_deleted_file_is_displayed_on_the_page() {
//
//    }
//}
