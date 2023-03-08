package com.fidexio.step_definitions;

import com.fidexio.pages.B28G25_67_PAGE;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Eventmanager_steps{

    B28G25_67_PAGE b28G25_67_page= new B28G25_67_PAGE();
    LoginPage page = new LoginPage();
    @When("user enters valid credentials and clicks on login button")
    public void userEntersValidCredentialsAndClicksOnLoginButton() {
        page.login(ConfigurationReader.getProperty("events_manager_username"),ConfigurationReader.getProperty("events_manager_password"));

        page.submit.click();
    }
    @Then("user should be able to see all modules")
    public void user_should_be_able_to_see_all_modules(){


       b28G25_67_page.allmodules.isEnabled();
    }
    @Then("user should access different modules")
    public void user_should_access_different_modules(){

        b28G25_67_page.allmodules.isEnabled();


    }

}
