package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FullRegistration extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    void fullRegistraion() {
        registrationPage.openPage();
        registrationPage.setFirstName("Alex");
        registrationPage.setLastName("Smith");
        registrationPage.setUserEmail("user@mail.ru");
        registrationPage.setGenderWrapper("Male");
        registrationPage.setUserNumber("79268130933");

    }

}
