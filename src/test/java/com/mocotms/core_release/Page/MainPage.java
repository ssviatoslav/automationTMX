package com.mocotms.core_release.Page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;

public class MainPage {

    public static By organizationMenuItem = byCssSelector("#nav_menu li[class='first']");

    public static By learningMenuItem = byCssSelector("#nav_menu li:nth-child(2)");

}
