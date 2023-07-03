public abstract class Parent{
    int age;
    abstract void Career();  // Here we are declaring abstract method in Parent class 
    abstract void Partner();
    // If we note above two functions have no body but we will declare their body in child classes
    // we can also create constructor of Abstract class No Problem
    Parent(int age){
        this.age=age;
    }
    // we canot create object of abstract class
}