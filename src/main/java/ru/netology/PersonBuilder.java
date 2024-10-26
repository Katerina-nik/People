package ru.netology;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Person build() {
        if (age < 0 || age > 130) {
            throw new IllegalStateException("Введен некорректный возвраст" + age);
        }
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указано имя или фамилия");

        }


        Person person = new Person(name, surname, age);
        person.setAddress(address);
        return person;


    }
}
