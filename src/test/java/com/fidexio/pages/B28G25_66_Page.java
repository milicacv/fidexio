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

  // @FindBy(xpath = "//div[@class='col-lg-6']//h2//a[@href='applications.html'][normalize-space()='User Docs']")
 // public WebElement UserDocs;

   // @FindBy(xpath ="//h2[@class='border-top pt-4 pt-lg-0']//a[@href='administration.html'][normalize-space()='Install and Maintain']")
   // public WebElement InstallAndMaintain;

   // @FindBy(xpath = "//h2[@class='border-top pt-4']//a[@href='developer.html'][normalize-space()='Developer']")
   // public WebElement Developer;

    // @FindBy(xpath = "//h2[@class='border-top pt-4']//a[@href='contributing.html'][normalize-space()='Contributing']")
   // public WebElement Contributing;

    @FindBy(xpath = "//h2")
    public List<WebElement> DocumentTopics;

}



