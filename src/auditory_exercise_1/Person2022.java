package auditory_exercise_1;


import java.util.Objects;

public class Person2022 {

    private String name;
    private String surname;
    private int age;
    private String address;

    public Person2022() {
    }

    public Person2022(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2022 person = (Person2022) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s, Age: %d, Address: %s", name, surname, age, address);
    }

    public static void main(String[] args) {
        Person2022 person1 = new Person2022("Stephen", "Colbert", 30, "USA");
        Person2022 person2 = new Person2022("John", "Oliver", 40, "UK");
        Person2022 person3 = new Person2022("Trevor", "Noah", 50, "USA");

        Person2022 person4 = new Person2022("Stephen", "Colbert", 30, "USA");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.equals(person4));
        System.out.println(person2.equals(person4));
    }
}
