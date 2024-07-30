package auditory_exercise_1;

import java.util.Objects;

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2022{" +
                "name=" + name + '\'' +
                ", age=" + age +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person2 person = (Person2) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Stefan", 25);
        Person2 p2 = new Person2("StEfan", 28);
        Person2 p3 = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p3);
    }
}
