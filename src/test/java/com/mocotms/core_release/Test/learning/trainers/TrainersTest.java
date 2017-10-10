package com.mocotms.core_release.Test.learning.trainers;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.mocotms.core_release.Page.ModeratorsPage.*;
import static com.mocotms.core_release.Page.TrainerPage.*;

public class TrainersTest {

    //Добавление роли тренер:
    @Test (priority = 6)
    public void addTrainer() {
        /*$(learningMenuItem).hover();
        $(trainersDropdownMenuItem).click();*/
        open(trainerPageURL);
        $(addModeratorOrTrainerButton).click();
        $(trainerNameField).val("Automation Moderator").pressEnter();
        $(selectUserForTrainer).click();
        $(savePermissionsTrainerButton).click();
        //Проверка налиичия добавленого модератора
        $(findAddedTrainerName).shouldBe(text("Automation Moderator"));
    }
}
