package models;

import com.github.javafaker.Faker;

public class AccountFactory {
   static Faker faker;
    public static Account get() {
        faker = new Faker();
        return new Account(
                faker.name().fullName(),
                faker.phoneNumber().cellPhone(),
                faker.phoneNumber().cellPhone(),
                faker.internet().domainName(),
                "15",
                "1500000",
                faker.address().city(),
                faker.address().state(),
                faker.address().city(),
                faker.address().state(),
                faker.address().zipCode(),
                faker.address().country(),
                faker.address().zipCode(),
                faker.address().country());

    }
}
