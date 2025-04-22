package stepDefinition;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static Actions.Action.*;
import static Util.DataKeys.PASSWORD;
import static Util.DataKeys.USERNAME;
import static Util.HightLightElement.hightLightElement;
import static Util.ScenarioContext.getData;
import static Util.ScenarioContext.saveData;
import static Util.WaitUntil.waitUntil;

public class Login extends AbstractStepDef {
    @Given("user insert username")
    public void userInsertUsername() throws InterruptedException {
        navigate(loginPageUrl, driver);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), "Admin");
        saveData(USERNAME, "Admin");
    }

    @And("user insert password")
    public void userInsertPassword() throws InterruptedException {
        sendKey(loginPage.getPasswordField(), "admin123");
        isDisplayed(loginPage.getLoginLogo());
//        click(loginPage.getFbLink(),3);
//        Thread.sleep(3000);
//        sendKey(loginPage.getFbmail(),"marinapuing@gmail.com");
        saveData(PASSWORD, "admin123");
    }

    @When("user clicks on Login button")
    public void userClickOnLoginButton() {
        click(loginPage.getSublitButton(), 3);
    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomepage() {
        waitUntil(3);
        hightLightElement(homePage.getDashboardSign());
        Assert.assertEquals("Dashboard", homePage.getDashboardSign().getText());
    }

    @And("user clicks on logOut button")
    public void userClickOnLogOutButton() {
        click(homePage.getUserMeniu(), 1);
        hightLightElement(homePage.getLogOutButton());
        waitUntil(5);
        click(homePage.getLogOutButton(), 1);
    }

    @And("insert username")
    public void insertUsername() {
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), getData(USERNAME).toString());
    }

    @And("insert password")
    public void insertPassword() {
        sendKey(loginPage.getPasswordField(), getData(PASSWORD).toString());
        isDisplayed(loginPage.getLoginLogo());
//
    }
}

