/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        int leftLen = getLength(root.left);
        int rightLen = getLength(root.right);
        if(leftLen > rightLen){
            return root.data + sumOfLongRootToLeafPath(root.left);
        }else if(leftLen < rightLen){
            return root.data + sumOfLongRootToLeafPath(root.right);
        }else{
            return root.data + Math.max(sumOfLongRootToLeafPath(root.left),sumOfLongRootToLeafPath(root.right));
        }
    }
    private int getLength(Node root){
        if(root == null) return 0;
        return 1 + Math.max(getLength(root.left),getLength(root.right));
    }
}
