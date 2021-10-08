package com.vytrack.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsPage {
    @FindBy(xpath ="//span[normalize-space()='Customers']")
    public WebElement customersModule;

    @FindBy(xpath = "//a/span[.='Contacts']")
    public WebElement contacts;

    @FindBy(xpath = "//div[@class='btn-group' and normalize-space(.)='Create Contact']")
    public WebElement createContactBtn;

    @FindBy(name ="oro_contact_form[firstName]" )
    public WebElement firstName;

    @FindBy(name ="oro_contact_form[lastName]" )
    public WebElement lastName;

    @FindBy (xpath = "//div[@class='message' and .='Contact saved']")
    public WebElement savedConfirmationMessage;

    @FindBy(xpath = "(//button[normalize-space(.)='Save and Close'])[1]")
    public WebElement saveAndClose;




    public void userGoToContacts(){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(customersModule).pause(2000)
                .moveToElement(contacts).pause(2000).click().perform();
       BrowserUtils.waitFor(3);
    }

    public void createContact(){
        createContactBtn.click();
        Faker faker = new Faker();
        BrowserUtils.waitFor(1);
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        BrowserUtils.waitFor(2);
      //  VehiclesPage vehiclesPage = new VehiclesPage();
       saveAndClose.click();

    }

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
