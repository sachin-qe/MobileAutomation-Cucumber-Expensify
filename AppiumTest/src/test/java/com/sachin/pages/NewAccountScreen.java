package com.sachin.pages;

import org.openqa.selenium.By;

public class NewAccountScreen {
    By accountCategoryName = By.id("com.monefy.app.lite:id/editTextCategoryName");
    By initialAmount = By.id("com.monefy.app.lite:id/initialAmount");
    By accountType = By.xpath("//android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView");
    By saveAccountButton = By.id("com.monefy.app.lite:id/save");
    By snackBarText = By.id("com.monefy.app.lite:id/snackbar_text");

    public By getAccountCategoryName() {
        return this.accountCategoryName;
    }

    public By getInitialAmount() {
        return this.initialAmount;
    }

    public By getAccountType() {
        return this.accountType;
    }

    public By getSaveAccountButton() {
        return this.saveAccountButton;
    }

    public By getSnackBarText() {
        return this.snackBarText;
    }
}
