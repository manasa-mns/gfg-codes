class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=arr[j];
                
            }
            result.add(sum);
        }
        return result;
        
    }
}