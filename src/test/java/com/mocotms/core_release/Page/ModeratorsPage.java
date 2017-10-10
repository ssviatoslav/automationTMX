package com.mocotms.core_release.Page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ModeratorsPage {

    public static String moderatorPageURL = "/moco/config/moderators/";

    public static By moderatorsDropdownMenuItem = byXpath(".//*[@class='first']//li[5]/a");

    public static By addModeratorOrTrainerButton = byXpath("//*[@class='borderless']//td[2]");

    public static String moderatorNameField = "#moderator_id";

    public static By selectUserForModerator = byCssSelector(".moderator_select[fullname='Automation Moderator']");

    public static String permissionsTab = "#tab_3";

    //Добавление разрешений на Создание/Изменение/Удаление программ обучения:
    public static void addProgramPermissions() {
        $(byXpath("//*[@id='div_permissions']/label[8]/input"));
        $(byXpath("//*[@id='div_permissions']/label[9]/input"));
        $(byXpath("//*[@id='div_permissions']/label[10]/input"));
    }

    public static By savePermissionsModeratorButton = byXpath(".//*[@id='moco-config-moderators-index']/div[5]/div[3]/div/button[1]");

    public static By findAddedModeratorName = byXpath("//*[@class='moderator-change-link'][contains(text(), 'Automation Moderator')]");

}
