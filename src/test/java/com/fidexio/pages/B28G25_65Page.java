package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B28G25_65Page {

    public B28G25_65Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement posModule;

    @FindBy(xpath = "//a[@data-action-id='663']/span")
    public WebElement ordersButton;

    @FindBy(xpath = "//li[.='Orders']")
    public WebElement ordersText;
}
