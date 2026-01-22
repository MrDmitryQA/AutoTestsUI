package com.example.saucedemo;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginSteps {

   private static SelenideElement logo =  $x("//div[@class='login_logo']").as("Логотип");
   private static SelenideElement loginWindow =  $x("//input[@placeholder='Username']").as("Окно ввода логина");
   private static SelenideElement passWindow =  $x("//input[@placeholder='Password']").as("Окно ввода пароля");
   private static SelenideElement loginBatton =  $x("//input[@class='submit-button btn_action']").as("Кнопка 'Логин'");

}
