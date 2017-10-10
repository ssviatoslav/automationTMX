package com.mocotms.core_release.Test.organization.structure;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mocotms.core_release.Page.MainPage.*;
import static com.mocotms.core_release.Page.StructurePage.*;

public class DepartmentTest {

    //Создание подразделения:
    @Test(priority = 2)
    public void createDepartment() {
        /*$(organizationMenuItem).hover();
        $(departmentDropdownMenuItem).click();*/
        open(structurePageURL);
        $(addDepartmentButton).click();
        $(departmentTitleField).val("AutomationDepartment");
        $(saveDepartmentButton).click();
        $(structureTable).shouldHave(visible, text("AutomationDepartment"));
    }

    //Редактирование подразделения:
    @Test(priority = 10, dependsOnMethods = {"createDepartment"})
    public void editDepartment() {
        /*$(organizationMenuItem).hover();
        $(departmentDropdownMenuItem).click();*/
        open(structurePageURL);
        $(addedDepartmentName).click();
        $(editDepartmentButton).click();
        $(departmentTitleField).val("Edited");
        $(saveDepartmentButton).click();
        $(structureTable).shouldHave(visible, text("Edited"));
    }

    //Удаление подразделения:
    @Test(priority = 12)
    public void deleteDepartment() {
        $(organizationMenuItem).shouldBe(visible).hover();
        sleep(1000);
        $(departmentDropdownMenuItem).click();
        $(editedDepartmentName).click();
        $(deleteDepartmentButton).click();
        $(saveDepartmentButton).click();
        $(editedDepartmentName).shouldBe(hidden);
    }
}