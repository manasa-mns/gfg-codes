import java.util.*;

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // because it's an undirected graph
        }

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (hasCycle(adj, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasCycle(List<List<Integer>> adj, boolean[] visited, int node, int parent) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (hasCycle(adj, visited, neighbor, node)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // If neighbor is visited and not parent → cycle found
                return true;
            }
        }
        return false;
    }
}
