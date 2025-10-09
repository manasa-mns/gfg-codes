class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        //Build adjacency list
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0],v=e[1],w=e[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        int INF=(int)1e9;
        int[] dist=new int[n+1];
        int[] parent=new int[n+1];
        Arrays.fill(dist, INF);
        for(int i=1;i<=n;i++){
            parent[i]=i;
            
        }
        dist[1]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,1});
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int d=cur[0], u=cur[1];
            if(d>dist[u]) continue;
            for(int[] e:adj.get(u)){
                int v=e[0], w=e[1];
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    parent[v]=u;
                    pq.offer(new int[]{dist[v],v});
                }
            }
        }
            if(dist[n]==INF){
                return Arrays.asList(-1);
                
            }
            List<Integer> path=new ArrayList<>();
            int node=n;
            while(parent[node]!=node){
                path.add(node);
                node=parent[node];
                
            }
            path.add(1);
            Collections.reverse(path);
            List<Integer> result=new ArrayList<>();
            result.add(dist[n]);
            result.addAll(path);
            
            return result;
        }
        
    
}
