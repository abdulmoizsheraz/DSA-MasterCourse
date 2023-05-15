import java.util.ArrayList;
import java.util.Scanner;
public class MultiArrayList {
    public static void main(String[] args) {
        // Multiple Array list is just like a Arraylist within an Arraylist we can imagine it as a 2D array
      // Simple
      ArrayList<Integer> Names=new ArrayList<Integer>();
        // Multiple
        ArrayList<ArrayList<Integer>> NamesMulti=new ArrayList<>();
        // initializing the arraylist
        for(int i=0;i<3;i++){
            NamesMulti.add(new ArrayList<Integer>());
        }
        // Here we need to intialize the list as in 2D array we initialize the Array while declaring 
        // just like this
        // int [][] arr=new int[3][3];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                NamesMulti.get(i).add(in.nextInt());
            }
        }
        //Completely imagine this ArrayList as a 2D Array

    }
}
