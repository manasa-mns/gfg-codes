import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int left=0;
        int currentsum=0;
        for(int right=0;right<arr.length;right++){
            currentsum+=arr[right];
        
        while(currentsum>target && left<=right){
            currentsum-=arr[left];
            left++;
        }
        if(currentsum==target){
            result.add(left+1);
            result.add(right+1);
            return result;
        }
        
            
        }
        result.add(-1);
        return result;
    }
}
