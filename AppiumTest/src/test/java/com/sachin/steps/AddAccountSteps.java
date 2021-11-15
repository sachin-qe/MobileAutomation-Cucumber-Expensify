package com.sachin.steps;

import com.sachin.base.BaseClass;
import com.sachin.pages.DashboardScreen;
import com.sachin.pages.NewAccountScreen;
import com.sachin.pages.SettingsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class AddAccountSteps extends BaseClass {
    DashboardScreen obj = new DashboardScreen();
    SettingsScreen screen = new SettingsScreen();
    NewAccountScreen newScreen = new NewAccountScreen();
    static int count1, count2 = 0;

    @Given("Dashboard screen is open")
    public void dashboardScreenIsOpen() {
        setup();
    }

    @When("user clicks on Settings button")
    public void userClicksOnSettingsButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(visibilityOfElementLocated(DashboardScreen.getInstance().getSettingIcon()));
        driver.findElement(DashboardScreen.getInstance().getSettingIcon()).click();
    }

    @And("user clicks on Accounts option")
    public void userClicksOnAccountsOption() {
        this.driver.findElement(this.screen.getAccountButton()).click();
        count1 = driver.findElements(this.screen.getAccountCount()).size();
        System.out.println("Count before creating new account: " +count1);
    }

    @And("user clicks on Add account")
    public void userClicksOnAddAccount() {
        this.driver.findElement(this.screen.getAccountAdd()).click();
    }

    @And("user types in account fields")
    public void userTypesInAccountFields() {
        this.driver.findElement(this.newScreen.getAccountCategoryName()).sendKeys("NewAccount");
        this.driver.findElement(this.newScreen.getInitialAmount()).sendKeys("150");
        this.driver.findElement(this.newScreen.getAccountType()).click();
        this.driver.findElement(this.newScreen.getSaveAccountButton()).click();
    }

    @Then("a new account type should get created")
    public void aNewAccountTypeShouldGetCreated() {
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(visibilityOfElementLocated(this.newScreen.getSnackBarText()));
        Assert.assertTrue(this.driver.findElement(this.newScreen.getSnackBarText()).isDisplayed());
    }

    @And("the created account type should get listed")
    public void theCreatedAccountTypeShouldGetListed() {
        driver.findElement(DashboardScreen.getInstance().getSettingIcon()).click();
        this.driver.findElement(this.screen.getAccountButton()).click();
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(visibilityOfElementLocated(this.screen.getAccountCount())).getSize();
        count2 = driver.findElements(this.screen.getAccountCount()).size();
        System.out.println("Count after is: " +count2);
    }
}
