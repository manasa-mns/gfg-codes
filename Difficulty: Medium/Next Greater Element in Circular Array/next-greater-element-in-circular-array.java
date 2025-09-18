class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
       int n=arr.length;
       int[] check=new int[n];
       Arrays.fill(check,-1);
       Stack<Integer> stack=new Stack<>();
       for(int i=0;i<n*2;i++){
           int j=i%n;
           while(!stack.isEmpty() && arr[stack.peek()]<arr[j]){
               check[stack.pop()]=arr[j];
               
           }
           if(i<n) stack.push(i);
       }
       ArrayList<Integer> list=new ArrayList<>();
       for(int i:check){
           list.add(i);
       }
       return list;
    }
}