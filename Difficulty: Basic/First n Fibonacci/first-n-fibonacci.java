// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr=new int[n];
        int first=0;
            int second=1;
            int sum=0;
        
        for(int i=0;i<n;i++){
            arr[i]=first;
            sum=first+second;
            first=second;
            second=sum;
            
        }
        return arr;
    }
}