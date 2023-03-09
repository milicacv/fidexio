package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.US62_RepairsPage_Nikola;
import com.fidexio.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US62_RepairsModule_StepDefs_Nikola {

    LoginPage loginPage = new LoginPage();

    US62_RepairsPage_Nikola repairsPage_nikola = new US62_RepairsPage_Nikola();



    @Given("User is logged in with {string} and {string}")
    public void user_is_logged_in_with_and(String email, String password) {
       loginPage.login(ConfigurationReader.getProperty(email), ConfigurationReader.getProperty(password));
    }

    @When("User click {string} module")
    public void user_click_module(String module) {
        for (WebElement each : repairsPage_nikola.mainMenu) {

            if(each.getText().trim().equals(module)){
                each.click();
            }

        }

    }

    @Then("User see {string} columns")
    public void user_see_columns(String columns) {

        int expectedColumns = Integer.parseInt(columns);
        Assert.assertEquals(expectedColumns, repairsPage_nikola.columns.size());

    }


}
