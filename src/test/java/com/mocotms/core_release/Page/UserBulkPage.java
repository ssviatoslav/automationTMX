package com.mocotms.core_release.Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class UserBulkPage {

    public static String bulkUserPage = "/admin/user/user_bulk.php";

    public static String fullNameField = "#id_realname";

    public static By userName = byXpath("//*[@id='id_ausers']//option[contains(text(), 'User Automation')]");

    public static By userChiefName = byXpath("//*[@id='id_ausers']//option[contains(text(), 'Chief Automation')]");

    public static By userModeratorName = byXpath("//*[@id='id_ausers']//option[contains(text(), 'Moderator Automation')]");

    public static String addToSelectedButton = "#id_addsel";

    public static void selectDeleteDropdownItem() {
        $("#id_action").selectOptionByValue("3");
    }

    public static String confirmButton = "#id_doaction";

    public static By yesConfirmButton = byXpath("//*[@id='middle-column']//form[@action='user_bulk_delete.php']//input[@type='submit']");

    public static String deleteAllFiltersButton = "#id_removeall";
}
