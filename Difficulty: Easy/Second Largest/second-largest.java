import java.util.Arrays;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=max){
                return arr[i];
            }
        }
        return -1;
        
    
        
        
    }
}