package com.mocotms.core_release.Page;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;

public class ChiefsPage {

    public static String chiefPageURL = "/moco/config/chiefs/";

    public static By chiefDropdownMenuItem = byCssSelector(".first ul li:nth-child(4) a");

    public static By userFindNameField = byXpath("//*[@id='filter-chiefs']//input[@name='realname']");

    public static By userNameResultTable = byXpath("//*[@id='_1_1']/a[contains(text(), 'Automation User')]");

    public static By addChiefButton = byXpath(".//*[@id='_1_9']/img");

    public static By findNameForChiefField = byXpath(".//*[@id='realname2']");

    public static By findForAddChiefResultUserName = byXpath("//*[@id='_1_2']/a");

    public static By chiefFindNameField = byXpath("//*[@id='filter-chiefs']//input[@name='chief_realname']");

    public static By chiefNameResultRow = byXpath("//*[@id='_1_5']/a");

    public static By deleteChiefButton = byXpath("//*[@id='_1_10']/a/img");

    public static By confirmDeleteChiefButton = byXpath("//*[@id='moco-config-chiefs-index']/div[12]/div[3]/div/button[1]");

    public static String revomeChiefsFiltersButton = "#id_removeall";

    public static By notFoundAllert = byXpath(".//*[@class='notifyproblem notify']");
}
