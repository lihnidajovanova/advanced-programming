package auditory_exercise_1;

import java.util.Objects;

public class Person2020 implements Comparable<Person2020> {
    private String name;
    private String lastName;
    private int age;

    public Person2020(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person2020(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.age = 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2022{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person2020 person = (Person2020) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

    @Override
    public int compareTo(Person2020 o) {
        return Integer.compare(this.age, o.age);
    }

    public static void main(String[] args) {
        Person2020 p1 = new Person2020("Stefan", "Andonov", 23);
        Person2020 p2 = new Person2020("Lihnida", "Jovanova", 23);
        // p2.setAge(25);

        System.out.println(p1.equals(p2));
    }
}