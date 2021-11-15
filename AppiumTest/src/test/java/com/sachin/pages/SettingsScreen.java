package com.sachin.pages;

import org.openqa.selenium.By;

public class SettingsScreen {
    By accountButton = By.id("com.monefy.app.lite:id/accounts_button");
    By accountCount = By.xpath("//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    By accountAdd = By.xpath("//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.LinearLayout[1]/android.widget.TextView");

    public By getAccountButton() {
        return accountButton;
    }

    public By getAccountCount() {
        return accountCount;
    }

    public By getAccountAdd() {
        return accountAdd;
    }
}
