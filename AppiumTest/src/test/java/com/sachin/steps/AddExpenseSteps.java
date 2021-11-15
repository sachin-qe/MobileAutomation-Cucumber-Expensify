package com.sachin.steps;

import com.sachin.base.BaseClass;
import com.sachin.pages.DashboardScreen;
import com.sachin.pages.ExpenseScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddExpenseSteps extends BaseClass {
    DashboardScreen obj = new DashboardScreen();
    ExpenseScreen exp = new ExpenseScreen();

    @Given("user is at Dashboard screen")
    public void userIsAtDashboardScreen() {
        setup();
    }

    @When("user clicks on Expense button")
    public void userClicksOnExpenseButton() {
        driver.findElement(DashboardScreen.getInstance().getExpenseButton()).click();
    }

    @And("user types in necessary fields")
    public void userTypesInNecessaryFields() {
        WebDriverWait wait = new WebDriverWait(this.driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.exp.getamountText()));

        this.driver.findElement(this.exp.getamountText()).click();
        this.driver.findElement(this.exp.getamountText()).click();
        this.driver.findElement(this.exp.getButtonKey2()).click();
        this.driver.findElement(this.exp.getButtonKey1()).click();
        this.driver.findElement(this.exp.getButtonKey2()).click();
        this.driver.findElement(this.exp.getButtonKeyDecimal()).click();
        this.driver.findElement(this.exp.getButtonKey1()).click();
        this.driver.findElement(this.exp.getButtonKey2()).click();
        this.driver.findElement(this.exp.getnoteText()).click();
        this.driver.findElement(this.exp.getnoteText()).sendKeys("test");

        this.driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.exp.getchooseCategory()));
        this.driver.findElement(this.exp.getchooseCategory()).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(this.exp.getCategoryName()));
        this.driver.findElement(this.exp.getCategoryName()).click();
    }

    @Then("an expense entry should get created")
    public void anExpenseEntryShouldGetCreated() {
        Assert.assertTrue(this.driver.findElement(this.exp.getsnackBarText()).isDisplayed());
    }

    @And("the balance amount should get updated")
    public void theBalanceAmountShouldGetUpdated() {
        WebDriverWait wait = new WebDriverWait(this.driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.obj.getBalanceAmount()));

        System.out.println(this.driver.findElement(this.obj.getBalanceAmount()).getAttribute("text"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.obj.getBalanceAmount()));

        wait.until(ExpectedConditions.visibilityOfElementLocated(this.obj.getBalanceAmount())).getAttribute("text");
        Assert.assertTrue(this.driver.findElement(this.obj.getBalanceAmount()).getAttribute("text").contains("$212.12"));
    }

}
