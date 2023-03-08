package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B28G25_65Page {

    public B28G25_65Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement posModule;

    @FindBy(xpath = "//a[@data-action-id='663']/span")
    public WebElement ordersButton;

    @FindBy(xpath = "//tr/th//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//td/div[@class='o_checkbox']/input")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "//div[@class='o_cp_sidebar']")
    public WebElement actionDropdown;

    @FindBy(xpath = "//div[@class='o_cp_sidebar']/..")
    public List<WebElement> optionsList;

    @FindBy(xpath = "//a[@data-index='0']")
    public WebElement exportOption;

    @FindBy(xpath = "//a[@data-index='1']")
    public WebElement deleteOption;
}
