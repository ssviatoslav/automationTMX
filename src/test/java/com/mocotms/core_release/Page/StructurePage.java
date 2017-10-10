package com.mocotms.core_release.Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class StructurePage {

    public static String structurePageURL = "/moco/config/structure/";

    public static By departmentDropdownMenuItem = byXpath(".//a[contains(@href, 'moco/config/structure')]");

    public static SelenideElement addDepartmentButton = $(byXpath(".//*[@id='departmentadd']/a"));

    public static SelenideElement departmentTitleField = $("#departmenttitle");

    public static SelenideElement saveDepartmentButton = $(byXpath(".//*[@id='moco-config-structure-index']/div[8]/div[3]/div/button[1]"));

    public static SelenideElement structureTable = $(byXpath(".//*[@id='structure']"));

    public static SelenideElement addedDepartmentName = $(byXpath("//*[@id='structure']//a[contains(text(), 'AutomationDepartment')]"));

    public static SelenideElement editDepartmentButton = $(byXpath(".//*[@id='departmentedit']/a"));

    public static SelenideElement editedDepartmentName = $(byXpath("//*[@id='structure']//a[contains(text(), 'Edited')]"));

    public static SelenideElement deleteDepartmentButton = $(byXpath("//*[@id='departmentdel']/a"));
}
