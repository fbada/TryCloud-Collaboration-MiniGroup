package com.trycloud.step_definitions;
import com.github.javafaker.Faker;
import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US7_Steps {
FilesPage filesPage = new FilesPage();
    String folderName;
    public static final String pathFile = "";




    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        filesPage.addButton.click();


    }

    @When("user clicks on {string} option")
    public void user_clicks_on_option(String string) {
        Driver.getDriver().findElement(By.xpath("//span[.='"+string+"']/..")).click();
        BrowserUtils.waitFor(2);


    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        folderName = "Folder_oo1";
        filesPage.newFolderTextBox.sendKeys(folderName);


    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.newFolderSubmit.click();
        BrowserUtils.waitFor(2);

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//td//span[.='"+folderName+"']")).isDisplayed());
//delete the folder

        filesPage.actionButtonLastFile();

    }

    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

        Faker faker = new Faker();
        int randNum = faker.number().numberBetween(1, filesPage.folderFiles.size()-1);
        System.out.println("randNum = " + randNum);
        filesPage.folderFiles.get(randNum).click();
     BrowserUtils.waitFor(3);

    }


}
