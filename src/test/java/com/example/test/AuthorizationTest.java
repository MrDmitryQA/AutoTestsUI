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

public class AuthorizationtTest extends BaseSauceDemo {

    String userName = "standard_user";
    String password = "secret_sauce";
    LoginSteps loginSteps = new LoginSteps();

    @Tag("Test-002")
    @Link("https://www.saucedemo.com/")
    @Test(description = "Авторизация")
    void testAuth() {
        loginSteps
                .avtorizationSwag(userName, password);
    }

}
