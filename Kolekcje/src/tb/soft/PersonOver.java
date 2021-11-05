package tb.soft;

import java.util.Objects;

public class PersonOver extends Person {
    public PersonOver(String first_name, String last_name) throws PersonException {
        super(first_name, last_name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonOver personOver = (PersonOver) o;
        return birthYear == personOver.birthYear && firstName.equals(personOver.firstName) && lastName.equals(personOver.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);

    }
}
