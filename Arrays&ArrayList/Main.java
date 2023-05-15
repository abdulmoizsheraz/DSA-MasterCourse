//Recap:Primitive datatype:The datatype that cannot be broken down into further dattype i.e Int,char,float,double,boolean(not Array and String )
// --->In pass by value, a copy of the variable's value is passed to a function, whereas in pass by reference, a reference to the variable in memory is passed to the function. In other words, pass by value copies the value of the variable, while pass by reference copies the address where the variable is stored in memory.


import java.util.Scanner;
public class Main{

public static void main(String[] args) {
    // General Syntax
    // data_type[] variable_name=new data_type[size];
    //  we Also write 
    // data_type variable_name={elments...}
    //  internal working of array
    // when i declared 
    // int name[] reference variable create in Stack memory now when name=new name[]
    int[] name;
    name=new int[5];
    // Defination of Array:Continous form of data but Actually in java data store in heap memory is actually not not continous bcz objects store in heap memory is not continous
    // In Java, objects stored in heap memory are managed by a memory allocation system that dynamically allocates and deallocates memory as needed, which may result in non-contiguous memory allocation.
    // accessing elements is same as in other programming language 
    // System.out.println(name[3]);  // Output 0
    // In Java, null is a special value that represents the absence of a value. It is typically used to indicate that a reference variable does not refer to any object.

// Here's a simple example to illustrate this:
// String myString = null;
// In this example, we have declared a String variable named myString and assigned it the value null. This means that myString does not currently refer to any String object.
// If we try to use myString in any way that requires it to refer to a String object (such as calling a method on it), we will get a NullPointerException. For example:

// System.out.println(myString.length());
// This code will result in a NullPointerException, because myString is null and therefore cannot be used to call the length() method.
// Taking input in array
  // data_type[] variable_name=new data_type[size];
Scanner in=new Scanner(System.in);
String[] Stringarr=new String [5];
// for(int i=0;i<Stringarr.length;i++){
//     Stringarr[i]=in.nextLine();
// }
for(int i=0;i<Stringarr.length;i++){
    System.out.println(Stringarr[i]);
}
}
// Array are mutable in java and Strings are immutable in java.In Simple language we can change Array members in java 
}