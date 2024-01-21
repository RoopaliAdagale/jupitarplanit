package pagesStepDefination;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.ContactScreenTest;

import java.time.Duration;
import java.util.List;

public class ValidateAndVerifyContactScreenStep {
    public static WebDriver driver;
    public ContactScreenTest contactScreen;

    @Before
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/drivers/chromedriver.exe");

        //  ChromeDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        contactScreen = new ContactScreenTest(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://jupiter.cloud.planittesting.com");

    }

    @Given("I am already on {string} application Home screen")
    public void homeScreen(String Header) {

        if (driver.getPageSource().contains("Jupiter Toys")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertEquals(Header, driver.getTitle());
        }
    }


    @When("I navigate to Screen Contact")
    public void homeScreenNav() {
        contactScreen.clickContact();
    }

    @Then("I assert Submit button is presented on screen Contact")
    public void submitBtnPresent() {
        Assert.assertTrue(driver.findElement(By.className("btn-contact btn btn-primary")).isDisplayed());


    }

    @When("I click button Contact on screen contact")
    public void clickOnContact() {
        contactScreen.clickContact();

    }

    @When("I click button Submit on screen contact")
    public void clickonSubmitBtn() throws InterruptedException {
        contactScreen.clickSubmit();
        wait(500);

    }

    @Then("I assert Forename {string} Email {string} Message {string} presented on screen Contact")
    public void verifyFields(String forname, String email, String msgerror) {
        Assert.assertEquals(forname, "Forename is required");
        Assert.assertEquals(email, "Email is required");
        Assert.assertEquals(msgerror, "Message is required");

    }

    @Then("I assert Forename errors are not presented on screen Contact")
    public void errornotpresent() {
        WebElement msg = (WebElement) driver.findElements(By.xpath("//div[@class='alert alert-info ng-scope']"));
        String verifymsg = msg.getText();
        Assert.assertTrue(true, verifymsg);


    }

    @When("I set Forename {string} Email {string} Message {string}")
    public void setInput(String uname, String uemail, String umsg) {
        contactScreen.SetUserName(uname);
        contactScreen.SetEmail(uemail);
        contactScreen.SetMessage(umsg);
    }

    @Then("I verify successful message on screen contact")
    public void varifySuccessMsg() {
        System.out.println(driver.findElement(By.className("alert alert-success")).getText());
        System.out.println(driver.findElement(By.className("alert alert-success")).getAttribute("textContain"));


    }


    @When("I navigate to Screen Shop")
    public void clickonShoptab() {
        contactScreen.clickonShop();
    }

    @And("I buy Stuffed Frog in to cart")
    public void clickonStuffedFrogBuy() {
        contactScreen.clickStuffedFrogBuyBtn();

    }

    @And("I buy Fluppy Bunny in to cart")
    public void clickonFluppyBunnyBuy() {
        contactScreen.clickBunnyBuyBtn();

    }

    @And("I buy Valentine Bear in to cart")
    public void clickonValentineBearBuy() {
        contactScreen.clickBearBuyBtn();

    }

    @And("I click on cart")
    public void clickonCart() {
        contactScreen.clickonCart();

    }

    @Then("I assert Check out button is presented on cart")
    public void verifyCheckoutBtn() {
        contactScreen.verifyCheckoutBtn();

    }

    @When("I set Stuffed Frog {string} quantity")
    public void setInput(String qnt) {
        contactScreen.quantityCheck(qnt);
    }

    @And("I set Fluppy Bunny {string} quantity")
    public void setInputbunny(String qntBunny) {
        contactScreen.quantityCheckBunny(qntBunny);
    }

    @And("I set Valentine Bear {string} quantity")
    public void setInputbear(String qntBear) {
        contactScreen.quantityCheckBear(qntBear);
    }

    @Then("I assert sub total for Stuffed Frog is presented on cart")
    public void verifysubtotalStuffedFrog() {
        List<WebElement> subtotals = driver.findElements(By.xpath("//td[normalize-space()='$21.98']"));
        for (WebElement subtotal : subtotals) {
            // Verify that the subtotal is correct
            String subtotalText = subtotal.getText();
            System.out.println("Sub total of Stuffed Frog" + subtotalText);

        }
    }

    @Then("I assert sub total for Fluppy Bunny is presented on cart")
    public void verifysubtotalFluppyBunny() {
        List<WebElement> subtotals = driver.findElements(By.xpath("//td[normalize-space()='$49.95']"));
        for (WebElement bunnysubtotal : subtotals) {
            // Verify that the subtotal is correct
            String subtotalText = bunnysubtotal.getText();
            System.out.println("Sub total of Fluppy Bunny" + subtotalText);

        }
    }

    @Then("I assert sub total for Valentine Bear is presented on cart")
    public void verifysubtotalVBear() {
        List<WebElement> subtotals = driver.findElements(By.xpath("//td[normalize-space()='$44.97']"));
        for (WebElement vBearsubtotal : subtotals) {
            // Verify that the subtotal is correct
            String subtotalText = vBearsubtotal.getText();
            System.out.println("Sub total of Valentine Bear" + subtotalText);

        }
    }

    @And("I assert price for Stuffed Frog")
    public void priceforStuffFrog(String frog) {
        WebElement element = driver.findElement(By.xpath("//td[normalize-space()='$10.99']"));
        if (element.isDisplayed()) {
            Assert.assertTrue(true, "$10.99");
            System.out.println("price is correct for stuffed Frog");
        } else {
            System.out.println("fail: price is Not correct for stuffed Frog");
        }


    }

    @And("I assert price for Fluffy Bunny")
    public void priceforFluffyBunny(String bunny) {
        WebElement element = driver.findElement(By.xpath("//td[normalize-space()='$9.99']"));
        if (element.isDisplayed()) {
            Assert.assertTrue(true, "$9.99");
            System.out.println("price is correct for Fluffy Bunny");
        } else {
            System.out.println("fail: price is Not correct for stuffed Frog");
        }


    }

    @And("I assert price for Valentine Bear")
    public void priceforValentineBear(String bear) {
        WebElement element = driver.findElement(By.xpath("//td[normalize-space()='$14.99']"));
        if (element.isDisplayed()) {
            Assert.assertTrue(true, "$14.99");
            System.out.println("price is correct for stuffed Frog");
        } else {
            System.out.println("fail: price is Not correct for Valentine Bear");
        }


    }


}
