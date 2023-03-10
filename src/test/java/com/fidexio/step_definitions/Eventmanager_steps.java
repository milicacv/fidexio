package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.US_67page;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Eventmanager_steps {
    LoginPage page = new LoginPage();
    US_67page pagemodul = new US_67page();
    List<WebElement> Allmodules =pagemodul.listofmodules;

    @Then("user should see all {int} modules")
    public void userShouldSeeAllModules(int expected){

        for(WebElement eachModule :Allmodules) {
            Assert.assertEquals(expected, Allmodules.size());

        }


    }

    @Then("user is able to access all modules")
    public void userIsAbleToAccessAllModules() {

        for (WebElement eachModule : Allmodules) {
            Assert.assertTrue(eachModule.isEnabled());
        }

    }
}










