package com.fidexio.step_definitions;

import com.fidexio.pages.B28G25_66_Page;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class B28G25_66_StepDefinitions {
    B28G25_66_Page b28G25_66_page = new B28G25_66_Page();
    LoginPage loginPage = new LoginPage();

    @When("user enters valid credentials and clicks on login button")
    public void user_enters_valid_credentials_and_clicks_on_login_button() {
        loginPage.login(ConfigurationReader.getProperty("pos_manager_username"), ConfigurationReader.getProperty("pos_manager_password"));

    }

    @When("user should click on the name")
    public void user_should_click_on_the_name() {
        b28G25_66_page.POSManager.click();
    }

    @When("user should click the {string}")
    public void user_should_click_the(String document) {
        b28G25_66_page.DropdownDocumentation.click();
    }

    @Then("user should see the “Odoo Documentation” message is displayed on a new window")
    public void user_should_see_the_odoo_documentation_message_is_displayed_on_a_new_window() {

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindows) {
            Driver.getDriver().switchTo().window(eachWindow);

            if (eachWindow.contains("documentation")) {
                break;
            }
        }
        Assert.assertTrue(b28G25_66_page.HeaderOdooDoc.isDisplayed());


    }

    @Then("user should see {int} main document topics are listed on the new window")
    public void user_should_see_main_document_topics_are_listed_on_the_new_window(Integer int1) {
        int count = 0;
        for (WebElement each : b28G25_66_page.DocumentTopics) {
            count++;

        }
        if (count == int1) {
            System.out.println("Pass");
        }

       //Assert.assertTrue(b28G25_66_page.UserDocs.isEnabled());
    }

}
