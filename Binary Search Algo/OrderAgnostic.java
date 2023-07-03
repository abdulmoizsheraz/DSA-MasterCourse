public class OrderAgnostic {
    public static void main(String[] args) {
        // int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int arr[]={99,88,75,22,11,10,5,2,-3};
        int target=22;
        int ans=OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int  OrderAgnosticBS (int arr[],int target){
        // First of all check The Array is  Arranged small to large or else
        int start=0;
        int end=arr.length-1;
        boolean isAce;
        isAce=arr[start]<arr[end];
        while(start<=end){
             int middleElement=(start+end)/2; // it will return the index of middleElement
            if(arr[middleElement]>target){
              // Now if target Element is greater than Middle Element and it is arranged from small to large than start shoild be mid+1
              if(isAce){
              end=middleElement-1;
              }else{
                start=middleElement+1;
              }
            }else if(target>arr[middleElement]){
                if(!isAce){
              end=middleElement-1;
                }else{
                  start=middleElement+1;
                }
            }else{
                return middleElement; // index
            }
        }
         return -1;
    }
}
