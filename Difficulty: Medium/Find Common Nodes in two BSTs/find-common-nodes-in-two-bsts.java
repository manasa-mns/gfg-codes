class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        inorder(r1,s1);
        inorder(r2,s2);
        //declarea common set to store the common elements in s1 and s2
        TreeSet<Integer> common=new TreeSet<>(s1);
        common.retainAll(s2);
        return new ArrayList<>(common);
    }
    private static void inorder(Node root,Set<Integer> set){
        if(root==null) return;
        inorder(root.left,set);
        set.add(root.data);
        inorder(root.right,set);
    }
}