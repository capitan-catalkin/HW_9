package tests;

import org.junit.jupiter.api.Test;
import page.RegistrationPage;
import utils.RandomDate;

public class RegistrationTestRandom extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    TestDate td = new TestDate();
    @Test
    void fillFormTest(){

        registrationPage.openPage()
                .closeBanner()
                .setFirstName(td.name)
                .setLastName(td.lastName)
                .setEmail(td.email)
                .setGender(td.gender)
                .setUserNumber(td.number)
                .setDateOfBirth(td.day, td.mohth, td.year)
                .setSubjects(td.subject)
                .setHobbies(td.hobbie)
                .setLoadFile(td.picture)
                .setAddress(td.addrees)
                .setState(td.state)
                .setCity(td.city)
                .setSubmit();


        registrationPage.checkResult("Student Name",td.name + " " + td.lastName)
                .checkResult("Student Email", td.email)
                .checkResult("Gender", td.gender)
                .checkResult("Mobile", td.number)
                .checkResult("Date of Birth",td.day + " " + td.mohth+ "," + td.year)
                .checkResult("Subjects", td.subject)
                .checkResult("Hobbies", td.hobbie)
                .checkResult("Picture", td.picture)
                .checkResult("Address", td.addrees)
                .checkResult("State and City",td.state + " " + td.city);
    }


}
