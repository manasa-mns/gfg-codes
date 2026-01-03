class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        return search(arr,k,0,arr.length-1);
        
    }
    private int search(int[] arr,int k,int low,int high){
        if(low>high)return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==k){
            int left=search(arr,k,low,mid-1);
            return left==-1?mid:left;
        }
            if(arr[mid]<k)
            return search(arr,k,mid+1,high);
            return search(arr,k,low,mid-1);
        
    }
}