// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int maxRowIndex=-1;
        int j=m-1;//decrement honekeliye 0111 moves from right to left bcz
                  //in question given the sorted array
        for(int i=0;i<n;i++){
            while(j>=0 && arr[i][j]==1){
                maxRowIndex=i;
                j--;
            }
        }
        return maxRowIndex;
    }
}