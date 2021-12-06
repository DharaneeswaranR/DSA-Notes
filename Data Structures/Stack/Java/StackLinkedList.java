import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        next = null;
    } 
}

class Stack {
    Node top;
    
    Stack() {
        top = null;
    }
    
    void push(int data) {
        Node newNode = new Node(data);
        
        if(top == null)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
    }
    
    int pop() {
        if(top == null)
            return 0;
        
        Node poppedNode = top;
        top = poppedNode.next;
        poppedNode.next = null;

        return poppedNode.data;
    }
    
    void display() {
        if(top == null)
            return;
            
        Node temp = top;
            
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
            
        System.out.println("Null");
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        
        while (input.hasNextInt()) {
            stack.push(input.nextInt());
        }
        
        System.out.println("Stack contents are :");
        stack.display();

        System.out.println("Top element in Stack is : " + stack.top.data);
        System.out.println("Popped Element : " + stack.pop());
        
        input.close();
    }
}

/* Output:

1
2
3
4
5
\n
Stack contents are :
5->4->3->2->1->Null
Top element in Stack is : 5
Popped Element : 5

*/