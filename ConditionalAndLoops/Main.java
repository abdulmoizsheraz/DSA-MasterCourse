import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    // Writing a Program that detects the case of letter upper or lower
    // ==, >, <, >=, <= camparing symbols in java
    // Write a program that check case of word
// Scanner input=new Scanner(System.in);
// char check=input.next().trim().charAt(0);
// if(check>='a' && check<='z' ) // Actually it is checking for lower case and upper case letter by camparing unicode of char's unicode lies betweeen the unicode of from a to z tha it is lowercase
// {
//     System.out.println("Lower Case");
// }
// Find nth Fabonicci number
// Fabonicci number is a number that is formed by adding two numbers and the series starts form 0 and 1 for example 0,1,1,2,3,5,8 .... here 2,3,5,8 are Fabonicci numbers
// Scanner in=new Scanner(System.in);
// int number=in.nextInt();
// Now as we know fabonicci numers start with 0 and 1 so we have starting point now 
// int count=2;
// int pervious=0;
// int current=1;
// while(count<=number){
// int temp=current;
// current=current+pervious;
// pervious=temp;
// count++;
// }
// System.out.println(current);
// Write the program that counts the number of occurance in a number i.e 236265 in this number 6 occurs two time in a number
Scanner in=new Scanner(System.in);
// while(no>0){
    //     if(no%10==5){
//         count++;
//     }
//     no=no/10;  // to Reduce number
// }
// System.out.println(count);
// Write a Program that reverse number
int no=in.nextInt();
int rem=0;
int rev=0;

while(no>0){
rem=no%10;
no=no/10;
rev*=10;
rev=rev+rem;
}
System.out.println(rev);

}

}