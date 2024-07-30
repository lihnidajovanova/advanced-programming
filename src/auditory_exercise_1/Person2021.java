package auditory_exercise_1;

import java.util.Objects;

public class Person2021 {
    String firstName;
    String lastName;
    int age;

    public Person2021(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("First name: %s Last name: %s Age: %d", firstName, lastName, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person2021 person = (Person2021) o;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void main(String[] args) {
        Person2021 p1 = new Person2021("Stefan", "Andonov", 24);
        Person2021 p2 = new Person2021("Stefan", "Andonov", 28);
        Person2021 p3 = new Person2021("Lihnida", "Jovanova", 22);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}