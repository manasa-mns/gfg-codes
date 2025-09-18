class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        int v=adj.size();
        boolean[] visited=new boolean[v];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        while(!stack.isEmpty()){
            int vertex=stack.pop();
            if(!visited[vertex]){
                visited[vertex]=true;
                res.add(vertex);
                List<Integer> n=adj.get(vertex);
                for(int i=n.size()-1;i>=0;i--){
                    int n1=n.get(i);
                    if(!visited[n1]){
                        stack.push(n1);
                    }
                }
            }
        }
        return res;
    }
}