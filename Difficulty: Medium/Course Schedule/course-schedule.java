class Solution {
    public static ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int[] p:prerequisites){
            int u=p[1], v=p[0];
            adj.get(u).add(v);
            indegree[v]++;
            
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
            q.offer(i);
        }
        ArrayList<Integer> t=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            t.add(node);
            for(int nei:adj.get(node)){
                indegree[nei]--;
                if(indegree[nei]==0)
                q.add(nei);
            }
        }
        if(t.size()==n)
        return t;
        else
        return new ArrayList<>();
    }
}