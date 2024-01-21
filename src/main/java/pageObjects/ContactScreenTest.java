package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesStepDefination.ValidateAndVerifyContactScreenStep;


public class ContactScreenTest extends ValidateAndVerifyContactScreenStep {

    public WebDriver driver;

    public ContactScreenTest(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    private static String title = "//h1/text()";


    public static void getTitle(String expectedTitle) {


    }

    @FindBy(css = "")
    private WebElement webElement;
    @FindBy(id = "nav-contact")
    WebElement contact;

    @FindBy(xpath = "//a[@class='btn-contact btn btn-primary']")
    WebElement btnsubmit;

    @FindBy(id = "forename")
    WebElement txtForename;
    @FindBy(id = "forename-err")
    WebElement errorForeName;

    //@FindBy(xpath = "//h1/text()")
//WebElement jupeterHeader;

    @FindBy(id = "nav-shop")
    WebElement clickshop;

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id = "email-err")
    WebElement ErrortxtEmail;
    @FindBy(id = "message")
    WebElement txtMessage;

    @FindBy(id = "message-err")
    WebElement errortxtMessage;

    @FindBy(id = "//li[@id='product-2']//a[@class='btn btn-success'][normalize-space()='Buy']")
    WebElement buyfrog;

    @FindBy(id = "//a[@href='#/cart']")
    WebElement cart;

    @FindBy(id = "//a[normalize-space()='Check Out']")
    WebElement checkOutBtn;

    @FindBy(id = "//input[@name='quantity']")
    WebElement quantitycheck;
    @FindBy(id = "//li[@id='product-4']//a[@class='btn btn-success'][normalize-space()='Buy']")
    WebElement buybunny;

    @FindBy(id = "//li[@id='product-7']//a[contains(@class,'btn btn-success')][normalize-space()='Buy']")
    WebElement buybear;

    @FindBy(id = "//tbody/tr[2]/td[3]/input[1]")
    WebElement quantitycheckbunny;

    @FindBy(id = "//tbody/tr[3]/td[3]/input[1]")
    WebElement quantitycheckbear;


    public void SetUserName(String uname) {
        txtForename.clear();
        txtForename.sendKeys(uname);

    }

    public void SetEmail(String email) {
        txtEmail.clear();
        txtEmail.sendKeys(email);

    }

    public void SetMessage(String msg) {
        txtMessage.clear();
        txtMessage.sendKeys(msg);

    }

    public void clickSubmit() {
        btnsubmit.click();
    }

    public void clickonShop() {
        clickshop.click();

    }

    public void clickContact() {
        contact.click();
    }

    public void clickStuffedFrogBuyBtn() {
        buyfrog.click();
    }

    public void clickBunnyBuyBtn() {
        buybunny.click();
    }

    public void clickBearBuyBtn() {
        buybear.click();
    }

    public void clickonCart() {
        cart.click();
    }

    public void verifyCheckoutBtn() {
        checkOutBtn.isDisplayed();

    }

    public void quantityCheck(String qnt) {

        quantitycheck.clear();
        quantitycheck.sendKeys();

    }

    public void quantityCheckBunny(String qntBunny) {

        quantitycheckbunny.clear();
        quantitycheckbunny.sendKeys();

    }

    public void quantityCheckBear(String qntBear) {

        quantitycheckbear.clear();
        quantitycheckbear.sendKeys();

    }


}
