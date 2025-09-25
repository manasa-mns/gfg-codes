class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        int[] indegree=new int[V];
        for(int[] e:edges){
            int u=e[0],v=e[1];
            adj.get(u).add(v);//directed graph
            indegree[v]++;//indegree=[0,1,1,2]
            
        }
        //queue for nodes with indegree=0
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0)
                q.offer(i);
                
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int n:adj.get(node)){
                indegree[n]--;
                if(indegree[n]==0)
                    q.offer(n);
            }
        }
        return count!=V;
    }
    
}