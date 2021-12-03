class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST_Traversal_Recursive {
    Node root;

    void preorder(Node root) {
        if (root == null)
            return;
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null)
            return;
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        BST_Traversal_Recursive tree = new BST_Traversal_Recursive();

        tree.root = new Node(30);
        tree.root.left = new Node(20);
        tree.root.right = new Node(40);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(25);
        tree.root.right.left = new Node(35);
        tree.root.right.right = new Node(90);

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }
}

/*

Output:

30 20 15 25 40 35 90 
15 20 25 30 35 40 90
15 25 20 35 90 40 30

*/