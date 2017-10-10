package com.mocotms.core_release.Page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class UserPage {

    public static String userPageURL = "/admin/user.php";

    public static By employeeDropdownMenuItem = byXpath(".//a[contains(@href, 'admin/user.php')]");

    public static By addNewUserButton = byXpath("//*[@id='content']//td[2]/a");

    //Заполнение формы для добавления новой учетной записи сотрудника:
    public static void fillingCreateUserTable() {
        $("#id_username").val("automationuser");
        $("#id_newpassword").val("1qaz@WSX3edc");
        $("#id_lastname").val("Automation");
        $("#id_firstname").val("User");
        $("#id_but_post").click();
        $(byXpath("//*[@id='id_treeposts']//a[contains(text(), 'AutomationPost')]")).click();
        $(byXpath("//*[@id='user-editadvanced']/div[6]/div[3]/div/button[1]")).click();
        $("#id_but_dep").click();
        $(byXpath("//*[@id='department']//a[contains(text(), 'AutomationDepartment')]")).click();
        $(byXpath("//*[@id='user-editadvanced']/div[7]/div[3]/div/button[1]")).click();
        $("#id_email").val("auto@mail.com");
        $("#id_city").val("Kiev");
        $("#id_country").selectOptionByValue("UA");
        $("#id_submitbutton").click();
    }

    //Заполнение формы для добавления новой учетной записи руководителя:
    public static void fillingCreateUserChiefTable() {
        $("#id_username").val("automationuserchief");
        $("#id_newpassword").val("1qaz@WSX3edc");
        $("#id_lastname").val("Automation");
        $("#id_firstname").val("Chief");
        $("#id_but_post").click();
        $(byXpath("//*[@id='id_treeposts']//a[contains(text(), 'AutomationPost')]")).click();
        $(byXpath("//*[@id='user-editadvanced']/div[6]/div[3]/div/button[1]")).click();
        $("#id_but_dep").click();
        $(byXpath("//*[@id='department']//a[contains(text(), 'AutomationDepartment')]")).click();
        $(byXpath("//*[@id='user-editadvanced']/div[7]/div[3]/div/button[1]")).click();
        $("#id_email").val("autochief@mail.com");
        $("#id_city").val("Kiev");
        $("#id_country").selectOptionByValue("UA");
        $("#id_submitbutton").click();
    }

    //Заполнение формы для добавления новой учетной записи модератора:
    public static void fillingCreateUserModeratorTable() {
        $("#id_username").val("automationusermoderator");
        $("#id_newpassword").val("1qaz@WSX3edc");
        $("#id_lastname").val("Automation");
        $("#id_firstname").val("Moderator");
        $("#id_but_post").click();
        $(byXpath("//*[@id='id_treeposts']//a[contains(text(), 'AutoQA')]")).click();
        $(byXpath("//*[@id='user-editadvanced']/div[6]/div[3]/div/button[1]")).click();
        $("#id_but_dep").click();
        $(byXpath("//*[@id='department']//a[contains(text(), 'AutoDep')]")).click();
        $(byXpath("//*[@id='user-editadvanced']/div[7]/div[3]/div/button[1]")).click();
        $("#id_email").val("automoderator@mail.com");
        $("#id_city").val("Kiev");
        $("#id_country").selectOptionByValue("UA");
        $("#id_submitbutton").click();
    }

    public static By filterNameField = byXpath("//input[@name='realname']");

    public static String userResultsTable = "#id_table_results";

    public static String userProfile = "#content";

}
