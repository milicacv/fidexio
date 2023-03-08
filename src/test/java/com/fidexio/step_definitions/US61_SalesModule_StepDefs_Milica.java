package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.US61_SalesPage_Milica;
import com.fidexio.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US61_SalesModule_StepDefs_Milica {

    LoginPage loginPage = new LoginPage();
    US61_SalesPage_Milica salesPage_milica = new US61_SalesPage_Milica();

    @Given("user is logged in with {string} and {string}")
    public void user_is_logged_in_with_and(String email, String password) {

       loginPage.login(ConfigurationReader.getProperty(email), ConfigurationReader.getProperty(password));

    }

    @When("user click {string} page")
    public void user_click_page(String module) {

        for (WebElement each : salesPage_milica.mainMenu) {
            if(each.getText().trim().equals(module)){
                each.click();
            }
        }


    }

    @Then("user should see {string} columns")
    public void user_should_see_columns(String numberOfColumns) {

        int expected_numberOfColumns = Integer.parseInt(numberOfColumns);

        Assert.assertEquals(expected_numberOfColumns, salesPage_milica.quotationsColumns.size());

    }



}
