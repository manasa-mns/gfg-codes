import java.util.Arrays;
class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int result;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
            
        }
        return n+1;
        
    }
}