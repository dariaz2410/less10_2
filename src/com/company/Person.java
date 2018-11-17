package com.company;

import java.util.Arrays;
import java.util.Random;

public class Person {
    public String name;
    public String surname;
    public int age;
    public int weight;
    public double height;

    public void NamePerson() {
        String[] mass = {"Roman", "Max", "Oleg", "Misha", "Alex"};
        String[] mass2 = {"Ivanov", "Petrov", "Sidorov", "Lebedev", "Smirnov"};
        Random random = new Random();
        int n1 = random.nextInt(mass.length);
        name = mass[n1];
        int n2 = random.nextInt(mass2.length);
        surname = mass2[n2];
        age = 20 + random.nextInt(50 - 20);
        weight = 60 + random.nextInt(100 - 60);
        height = 150 + random.nextInt(200 - 150);
        height = height/100;
    }

    public Person() {
    }

    Random random = new Random();

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
