// What is package ? it is Folder where our java file lies
// We can use Public class anywhere we want
import java.util.Scanner;
public  class Main{
    public static void main(String[] args){
// System.out.println("Starting"); // it will beak the line
// System.out.print("Starting again");
Scanner input=new Scanner(System.in);
int num = input.nextInt();  // similarly next and nextline for entering string and complete line respectively
System.out.println("You entered " + num);



    }

}