import java.util.Scanner;
import java.util.ArrayList;
// First the Question should arise that why we need ArrayList
// In Ordinary Array we have to give size to while decalring array in other words we should have fix size but here in ArrayList we do not give Size just like Vectors in C++
public class ArrayLists {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // no need to give size here
        for(int i=0;i<7;i++){
            numbers.add(in.nextInt()); // add() is used to add elements in ArrayList
        }
        //Internal Working of ArrayList Actually the size is fiexed in memory when half of your Array fills it generate new List double the size of old one and move elements to it and delte old one
    }
}
