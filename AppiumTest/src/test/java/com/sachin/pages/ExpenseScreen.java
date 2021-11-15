package com.sachin.pages;

import org.openqa.selenium.By;

public class ExpenseScreen {
    By amountTextBox = By.id("com.monefy.app.lite:id/button_amount_container");
    By amountText = By.id("com.monefy.app.lite:id/amount_text");
    By noteText = By.id("com.monefy.app.lite:id/textViewNote");
    By buttonKey1 = By.id("com.monefy.app.lite:id/buttonKeyboard1");
    By buttonKey2 = By.id("com.monefy.app.lite:id/buttonKeyboard2");
    By buttonKey3 = By.id("com.monefy.app.lite:id/buttonKeyboard1");
    By buttonKeyDecimal = By.id("com.monefy.app.lite:id/buttonKeyboardDot");
    By buttonKey5 = By.id("com.monefy.app.lite:id/buttonKeyboard5");
    By layoutRoot = By.id("com.monefy.app.lite:id/relativeLayoutRoot");
    By chooseCategory = By.id("com.monefy.app.lite:id/keyboard_action_button");
    By categoryName = By.xpath("//android.widget.GridView/android.widget.FrameLayout[7]/android.widget.LinearLayout/android.widget.ImageView");

    By snackBarText = By.id("com.monefy.app.lite:id/snackbar_text");
//    By snackBarAction = By.id("com.monefy.app.lite:id/snackbar_action");

    By expenseAmount = By.id("com.monefy.app.lite:id/expense_amount_text");

    public By getExpenseAmount(){
        return this.expenseAmount;
    }

    public By getsnackBarText() {
        return this.snackBarText;
    }

    public By getCategoryName() {
        return this.categoryName;
    }

    public By getchooseCategory() {
        return this.chooseCategory;
    }

    public By getlayoutRoot() {
        return this.layoutRoot;
    }
    public By getamountTextBox() {
        return this.amountTextBox;
    }

    public By getamountText() {
        return this.amountText;
    }

    public By getnoteText() {
        return this.noteText;
    }

    public By getButtonKey1() {
        return this.buttonKey1;
    }

    public By getButtonKey2() {
        return this.buttonKey2;
    }

    public By getButtonKey3() {
        return this.buttonKey3;
    }

    public By getButtonKeyDecimal() {
        return this.buttonKeyDecimal;
    }

    public By getButtonKey5() {
        return this.buttonKey5;
    }
}
