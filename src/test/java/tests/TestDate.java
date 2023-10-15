package tests;

import utils.RandomDate;

public class TestDate {
    RandomDate date = new RandomDate();
    public final String name = date.randomName(),
                        lastName = date.randomLastName(),
                        email = date.randomEmail(),
                        gender = date.randomGender(),
                        number = date.randomNumber(),
                        day = date.randomDay(),
                        mohth = date.randomMohth(),
                        year = date.randomYear(),
                        subject = date.randomSubject(),
                        hobbie = date.randomHobbie(),
                        picture =  date.randomPicture(),
                        addrees =  date.randomAddrees(),
                        state = date.randomState(),
                        city = date.randomCityByState(state);
}
