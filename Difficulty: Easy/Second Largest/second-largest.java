import java.util.Arrays;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int prev=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                prev=max;
                max=arr[i];
            }else if(prev<arr[i]&&arr[i]<max){
                prev=arr[i];
            }
            
        }
        return prev;
      
    }
}