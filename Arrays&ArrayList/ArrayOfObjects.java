import java.util.Scanner;
import java.util.Arrays;
public class ArrayOfObjects {
    public static void main(String[] args) {
        // Array of objects
    Scanner in=new Scanner(System.in);
    String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
    arr[i]=in.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }
}
