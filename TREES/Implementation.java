package TREES;

public class Implementation {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class BinaryTree{
        static int ind=-1;
        //building from preorder 
        //we can only write the code for building tree from preorder and postorder
        static Node Build(int nodes[]){
            ind++;
            if(nodes[ind]==-1)
                return null;
            Node newNode=new Node(nodes[ind]);
            newNode.left=Build(nodes);
            newNode.right=Build(nodes);
            return newNode;
        }
        static int n=13;
        static Node Build2(int nodes[]){
            n--;
            if(nodes[n]==-1)
                return null;
            Node newNode=new Node(nodes[n]);
            newNode.right=Build2(nodes);
            newNode.left=Build2(nodes);
            return newNode;
        }
        void Preorder(Node root){
            if(root==null)
                return;
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
        void Inorder(Node root){
            if(root==null)
                return;
            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);
        }
        void Postorder(Node root){
            if(root==null) return;
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=BinaryTree.Build(nodes);//static so direct calling without creating any object
        BinaryTree tree=new BinaryTree();
       

        tree.Preorder(root);//non static so calling with obj reference
        System.out.println();
        tree.Inorder(root);
        System.out.println();
        tree.Postorder(root);
        System.out.println();

        int nodes2[]={-1,-1,4,-1,-1,5,2,-1,-1,-1,6,3,1};
        Node root2=BinaryTree.Build2(nodes2);
        System.out.println(root2.data);


        tree.Preorder(root2);//non static so calling with obj reference
        System.out.println();
        tree.Inorder(root2);
        System.out.println();
        tree.Postorder(root2);
        System.out.println();
        





    }
}
