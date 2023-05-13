package com.staticExample;

public class Human {
    int age;
    int salary;
    int height;
   static long population;
    // Creating public constructor
    public Human(int age, int salary, int height) {
        this.age = age;
        this.salary = salary;
        this.height = height;
        this.population+=1;
        // Thing that there exist a property that is same for all human beings such as population
    }
}
