package auditory_exercise_1;

import java.util.Objects;

public class Person2024 {
    String name;
    int age;

    public Person2024(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2024(String name) {
        this.name = name;
    }

    public Person2024() {
    }

    @Override
    public String toString() {
        return String.format("Name: %s Age: %d", this.name, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2024 person = (Person2024) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person2024 p1 = new Person2024();
        System.out.println(p1);
        Person2024 p2 = new Person2024("Stefan");
        System.out.println(p2);
        Person2024 p3 = new Person2024("Stefan", 27);
        System.out.println(p3);

        System.out.println(p2.equals(p3));
    }
}