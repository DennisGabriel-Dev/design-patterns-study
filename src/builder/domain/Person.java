package builder.domain;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String nickname;

    private Person(String firstName, String lastName, String email, String nickname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "First name: " + firstName
                + ", Last name: " + lastName
                + ", Email: " + email
                + ", Nickname: " + nickname;
    }

    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String nickname;

        public static PersonBuilder builder(){
            return new PersonBuilder();
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, email, nickname);
        }
    }
}
