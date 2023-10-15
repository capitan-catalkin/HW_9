package utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RandomData {
    public static Faker faker = new Faker(new Locale("en"));

    public String randomName() {
        return faker.name().firstName();
    }

    public String randomLastName() {
        return faker.name().lastName();
    }

    public String randomEmail() {
        return faker.internet().emailAddress();
    }

    public String randomGender() {
        return randomGenders();
    }

    public String randomNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String randomDay() {
        int day = faker.random().nextInt(1, 28);
        return day < 10 ? "0" + day : String.valueOf(day);
    }

    public String randomMohth() {
        return randomMohths();
    }

    public String randomYear() {
        return String.valueOf(faker.number().numberBetween(1900, 2100));
    }

    public String randomSubject() {
        return randomSubjects();
    }

    public String randomHobbie() {
        return randomHobbies();
    }

    public String randomPicture() {
        return randomPictures();
    }

    public String randomAddrees() {
        return faker.address().streetAddress();
    }

    public String randomState() {
        return faker.options().option(statesAndCities.keySet().toArray(new String[0]));
    }

    public String randomCityByState(String state) {
        return faker.options().option(statesAndCities.get(state));
    }


    public static String randomGenders() {
        String[] gender = {"Male", "Female", "Other"};
        return faker.options().option(gender);
    }

    public static String randomMohths() {
        String[] month = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(month);

    }

    public static String randomSubjects() {
        String[] subjects = {"Maths", "Chemistry", "Computer Science", "Economics"};
        return faker.options().option(subjects);
    }

    public static String randomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public String randomPictures() {
        String[] pictures = {"cat1.jpg", "car.jpg"};
        return faker.options().option(pictures);
    }

    private final Map<String, String[]> statesAndCities = new HashMap<>();

    {
        statesAndCities.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        statesAndCities.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        statesAndCities.put("Haryana", new String[]{"Karnal", "Panipat"});
        statesAndCities.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
    }


}
