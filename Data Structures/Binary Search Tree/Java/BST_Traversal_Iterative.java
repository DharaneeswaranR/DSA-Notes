import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST_Traversal_Iterative {
    Node root;

    void preorder(Node root) {
        if (root == null) 
            return;

        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        while (nodeStack.empty() == false) {
            Node curr = nodeStack.peek();
            System.out.print(curr.data + " ");
            nodeStack.pop();

            if (curr.right != null)
                nodeStack.push(curr.right);

            if (curr.left != null) 
                nodeStack.push(curr.left);    
        }

        System.out.println();
    }

    void inorder(Node root) {
        if (root == null)
            return;
        
        Stack<Node> nodeStack = new Stack<Node>();
 
        while (root != null || nodeStack.empty() == false) {
            if (root != null) {
                nodeStack.push(root);
                root = root.left;
            }

            else {
                Node popped = nodeStack.pop(); // nodeStack.peek()
                //nodeStack.pop();
                System.out.print(popped.data + " ");
                root = popped.right;
            }
        }

        System.out.println();
    }

    void postorder(Node root) {
        if (root == null)
            return;

        Stack<Node> nodeStack = new Stack<Node>();
        Node prev = null;

        while (root != null || !nodeStack.empty()) {
            if (root != null) {
                nodeStack.push(root);
                root = root.left;
            }

            else {
				root = nodeStack.peek();
				
                if (root.right == null || root.right == prev) {
				    System.out.print(root.data + " ");
				    nodeStack.pop();
				    prev = root;
				    root = null;
				}
				
                else
				    root = root.right;
			}
        }

        System.out.println();
    }

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        BST_Traversal_Iterative tree = new BST_Traversal_Iterative();

        tree.root = new Node(30);
        tree.root.left = new Node(20);
        tree.root.right = new Node(40);
        tree.root.left.left = new Node(15);
        tree.root.left.right = new Node(70);
        tree.root.right.left = new Node(80);
        tree.root.right.right = new Node(90);

        tree.preorder(tree.root);
        tree.inorder(tree.root);
        tree.postorder(tree.root);
    }
}

/*

Output:

30 20 15 70 40 80 90 
15 20 70 30 80 40 90
15 70 20 80 90 40 30

*/

