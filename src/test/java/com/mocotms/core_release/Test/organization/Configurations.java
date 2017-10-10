package com.mocotms.core_release.Test.organization;

import com.codeborne.selenide.Configuration;
import com.mocotms.core_release.Page.EnterPage;
import org.testng.annotations.Test;

public class Configurations {

    //Установка браузера; Авторизация под администратором:
    @Test(priority = 1)
    public void setBrowser() {
        Configuration.browser = "marionette";
        Configuration.browserSize = "1366x768";
        Configuration.baseUrl = "http://core-release-0.4.mocotms.com";
        //setproperty for geckodriver on server
        System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver/geckodriver.exe");
        EnterPage.loginAdmin();
    }

}
