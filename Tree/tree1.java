class TreeNode{
     int data ;
    TreeNode left;
    TreeNode right;
    treeNode(int data){
       this.data=data;
    }
}

public class tree1 {
   public static void main(String[] args) {
    TreeNode root=new TreeNode(10);
    TreeNode leftChild=new TreeNode(20);
    TreeNode rightChild=new TreeNode(300);
    root.left=leftChild;
    root.right=rightChild;
    TreeNode leftchild1=new TreeNode(100);
    TreeNode righttchild1=new TreeNode(100);


   }
}

