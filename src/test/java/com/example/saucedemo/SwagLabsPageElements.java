package com.example.saucedemo;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class SwagLabsPage {

    public static SelenideElement logo =  $x("//div[@class='app_logo']").as("Логотип");

}
