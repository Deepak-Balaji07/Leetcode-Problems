/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> ls = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null){
            return ls;
        }
        for(Node child : root.children){
            postorder(child);
        }
        ls.add(root.val);
        return ls;
    }
}