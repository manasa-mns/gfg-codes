class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int v=adj.size();
        Set<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited.add(0);
        while(!q.isEmpty()){
            int vertex=q.poll();
            res.add(vertex);
            for(int n:adj.get(vertex)){
                if(!visited.contains(n)){
                    q.add(n);
                    visited.add(n);
                }
            }
        
        }return res;
    }
}