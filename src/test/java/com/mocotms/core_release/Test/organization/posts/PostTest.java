package com.mocotms.core_release.Test.organization.posts;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.mocotms.core_release.Page.MainPage.*;
import static com.mocotms.core_release.Page.PostsPage.*;

public class PostTest {

    //Создание должности:
    @Test(priority = 2)
    public void createPost() {
        /*$(organizationMenuItem).hover();
        $(postDropdownMenuItem).click();*/
        open(postPageURL);
        $(addPostButton).click();
        $(addPostTitleField).val("AutomationPost");
        $(saveAddPostButton).click();
        $(postTable).shouldHave(text("AutomationPost"));
    }

    //Редактирование должности:
    @Test(priority = 10, dependsOnMethods = {"createPost"})
    public void editPost() {
        /*$(organizationMenuItem).hover();
        $(postDropdownMenuItem).click();*/
        open(postPageURL);
        $(addedPostName).click();
        $(editPostButton).click();
        $(editPostTitleField).val("EditedPost");
        $(saveEditPostButton).click();
        $(postTable).shouldHave(visible, text("EditedPost"));
    }

    //Удаление должности:
    @Test(priority = 12)
    public void deletePost() {
        $(organizationMenuItem).shouldBe(visible).hover();
        sleep(1000);
        $(postDropdownMenuItem).click();
        $(editedPostName).click();
        $(deletePostButton).click();
        $(deleteConfirmPostButton).click();
        $(editedPostName).shouldBe(hidden);
    }
}
