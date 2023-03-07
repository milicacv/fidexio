package com.fidexio.step_definitions;

import com.fidexio.pages.B28G25_65Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B28G25_65_Step_Definitions {


    B28G25_65Page b28G2565Page = new B28G25_65Page();
    @When("The user clicks on the the Point of Sale module")
    public void the_user_clicks_on_the_the_point_of_sale_module() {
        b28G2565Page.posModule.click();

    }

    @When("The user clicks on the orders button")
    public void the_user_clicks_on_the_orders_button() {
        b28G2565Page.ordersButton.click();
    }

    @Then("The user should see the order list")
    public void the_user_should_see_the_order_list() {

    }


    @When("The user clicks on the Order reference checkbox")
    public void theUserClicksOnTheOrderReferenceCheckbox() {
    }

    @Then("All the orders should be checked")
    public void allTheOrdersShouldBeChecked() {
    }

    @When("The user clicks on actions dropdown")
    public void theUserClicksOnActionsDropdown() {
    }

    @Then("The user should see the options bellow")
    public void theUserShouldSeeTheOptionsBellow() {
    }
}
