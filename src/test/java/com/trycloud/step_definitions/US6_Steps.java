package com.trycloud.step_definitions;

import com.trycloud.pages.FileFavoritesPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.trycloud.step_definitions.US10_Steps.fileName;

public class US6_Steps {
    FilesPage filesPage = new FilesPage();
    FileFavoritesPage fileFavoritesPage = new FileFavoritesPage();
    String name;

    @When("the user clicks action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
BrowserUtils.waitFor(3);
        filesPage.actionButtonLastFileFav(filesPage.listActions.size());
        BrowserUtils.sleep(2);
        filesPage.selectOption("Add to favorites");
        BrowserUtils.sleep(2);

        //make sure there is at least one available to Remove from Favorites

        name = filesPage.nameOfFirstFileSelected();
        System.out.println("name = " + name);
        filesPage.listActions.get(0).click();

    }

    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.waitFor(2);
        System.out.println("fileName = " + fileName);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='" + fileName + "']")).isDisplayed());
        BrowserUtils.waitFor(3);
        filesPage.deleteUploadedFile(fileName);
    }




    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        filesPage.selectOption(string);
        BrowserUtils.waitFor(3);
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        filesPage.subModule(string).click();
        BrowserUtils.waitFor(5);
    }

    @Then("verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        for (WebElement each : fileFavoritesPage.listInFavorites) {
            System.out.println(each.getText());
            Assert.assertNotEquals(each.getText(), name);
        }
    }
}
