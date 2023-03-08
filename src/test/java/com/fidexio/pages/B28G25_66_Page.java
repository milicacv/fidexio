package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B28G25_66_Page {
    public B28G25_66_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement POSManager;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement DropdownDocumentation;

    @FindBy(xpath = "//h1[text()='Odoo Documentation']")
    public WebElement HeaderOdooDoc;


    @FindBy(xpath = "//h2")
    public List<WebElement> DocumentTopics;

}



