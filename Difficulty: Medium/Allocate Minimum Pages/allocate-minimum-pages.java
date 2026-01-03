class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n)return -1;
        int low=0,high=0;
        for(int pages:arr){
            low=Math.max(low,pages);
            high+=pages;
            
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean isPossible(int[] arr,int k,int mid){
        int students=1;
        int currSum=0;
        for(int pages:arr){
            if(currSum+pages>mid){
                students++;
                currSum=pages;
                if(students>k)
                return false;
                
            }else{
                currSum+=pages;
            }
        }
        return true;
    }
}