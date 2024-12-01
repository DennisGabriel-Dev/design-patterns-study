package builder.test;

import builder.domain.Person;

public class TestPersonBuilder {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .nickname("dennis")
                .firstName("Dennis")
                .lastName("Gabriel")
                .email("dennisgabriel@email.com")
                .build();

        System.out.println(person);
    }
}
