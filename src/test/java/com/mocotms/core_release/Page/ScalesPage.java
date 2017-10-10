package com.mocotms.core_release.Page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ScalesPage {

    public static String scalesPageURL = "/moco/config/scales/";

    public static By scalesDropdownMenuItem = byCssSelector("#nav_menu>li>ul>li:nth-child(9) a");

    public static String addScaleIntervalButton = "#add_scale_element_add";

    public static void addScale() {
        $(byXpath("//td[@colspan='5']/input")).val("AutoScale");
        $(byXpath(".//input[@name='from_1']")).val("0");
        $(byXpath(".//input[@name='include_from_1']"));
        $(byXpath(".//input[@name='to_1']")).val("50");
        $(byXpath(".//input[@name='include_to_1']"));
        $(byXpath(".//input[@name='result_1']")).val("Плохо!");
        $(byXpath(".//input[@name='from_2']")).val("50");
        $(byXpath(".//input[@name='to_2']")).val("100");
        $(byXpath(".//input[@name='include_to_2']"));
        $(byXpath(".//input[@name='result_2']")).val("Отлично!");
        $(byXpath(".//*[@id='frmAdd']/input[3]"));
    }
}
