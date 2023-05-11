import java.util.*;
public class Staring2DArrays {
    public static void main(String[] args) {
        // Completely imagine this Arrays as a Matrix(n*n)
        /*
        1 2 3 
        4 5 6 
        7 8 9 
         */

        // int[][] first2DArray=new int[3][]; // Here we should note that while decalring 2d Array it is not mandatory to add colmuns but you should add rows its mandatory .
int[][] first2DArray={
{1,2,3}, // first Element first2DArray[0]
{4,5,6},// second Element first2DArray[1]
{7,8,9} // third Element first2DArray[2]
};
/*Now for EXample of you want to access the first element you can print first2DArray[0][here you will write the index of element you want to access in that particular array] for example first2DArray[0][2] will give you 3 */
// imagine this 2d array as a Array of Arrays 
//--------------------------
/*
Taking Inputs in 2D Arrays
*/
Scanner scanner = new Scanner(System.in);
String[][] arr=new String[3][3];
System.out.println("Enter the String");
for(int i=0; i<arr.length; i++){

    for(int j=0;j<arr[i].length;j++){
arr[i][j]=scanner.nextLine();
    }
}

for(int i=0;i<arr.length;i++){
    System.out.println(Arrays.toString(arr[i]));    
}
// for of loop (Enhanced for loop)
String[] names={"Moiz","Mozzy","Shazada"};
for(String name:names){
    System.out.println(name);    
}
}
}
