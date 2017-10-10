package com.mocotms.core_release.Page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TrainerPage {

    public static String trainerPageURL = "/moco/config/trainer/";

    public static By trainersDropdownMenuItem = byCssSelector("#nav_menu>li>ul>li:nth-child(6) a");

    public static String trainerNameField = "#trainer_id";

    public static By selectUserForTrainer = byCssSelector(".trainer_select[fullname='Automation Moderator']");

    public static String permissionsTrainerTab = "#tab_2";

    public static By findAddedTrainerName = byXpath(".//*[@id='admin-trainers-index']//a[contains(text(), 'Automation Moderator')]");

    public static By savePermissionsTrainerButton = byXpath(".//*[@id='moco-config-trainer-index']/div[6]/div[3]/div/button[1]");

}
