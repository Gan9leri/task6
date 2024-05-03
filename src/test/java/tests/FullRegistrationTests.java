package tests;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class FullRegistrationTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fullRegistration() {
        registrationPage.openPage()
                        .setFirstName("Alex")
                        .setLastName("Smith")
                        .setUserEmail("user@mail.ru")
                        .setGender("Male")
                        .setUserNumber("79268130933")
                        .setDateOfBirth("8", "November", "1992")
                        .setSubjects("Math")
                        .setHobbies("Sports")
                        .setHobbies("Reading")
                        .setHobbies("Music")
                        .uploadPicture("cat.PNG")
                        .setCurrentAddress("USA")
                        .setState("NCR")
                        .setCity("Delhi")
                        .submitClick()
                        .checkResult("Student Name", "Alex Smith")
                        .checkResult("Student Email", "user@mail.ru")
                        .checkResult("Gender", "Male")
                        .checkResult("Mobile", "7926813093")
                        .checkResult("Date of Birth", "08 November,1992")
                        .checkResult("Subjects", "Maths")
                        .checkResult("Hobbies", "Sports, Reading, Music")
                        .checkResult("Picture", "cat.PNG")
                        .checkResult("Address", "USA")
                        .checkResult("State and City", "NCR Delhi");
    }

    @Test
    void partialRegistration() {
        registrationPage.openPage()
                        .setFirstName("Alex")
                        .setLastName("Smith")
                        .setGender("Male")
                        .setUserNumber("79268130933")
                        .submitClick()
                        .checkResult("Student Name", "Alex Smith")
                        .checkResult("Gender", "Male")
                        .checkResult("Mobile", "7926813093");
    }

    @Test
    void incorrectRegistration() {
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Smith")
                .setGender("Male")
                .submitClick()
                .checkFormControl();
    }
}