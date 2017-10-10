package com.mocotms.core_release.Test.organization.user;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.mocotms.core_release.Page.MainPage.*;

import org.testng.annotations.*;

import static com.mocotms.core_release.Page.UserBulkPage.*;
import static com.mocotms.core_release.Page.UserPage.*;

public class EmployeeTest {

    //Создание учетной записи пользователя вручную:
    @Test(priority = 3)
    public void createNewUser() {
        $(organizationMenuItem).shouldBe(visible).hover();
        $(employeeDropdownMenuItem).click();
        $(addNewUserButton).click();
        fillingCreateUserTable();
        $(userProfile).shouldHave(text("Automation User"));
    }

    //Поиск созданного пользователя на странице "Компания/Сотрудники":
    @Test(priority = 3, dependsOnMethods = "createNewUser")
    public void findCreatedUserName() {
        /*$(organizationMenuItem).hover();
        $(employeeDropdownMenuItem).click();*/
        open(userPageURL);
        $(filterNameField).val("Automation User").pressEnter();
        $(userResultsTable).shouldHave(text("Automation User"));
    }

    //Удаление учетной записи пользователя:
    @Test(priority = 11, alwaysRun = true)
    public void deleteCreatedUser() {
        open(bulkUserPage);
        $(deleteAllFiltersButton).click();
        $(fullNameField).val("User Automation").pressEnter();
        sleep(2000);
        $(userName).click();
        $(userName).shouldBe(selected);
        $(addToSelectedButton).click();
        selectDeleteDropdownItem();
        $(confirmButton).click();
        $(yesConfirmButton).click();
    }
}
