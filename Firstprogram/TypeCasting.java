import java.util.Scanner;
public class TypeCasting {
    // Coverting one tyoe to another type
    public static void main(String[] args) {
        
        // Scanner input=new Scanner(System.in);
        // float marks=input.nextFloat(); 
         //Now for Convertion right hand side which is actually printing must be greater than the value you are entering it means that we can not convert float into int beacause float has large capacity to stoore than int also for convertion taht datypes must be camparble and for example string cannot converted into int or float
         // Now how to convert float to integar.Here the concept of typecasting come
        //  In simple words converting bigger datatype to small 
        int num=(int)(12.34f);  // Converted to 12
        System.out.println(num);
        // System.out.println(marks);
        // automatic type conversion in expressions
        int a=257;
        byte b= (byte)(a);  // actually 257%256==remainder 256 which is max capacity of byte
        System.out.println(b);
        byte no1=40;
        byte no2=10;
        byte no3=60;
        int pro=no1*no2/no3; // now here java before giving me output will convert byte into int and than evaluate the result
        System.out.println(pro);
        // Important Note:When we are perforing actions on byte it will convert it into int 
        // byte moiz=23;   //Error:because before evaluating it will convert it into int 
        // moiz=moiz*2;     // and in this line we are assigning integer to byte without type casting
        // you can only use unicode values in java
        
    }
    }
