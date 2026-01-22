package com.example.test;

import com.example.base.BaseSauceDemo;
import com.example.saucedemo.LoginSteps;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;


@Feature("Swag Labs") // Бизнес сервис
@Owner("Барченко Д.О.") // Владелец

public class AuthorizationPageTest extends BaseSauceDemo {

    String userName = "standard_user";
    String password = "secret_sauce";
    String logoText = "Swag Labs";
    LoginSteps loginSteps = new LoginSteps();


    @Tag("Test-001")
    @Link("https://www.saucedemo.com/")
    @Test(description = "Проверка отображения элементов на странице")
    void testAuth() {
        loginSteps
                .checkLogo(logoText)
                .checkUsernames()
                .checkPassword()
                .checkTextUsername()
                .checkTextPassword()
                .checkButtonLogin();
    }
}
