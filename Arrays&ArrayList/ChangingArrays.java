import java.util.*;
public class ChangingArrays {
    public static void main(String[] args) {
       String[] Names={"Zain","Abdullah","Ahmed","Ali","Shoibe"} ;
       change(Names); // Here the new copy of the Array will create we are passing 
       System.out.println(Arrays.toString(Names));
    }
    static void change(String[] arr){
arr[0]="Moiz";
    }
}
