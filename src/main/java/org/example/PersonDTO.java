package org.example;

public class PersonDTO {
    public static void main(String[] args) {

        Person person = new PersonBuilderImpl()
                .setAge(15)
                .setFirstName("Max")
                .setLastName("OX")
                .setHeight(500)
                .setWeight(500)
                .setSalary(50000)
                .build();

    }
}
