
class Solution {
    public int search(int arr[], int x) {
        
        // code here
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
