package com.sachin.steps;

import com.sachin.base.BaseClass;
import com.sachin.pages.DashboardScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;

public class LaunchAppSteps extends BaseClass {
    DashboardScreen obj = new DashboardScreen();
    @Given("user have configured the setup")
    public void userHaveConfiguredTheSetup() {
        setup();
    }

    @When("user is launching the app")
    public void userIsLaunching() {
        assertTrue(super.driver.isAppInstalled( "com.monefy.app.lite"));
    }

    @Then("Dashboard gets opened")
    public void appShouldGetLaunch() {
        dashboardLoading();
        assertTrue(super.driver.findElement(obj.getPieGraph()).isDisplayed());
    }

    public void launchAppTest() {
        assertTrue(super.driver.findElement(obj.getPieGraph()).isDisplayed());
    }

    public void dashboardLoading(){
        WebDriverWait wait = new WebDriverWait(this.driver, 10L);
        driver.findElement(By.id("com.monefy.app.lite:id/SliderDragView")).click();
        assertTrue(this.driver.findElement(this.obj.getactionBar()).isDisplayed());
    }

}
