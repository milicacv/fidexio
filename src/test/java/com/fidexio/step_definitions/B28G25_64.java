package com.fidexio.step_definitions;


import com.fidexio.pages.B28G25_64Page;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.core.gherkin.DataTableArgument;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class B28G25_64 {

    LoginPage loginPageLocators = new LoginPage();
    B28G25_64Page buttonLocators = new B28G25_64Page() ;



    //This method created to login in Inventory manager account
    @Given("user login to the Inventory manager account")
    public void user_login_to_the_inventory_manager_account() {
        loginPageLocators.userName.sendKeys("imm10@info.com");
        loginPageLocators.password.sendKeys("inventorymanager");
        loginPageLocators.submit.click();

    }

  /*  @When("user is on Discuss page by default")
    public void user_is_on_discuss_page_by_default() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


  @When("user click on button {string}")
  public void userClickOnButton(String  moduleButton) {
      BrowserUtils.sleep(1);



  buttonLocators = new B28G25_64Page();

      BrowserUtils.sleep(1);
      if(moduleButton.equalsIgnoreCase("Calendar")){
          buttonLocators.calendarModuleLinkButton.click();

      }else if(moduleButton.equalsIgnoreCase("Notes")){
          buttonLocators.notesModuleLinkButton.click();

      } else if(moduleButton.equalsIgnoreCase("Contact")){
          buttonLocators.contactsModuleLinkButton.click();

      } else if(moduleButton.equalsIgnoreCase("Website")){
          buttonLocators.websiteModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Inventory")){
          buttonLocators.inventoryModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Manufacturing")){
          buttonLocators.manufacturingModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Repair")){
          buttonLocators.repairsModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Invoices")){
          buttonLocators.invoicingModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Timesheets")){
          buttonLocators.timeSheetsModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Employees")){
          buttonLocators.employeesModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Leaves")){
          buttonLocators.leavesModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Expenses")){
          buttonLocators.expensesModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Lunch")){
          buttonLocators.lunchModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Maintenance")){
          buttonLocators.maintenanceModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Dashboard")){
          buttonLocators.dashboardModuleLinkButton.click();
      }else if(moduleButton.equalsIgnoreCase("Discuss")){
          buttonLocators.discussModuleLinkButton.click();
      }
      BrowserUtils.sleep(1);

    */


    @When("verify user is able go to Modules")
    public void verifyUserIsAbleGoToModules() {

       for (WebElement eachButton : buttonLocators.listOfButtons()) {
            BrowserUtils.sleep(1);
            Assert.assertTrue(eachButton.isEnabled());
        }
    }


    //in case in it not full page, user should search in more module
}
