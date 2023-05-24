import java.util.Arrays;
public class PracticePrograms {
    public static void main(String[] args) {
        // Swaping two numbers
        // int a=87;
        // int b=67;
    //    swap( a,b); 
    //    int [] arr={1,2,3,4,5,6,7,8,9,10};
    //    int a=0;
    //    int b=arr.length-1;
    //    Reverse(arr, a, b);
    //    System.out.println(Arrays.toString(arr));
    // Create a Progarm that swap two numbers in array at the given index

    // Create a Progarm that return max number in array 
    // Create a Progarm that return max number in array between the given indexes
    }
    // Functions
    static void swap( int []arr,int start,int end){
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
    }
    static void Reverse( int[] arr,int start,int end){
    while(start<end){
        swap(arr,start,end);
        start++;
        end--;
    }}


    

}
