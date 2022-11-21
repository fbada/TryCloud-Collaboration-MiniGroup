package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardCommon;
import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US4_Steps {

    FilesPage filesPage = new FilesPage();
    DashboardCommon dashboardCommon = new DashboardCommon();

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String module) {
        dashboardCommon.accessModules(module).click();
        BrowserUtils.waitFor(4);
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesPage.selectAll.click();
        BrowserUtils.waitFor(3);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertEquals(Driver.getDriver().getTitle(), string);
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {

        for (WebElement each : filesPage.allFiles) {
            Assert.assertTrue(each.isSelected());
        }

    }

}
