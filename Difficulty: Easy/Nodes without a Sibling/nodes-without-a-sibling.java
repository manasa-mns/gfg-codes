/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree {
    ArrayList<Integer> noSibling(Node node) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(node==null){
            res.add(-1);
            return res;
        }
        Stack<Node> s=new Stack<>();
        s.push(node);
        while(!s.isEmpty()){
            Node curr=s.pop();//35 popped
            if(curr.left!=null && curr.right==null){
                res.add(curr.left.data);//20 is added
                
            }else if(curr.left==null && curr.right!=null){
                res.add(curr.right.data);
            }
            if(curr.left!=null) s.push(curr.left);
            if(curr.right!=null) s.push(curr.right);
        }
        if(res.isEmpty()) res.add(-1);
        Collections .sort(res);
        return res;
        
    }
}