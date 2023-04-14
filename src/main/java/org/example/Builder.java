package org.example;

public class Builder {

}

class Person{
    String firstName;
    String lastName;
    int age;
    double salary;
    double weight;
    double height;



    //Constructor


}
interface PersonBuilder {
    PersonBuilder setFirstName(String firstName);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(double salary);
    PersonBuilder setWeight(double weight);
    PersonBuilder setHeight(double height);
    Person build();
}
class PersonBuilderImpl implements  PersonBuilder{
    Person person = new Person();
    @Override
    public PersonBuilder setFirstName(String firstName) {
        person.firstName = firstName;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.salary = salary;
        return this;
    }

    @Override
    public PersonBuilder setWeight(double weight) {
        person.weight =weight;
        return this;
    }

    @Override
    public PersonBuilder setHeight(double height) {
        person.height = height;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}

