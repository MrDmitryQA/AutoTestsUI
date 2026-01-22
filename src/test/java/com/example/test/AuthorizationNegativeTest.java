package com.example.test;

import com.example.base.BaseSauceDemo;
import com.example.saucedemo.LoginSteps;
import com.example.saucedemo.SwagLabsPageSteps;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Feature("Swag Labs") // Бизнес сервис
@Owner("Барченко Д.О.") // Владелец

public class AuthorizationTestNegative extends BaseSauceDemo  {

    String userName = "Java_is_AWESOME";
    String password = "Selenide_is_COOL";
    LoginSteps loginSteps = new LoginSteps();
    SwagLabsPageSteps swagLabsPageElements = new SwagLabsPageSteps();

    @Tag("Test-002")
    @Link("https://www.saucedemo.com/")
    @Test(description = "Проверка процедуры Авторизации")
    void testAuthNot() {
        loginSteps
                .avtorizationSwag(userName, password);
        swagLabsPageElements
                .checkLogoSwagLabs();
        sleep(3000);
    }
}

