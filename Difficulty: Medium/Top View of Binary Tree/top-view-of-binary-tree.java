class Pair {
    int hd;
    Node node;

    Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        q.add(new Pair(0, root));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }
            if(curr.node.left != null){
                q.offer(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right != null){
                q.offer(new Pair(curr.hd+1, curr.node.right));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        
        return list;
    }
}