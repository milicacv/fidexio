package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import io.cucumber.core.gherkin.DataTableArgument;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class B28G25_64Page {
    /*
    This page created for 'InventoryManager10' account
     */
    public B28G25_64Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='mail.mail_channel_menu_root_chat']")
    public WebElement discussModuleLinkButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='calendar.mail_menu_calendar']")
    public WebElement calendarModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[3]")
    public WebElement notesModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[4]")
    public WebElement contactsModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
    public WebElement websiteModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement inventoryModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[7]")
    public WebElement manufacturingModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[8]")
    public WebElement repairsModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[9]")
    public WebElement invoicingModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[10]")
    public WebElement timeSheetsModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[11]")
    public WebElement employeesModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[12]")
    public WebElement leavesModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[13]")
    public WebElement expensesModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[14]")
    public WebElement lunchModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[15]")
    public WebElement maintenanceModuleLinkButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[16]")
    public WebElement dashboardModuleLinkButton;



    public ArrayList<WebElement> listOfButtons() {

        ArrayList<WebElement> listOfButtons = new ArrayList<>();
        listOfButtons.add(calendarModuleLinkButton);
        listOfButtons.add(notesModuleLinkButton);
        listOfButtons.add(contactsModuleLinkButton);
        listOfButtons.add(websiteModuleLinkButton);
        listOfButtons.add(inventoryModuleLinkButton);
        listOfButtons.add(manufacturingModuleLinkButton);
        listOfButtons.add(repairsModuleLinkButton);
        listOfButtons.add(invoicingModuleLinkButton);
        listOfButtons.add(timeSheetsModuleLinkButton);
        listOfButtons.add(employeesModuleLinkButton);
        listOfButtons.add(leavesModuleLinkButton);
        listOfButtons.add(expensesModuleLinkButton);
        listOfButtons.add(lunchModuleLinkButton);
        listOfButtons.add(maintenanceModuleLinkButton);
        listOfButtons.add(dashboardModuleLinkButton);
        listOfButtons.add(discussModuleLinkButton);

        return listOfButtons;
    }

}
