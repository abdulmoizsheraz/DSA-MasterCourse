package com.oop1;
// How to import class from another package
import  static com.oop2.Greetings.message;;
public class Main{
    public static void main(String[] args) {
        System.out.println("Heloo form Main.java");
        // message(); if i ctrl+click this message method it will take me to the Greetings.java
    }
}