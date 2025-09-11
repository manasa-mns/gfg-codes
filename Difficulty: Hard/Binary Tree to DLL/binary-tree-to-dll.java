/*
class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/
class Solution {
    Node head=null;
    Node tail=null;
    Node bToDLL(Node root) {
        // code here
        if(root==null)
        return null;
        inorder(root);
        return head;
        
    }
    private void inorder(Node node){
        if(node==null)return;
        inorder(node.left);
        if(tail==null){
            head=node;
            
        }else{
            tail.right=node;
            node.left=tail;
            
        }
        tail=node;
        inorder(node.right); 
    }
}