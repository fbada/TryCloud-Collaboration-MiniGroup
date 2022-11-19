package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardCommon;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class US10_Steps {

    LoginPage loginPage = new LoginPage();
    DashboardCommon dashboardCommon = new DashboardCommon();
    FilesPage filesPage = new FilesPage();
    public static final String systemPath = System.getProperty("user.dir");
    public static final String filePath = systemPath + "/src/test/resources/UploadingFIles/Whhyyy.png";
    public static final String fileName = filePath.substring(filePath.lastIndexOf('/') + 1, filePath.lastIndexOf('.'));
///Users/rds1/Desktop/LearnSamples/TryCloud-MiniGroup/src/test/resources/UploadingFIles/Whhyyy.png

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        filesPage.settingsButton.click();
        BrowserUtils.waitFor(3);
    }


    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        for (WebElement checkBox : filesPage.settingsCheckboxes) {
            BrowserUtils.highlight(checkBox);
            checkBox.click();
            BrowserUtils.waitFor(1);
            Assert.assertTrue(checkBox.isEnabled());
            checkBox.click();
        }
    }
    String beforeStorage, afterStorage;
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        beforeStorage = filesPage.storageAmount.getText();
        System.out.println("beforeStorage = " + beforeStorage);
    }

    @When("user uploads file with the {string} file option")
    public void user_uploads_file_with_the_file_option(String string) {
        filesPage.addButton.click();
        BrowserUtils.waitFor(2);
        filesPage.uploadStart.sendKeys(filePath);
        BrowserUtils.waitFor(5);

        // Check if upload failed due to Not Enough Space and retry
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(filesPage.notEnoughSpaceBtn.isDisplayed());
            filesPage.notEnoughSpaceBtn.click();
            BrowserUtils.sleep(1);
            filesPage.uploadStart.sendKeys(filePath);
            BrowserUtils.waitFor(3);
        } catch (Exception e) {
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }

    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(2);
    }

    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        afterStorage = filesPage.storageAmount.getText();
        afterStorage = afterStorage.substring(0, afterStorage.indexOf(' '));
        beforeStorage = beforeStorage.substring(0, beforeStorage.indexOf(' '));

        System.out.println(afterStorage);

        BrowserUtils.waitFor(1);
        Assert.assertTrue(Double.parseDouble(beforeStorage) < Double.parseDouble(afterStorage));

        //Delete the element
        filesPage.deleteUploadedFile(fileName);
        //  Driver.closeDriver();
    }

}