package tests;

import utils.RandomData;

public class TestData {
    RandomData date = new RandomData();
    public final String name = date.randomName(),
                        lastName = date.randomLastName(),
                        email = date.randomEmail(),
                        gender = date.randomGender(),
                        number = date.randomNumber(),
                        day = date.randomDay(),
                        month = date.randomMonth(),
                        year = date.randomYear(),
                        subject = date.randomSubject(),
                        hobbie = date.randomHobbie(),
                        picture =  date.randomPicture(),
                        address =  date.randomAddress(),
                        state = date.randomState(),
                        city = date.randomCityByState(state);
}
