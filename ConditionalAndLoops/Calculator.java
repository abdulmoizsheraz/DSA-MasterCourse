import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Create a Program that calculate the numbers by entering symbol form user and calculator does not start until unless user Enter X,x
        Scanner sc=new Scanner(System.in);
        int sol=0; //For Storing the Result
        while(true)
        {
            System.out.println("Enter an Operator to be used");
            char OP=sc.next().trim().charAt(0); // Takes a Character Input
            if(OP=='+' || OP=='-' || OP=='/' || OP=='*')
            {
                System.out.println("Enter two numbers : ");
                int n1=sc.nextInt(); //Takes two numbers as input for Calculating
                int n2=sc.nextInt();
                if(OP=='+') {
                    sol=n1+n2; //Performs Addition
                }
                if(OP=='-') {
                    sol=n1-n2; //Performs Subtraction
                }
                if(OP=='/') {
                    sol=n1/n2; //Performs Division
                }
                if(OP=='*') {
                    sol=n1*n2; //Performs Multiplication
                }
            } else if (OP=='X' || OP=='x') {
                System.out.println("Program Terminated"); //Exits the Loop
                break;
            } else {
                System.out.println("INVALID CHOICE");
            }
            System.out.println(sol); // Displays the Result
            System.out.println("Enter 'X' or 'x' to Terminate");
        }
    }
}
