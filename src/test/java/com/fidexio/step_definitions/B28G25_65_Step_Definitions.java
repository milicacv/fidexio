package com.fidexio.step_definitions;

import com.fidexio.pages.B28G25_65Page;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B28G25_65_Step_Definitions {


    B28G25_65Page b28G2565Page = new B28G25_65Page();
    LoginPage loginPage = new LoginPage();

    @When("the user enters valid credentials and clicks on submit")
    public void theUserEntersValidCredentialsAndClicksOnSubmit() {
        loginPage.login(ConfigurationReader.getProperty("pos_manager_username"), ConfigurationReader.getProperty("pos_manager_password"));

    }

    @When("The user clicks on the the Point of Sale module")
    public void theUserClicksOnTheThePointOfSaleModule() {
        b28G2565Page.posModule.click();
    }

    @And("The user clicks on the orders button")
    public void theUserClicksOnTheOrdersButton() {
        b28G2565Page.ordersButton.click();
    }

    @When("The user clicks on the Order reference checkbox")
    public void theUserClicksOnTheOrderReferenceCheckbox() {

        b28G2565Page.checkbox.click();
    }

    @Then("All the orders should be checked")
    public void allTheOrdersShouldBeChecked() {
        for (WebElement each : b28G2565Page.checkboxes) {

            Assert.assertTrue(each.isSelected());
        }

    }


    @When("The user clicks on actions dropdown")
    public void theUserClicksOnActionsDropdown() {
        b28G2565Page.actionDropdown.click();
    }

    @Then("The user should see the options bellow")
    public void theUserShouldSeeTheOptionsBellow(List<String> actualOptions) {

        List<String> expectedResult_String = new ArrayList<>();
        expectedResult_String.addAll(Arrays.asList("Export", "Import", "Delete"));

        Assert.assertEquals(expectedResult_String, actualOptions);

        }

    }























