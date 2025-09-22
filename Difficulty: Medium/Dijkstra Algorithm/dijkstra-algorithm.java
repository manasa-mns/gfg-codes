class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // Build an adjacency list
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges) { // e=[0,1,4]
            int u = e[0],v=e[1], w = e[2];
            adj.get(u).add(new int[] {v,w});
            adj.get(v).add(new int[] {u,w});
        }
        // Distance array
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE); // dit = [infinity,inf,inf,inf,inf]
        dist[src] = 0; // dist = [0,inf,inf,inf,inf]
        // construct a min-heap{distance,node}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0,src}); // intially {distance=0,src=0}
        
        //Dijkstra
        while(!pq.isEmpty()){
            int[] cur = pq.poll(); //cur[] = {0,0}
            int d =cur[0], u = cur[1];
            if(d>dist[u])
                continue;
            for(int[] nei: adj.get(u)){ //u=0.(1,4),(2,8)
                int v = nei[0], w = nei[1];
                if(dist[u]+w < dist[v]) { // 0+4 < inf yes
                    dist[v] = dist[u] + w; // dist = [o,4,inf,inf,inf]
                    pq.offer(new int[]{dist[v], v});
                    
                    
                }
                
            }    
        }
        return dist;
    }
}