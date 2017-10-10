package com.mocotms.core_release.Test.organization.moderator;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mocotms.core_release.Page.ModeratorsPage.*;
import static com.mocotms.core_release.Page.UserBulkPage.*;
import static com.mocotms.core_release.Page.UserPage.*;

public class ModeratorTest {

    //Создание учетной записи пользователя-модератора:
    @Test(priority = 5)
    public void createNewUserModerator() {
        /*$(organizationMenuItem).shouldBe(visible).hover();
        $(employeeDropdownMenuItem).click();*/
        open(userPageURL);
        $(addNewUserButton).click();
        fillingCreateUserModeratorTable();
        $(userProfile).shouldHave(text("Automation Moderator"));
    }

    //Добавление роли модератор:
    @Test (priority = 5, dependsOnMethods = {"createNewUserModerator"})
    public void addModerator() {
        /*$(organizationMenuItem).hover();
        $(moderatorsDropdownMenuItem).click();*/
        open(moderatorPageURL);
        $(addModeratorOrTrainerButton).click();
        $(moderatorNameField).val("Automation Moderator").pressEnter();
        $(selectUserForModerator).click();
        $(savePermissionsModeratorButton).click();
        //Проверка налиичия добавленого модератора
        $(findAddedModeratorName).shouldBe(text("Automation Moderator"));
    }

    //Удаление учетной записи пользователя-модератора:
    @Test (priority = 11, alwaysRun = true)
    public void deleteCreatedUserModerator() {
        open(bulkUserPage);
        $(deleteAllFiltersButton).click();
        $(fullNameField).val("Moderator Automation").pressEnter();
        sleep(2000);
        $(userModeratorName).click();
        $(userModeratorName).shouldBe(selected);
        $(addToSelectedButton).click();
        selectDeleteDropdownItem();
        $(confirmButton).click();
        $(yesConfirmButton).click();
    }
}
