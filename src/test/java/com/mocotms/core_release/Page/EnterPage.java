package com.mocotms.core_release.Page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterPage {

    public static String enterPageURL = "/login/enter.php";

    public static String enterButton = "#id_enter";

    public static String userNameField = "#username";

    public static String passwordField = "#password";

    public static String welcomeBlock = "#header_block_hello_logininfo";

    //Авторизация администратора:
    public static void loginAdmin() {
        open(enterPageURL);
        $(enterButton).click();
        $(userNameField).val("admin");
        $(passwordField).val("1qaz@WSX3edc").pressEnter();
        $(welcomeBlock).waitUntil(visible, 20000);
    }
}

