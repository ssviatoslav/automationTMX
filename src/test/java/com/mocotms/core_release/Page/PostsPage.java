package com.mocotms.core_release.Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PostsPage {

    public static String postPageURL = "/moco/config/posts/";

    public static By postDropdownMenuItem = byXpath(".//a[contains(@href, 'moco/config/posts')]");

    public static String addPostButton = "#id_add_post";

    public static String addPostTitleField = "#id_add_title";

    public static String editPostTitleField = "#id_title";

    public static By saveAddPostButton = byXpath(".//*[@id='moco-config-posts-index']/div[7]/div[3]/div/button[1]");

    public static By saveEditPostButton = byXpath("//*[@id='moco-config-posts-index']/div[8]/div[3]/div/button[1]");

    public static By postTable = byXpath(".//*[@id='id_treeposts']");

    public static By addedPostName = byXpath(".//*[@id='id_treeposts']//a[contains(text(), 'AutomationPost')]");

    public static String editPostButton = "#id_edit_post";

    public static SelenideElement editedPostName = $(byXpath("//*[@id='id_treeposts']//a[contains(text(), 'EditedPost')]"));

    public static String deletePostButton = "#id_del_post";

    public static By deleteConfirmPostButton = (byXpath("//*[@id='id_div_del_post']/..//div[@class='ui-dialog-buttonset']/button[1]"));

}
