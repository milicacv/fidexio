package com.fidexio.step_definitions;

import com.fidexio.pages.US03_MainModulesPage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US03_MainModulesStepDefinitions {
    US03_MainModulesPage mainModulesPage = new US03_MainModulesPage();
    List<WebElement> All22Modules = mainModulesPage.listOfModulesBM;

    US03_MainModulesPage dropDownList = new US03_MainModulesPage();

    @Then("User should be able to see all {int} modules")
    public void user_should_be_able_to_see_all_modules(int expected) {
        BrowserUtils.sleep(5);
        for (WebElement eachModule : All22Modules) {
            Assert.assertEquals(expected, All22Modules.size());
        }

        }


    @Then("User should access all modules")
    public void user_should_access_all_modules() {
        BrowserUtils.sleep(5);
        for (WebElement eachModule : All22Modules) {
            Assert.assertTrue(eachModule.isEnabled());
        }

    }

}
