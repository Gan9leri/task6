package pages;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement userEmailInput = $("#userEmail");
    private SelenideElement genderWrapperInput = $("#genterWrapper");
    private SelenideElement userNumberInput = $("#userNumber");
    /*private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement firstNameInput = $("#firstName");*/


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value){
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGenderWrapper(String value){
        genderWrapperInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String value){
        userNumberInput.setValue(value);
        return this;
    }
}
