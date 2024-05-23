public class DeleteNodeInABST {

    private TreeNode searchNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        else if(key == root.val){
            return root;
        }
        else if(key < root.val){
            root = root.left;
        }
        else{
            root = root.right;
        }
        return null;
    }

    private void rearrangeTree(TreeNode root, TreeNode searchNode){

    }

    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode searchNode = searchNode(root, key);
        if(searchNode == null){
            return root;
        }
        rearrangeTree(root, searchNode);
        return null;
    }
}
