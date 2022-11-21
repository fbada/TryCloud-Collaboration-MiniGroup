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

public class US5_Steps {
    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();
    DashboardCommon DashboardCommon = new DashboardCommon();
    FileFavoritesPage fileFavoritesPage = new FileFavoritesPage();
    Actions actions = new Actions(Driver.getDriver());
    String nameOfFile;

    @Given("user is on the login page")
    public void user_on_the_login() {
        loginPage.navigateTo();
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(
            String username, String password) {
        loginPage.trycloud_login(username, password);

    }

    @When("User click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();
    }


    @And("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {

        nameOfFile = filesPage.nameOfFileSelected();
        System.out.println(nameOfFile);
        filesPage.actionButtonLastFileFav(filesPage.listActions.size());
        BrowserUtils.sleep(2);
    }

//    @And("user choose the Add to favorites option")
//    public void userChooseTheAddToFavoritesOption() {
//        BrowserUtils.sleep(3);
//        actions.moveToElement(FileFavoritesPage.FavoritesOption).pause(1).click().perform();
////    if(FileFavoritesPage.addFavorites.getText().equalsIgnoreCase("Remove from favorites")){
////
////        actions.click(FileFavoritesPage.favoritesButton).build().perform();
////    }else {
////        FileFavoritesPage.addFavorites.click();
////    }
//
//    }

//    @And("user click the Favorites sub-module on the left side")
//    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
//        BrowserUtils.waitFor(3);
//        actions.moveToElement(FileFavoritesPage.FavoritesSubmodule).pause(1).click().pause(1);
//    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//tr//span[contains(.,'" + nameOfFile+ "')])[4]")).isDisplayed());
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(Driver.getDriver().findElement(By.xpath("(//tr//span[contains(.,'" + nameOfFile + "')])[4]"))).perform();
        filesPage.dropDownOptions("Remove from favorites");

    }
}






