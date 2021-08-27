package com.amwel.automationPractice.pages;

import com.amwel.automationPractice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {



    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy (xpath = "//a[normalize-space()='Sign in']")
    public WebElement signIn;


    @FindBy (id = "email")
    public WebElement username;

    @FindBy (id = "passwd")
    public WebElement password;

    @FindBy (id = "search_query_top")
    public WebElement searchBox;

    @FindBy (xpath = "//span[normalize-space()='Sign in']")
    public WebElement signInGreen;



    @FindBy (xpath = "//span[normalize-space()='Kanan Musayev']")
    public WebElement accountHolderName;

    @FindBy (name = "submit_search")
    public WebElement searchButton;

    @FindBy(xpath = "//img[@title='Blouse']")
    public WebElement selectItem;

    @FindBy (xpath = "//span[normalize-space()='Add to cart']")
    public WebElement addItem;

    @FindBy (xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    public WebElement popUp;

    @FindBy (xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement proceedToCO1;

    @FindBy (xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedToCO2;

    @FindBy (xpath = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedToCO3;

    @FindBy (id = "cgv")
    public WebElement agreeTerms;

    @FindBy (xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedToCO4;

    @FindBy (xpath = "//a[@title = 'Pay by bank wire']")
    public WebElement paymentType;

    @FindBy (xpath = "//span[normalize-space()='I confirm my order']")
    public WebElement confirmOrder;

    @FindBy (xpath = "//strong[normalize-space()='Your order on My Store is complete.']")
    public WebElement orderConfirmation;




















}
