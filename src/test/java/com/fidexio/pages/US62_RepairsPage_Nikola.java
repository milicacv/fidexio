package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US62_RepairsPage_Nikola {

    public US62_RepairsPage_Nikola(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@style='display: block;']//span")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> columns;




}
