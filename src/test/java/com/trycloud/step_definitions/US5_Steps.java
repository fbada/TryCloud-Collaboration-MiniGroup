package com.trycloud.step_definitions;

import com.trycloud.pages.*;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.trycloud.step_definitions.US10_Steps.fileName;

public class US5_Steps {
    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();
    DashboardCommon DashboardCommon = new DashboardCommon();

    @Given("user is on the login page")
    public void user_on_the_login() {
        loginPage.navigateTo();
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(
            String username, String password) {
        loginPage.trycloud_login(username, password);
    }

    @And("the user clicks the Files module")
    public void theUserClicksTheModule(String module) {
        DashboardCommon.accessModules(module).click();

    }
    @And("the users click action-icon from any file on the page")
public void theUsersClickActionIconFromAnyFileOnThePage() {
    Actions actions = new Actions(Driver.getDriver());
    actions.contextClick(FileFavoritesPage.ClickOnFile).perform();

}
    @And("user choose the Add to favorites option")
    public void userChooseTheAddToFavoritesOption() {
    if(FileFavoritesPage.addFavorites.getText().equalsIgnoreCase("Remove from favorites")){
        Actions actions = new Actions((Driver.getDriver()));
        actions.doubleClick(FileFavoritesPage.favoritesButton).build().perform();
    }else {
        FileFavoritesPage.addFavorites.click();
    }

        }

    @And("user click the Favorites sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(FileFavoritesPage.FavoritesSubmodule).click();
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
            BrowserUtils.waitFor(2);
            System.out.println("fileName = " + fileName);
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='" + fileName + "']")).isDisplayed());

            BrowserUtils.waitFor(3);
            filesPage.deleteUploadedFile(fileName);
        }
    }






