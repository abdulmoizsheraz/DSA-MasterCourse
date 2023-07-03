public class Main {
    public static void main(String[] args) {
        // return the index of target element
    int arr[]={12,34,56,76,90}; // sorted array only
int target=56;
int returnIndex=BinarySearch(arr, target);
System.out.println(returnIndex);

    }
    // return -1 if target not found
    static int BinarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // find the middleElement
            int middleElement=(start+end)/2; // it will return the index of middleElement
            if(arr[middleElement] >target){
                // than my target Element lies on left side
                end=middleElement-1;
            }else if(target>arr[middleElement]){
              start=middleElement+1;
            }else{
                return middleElement; // index
            }
        }
        return -1;
    }
}