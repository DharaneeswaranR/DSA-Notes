import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Queue {
    Node front;
    Node rear;
    
    Queue() {
        front = null;
        rear = null;
    }
    
    boolean isEmpty() {
        if(front == null) 
            return true;
        else
            return false;
    }
    
    void enQueue(int data) {
        Node newnode = new Node(data);
        
        if(rear == null)
            front = rear = newnode;
        else {
            newnode.next = null;
            rear.next = newnode;
            rear = newnode;
        }
    }
    
    void deQueue() {
        Node poppednode;
        
        if (isEmpty())
            return;
        else {
            poppednode = front;
            front = front.next;
            poppednode.next = null;
        }
    }
    
    void display() {
        Node temp;
            
        temp = front;
            
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
            
        System.out.println("Null");
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue Q = new Queue();
        
        Q.enQueue(10);
        Q.enQueue(20);
        Q.enQueue(30);
        Q.enQueue(40);
        Q.display();
        Q.deQueue();
        Q.display();
    }
}