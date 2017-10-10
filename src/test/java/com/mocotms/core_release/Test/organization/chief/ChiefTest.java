package com.mocotms.core_release.Test.organization.chief;

import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mocotms.core_release.Page.ChiefsPage.*;
import static com.mocotms.core_release.Page.UserBulkPage.*;
import static com.mocotms.core_release.Page.UserPage.*;

public class ChiefTest {

    //Создание учетной записи пользователя-руководителя:
    @Test(priority = 4)
    public void createNewUserChief() {
        /*$(organizationMenuItem).shouldBe(visible).hover();
        $(employeeDropdownMenuItem).click();*/
        open(userPageURL);
        $(addNewUserButton).click();
        fillingCreateUserChiefTable();
        $(userProfile).shouldHave(text("Automation Chief"));
    }

    //Добавление роли руководителя:
    @Test(priority = 4, dependsOnMethods = {"createNewUserChief"})
    public void addChief() {
        open(chiefPageURL);
        $(userFindNameField).clear();
        $(userFindNameField).val("Automation User").pressEnter();
        sleep(1000);
        $(addChiefButton).click();
        sleep(1000);
        $(findNameForChiefField).val("Automation Chief").pressEnter();
        $(findForAddChiefResultUserName).shouldBe(text("Automation Chief")).click();
    }

    //Поиск руководителя на странице "Компания/Руководители":
    @Test (priority = 4, dependsOnMethods = {"addChief"})
    public void findAddedChief() {
        $(userFindNameField).clear();
        $(chiefFindNameField).val("Automation Chief").pressEnter();
        $(chiefNameResultRow).shouldBe(text("Automation Chief"));
    }

    //Удаление роли руководителя:
    @Test (priority = 4, dependsOnMethods = {"findAddedChief"})
    public void deleteChief() {
        $(chiefNameResultRow).shouldBe(text("Automation Chief"));
        $(deleteChiefButton).click();
        sleep(1000);
        $(confirmDeleteChiefButton).click();
        $(revomeChiefsFiltersButton).click();
        $(chiefFindNameField).val("Automation Chief").pressEnter();
        $(notFoundAllert).shouldBe(visible);
    }

    //Удаление учетной записи руководителя:
    @Test(priority = 11, alwaysRun = true)
    public void deleteCreatedUserChief() {
        open(bulkUserPage);
        $(deleteAllFiltersButton).click();
        $(fullNameField).val("Chief Automation").pressEnter();
        sleep(2000);
        $(userChiefName).click();
        $(userChiefName).shouldBe(selected);
        $(addToSelectedButton).click();
        selectDeleteDropdownItem();
        $(confirmButton).click();
        $(yesConfirmButton).click();
    }
}