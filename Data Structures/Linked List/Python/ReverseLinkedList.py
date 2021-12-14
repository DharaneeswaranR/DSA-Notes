class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    
class LinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        if self.head == None:
            return True
        
    def add_node(self, data):
        new_node = Node(data)

        if self.is_empty():
            self.head = new_node
            return

        temp = self.head

        while temp.next:
            temp = temp.next

        temp.next = new_node

    def reverse(self):
        current = self.head
        prev = None
        
        while(current is not None):
            next = current.next
            current.next = prev
            prev = current
            current = next
        
        self.head = prev

    def printList(self):
        temp = self.head
        
        while (temp):
            print(temp.data, end = "-->" if temp.next else "")
            temp = temp.next

        print()


l = LinkedList()
l.add_node(1)
l.add_node(2)
l.add_node(3)
l.add_node(4)
l.add_node(5)
l.printList()
l.reverse()
l.printList()

'''
Output:

1-->2-->3-->4-->5
5-->4-->3-->2-->1

'''


        

