class Solution {
    public int minStep(int n) {
        // code here
        int steps=0;
        while(n>1){
            if(n%3==0){
                n=n/3;
            }else{
                n=n-1;
            }
            steps++;
        }
        return steps;
    }
}
