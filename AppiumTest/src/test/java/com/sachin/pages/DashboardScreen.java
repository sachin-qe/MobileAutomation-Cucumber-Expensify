package com.sachin.pages;

import org.openqa.selenium.By;

public class DashboardScreen {
    By dashboardId = By.id("com.monefy.app.lite:id/toolbar");
    By actionBar = By.id("com.monefy.app.lite:id/action_bar_root");

    By pieGraph = By.id("com.monefy.app.lite:id/piegraph");
    By expenseButton = By.id("com.monefy.app.lite:id/expense_button");
    By incomeButton = By.id("com.monefy.app.lite:id/income_button");
    By sliderDragView = By.id("com.monefy.app.lite:id/SliderDragView");
    By transferTip = By.id("com.monefy.app.lite:id/pts_main");
    By msgTxtView = By.id("com.monefy.app.lite:id/messageTextView");
    By balanceAmount = By.id("com.monefy.app.lite:id/balance_amount");
    By settingIcon = By.id("com.monefy.app.lite:id/overflow");

    public By getSettingIcon() {
        return this.settingIcon;
    }

    public By getBalanceAmount() {
        return this.balanceAmount;
    }

    public By getDashboardId() {
        return this.dashboardId;
    }

    public By getactionBar(){
        return this.actionBar;
    }

    public By getPieGraph() {
        return this.pieGraph;
    }

    public By getExpenseButton() {
        return this.expenseButton;
    }

    public By getIncomeButton() {
        return this.incomeButton;
    }

    public By getsliderDragView() {
        return this.incomeButton;
    }

    public static DashboardScreen getInstance() {
        return new DashboardScreen();
    }

}
