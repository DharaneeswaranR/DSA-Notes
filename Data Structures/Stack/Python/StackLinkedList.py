class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None

    def isEmpty(self):
        if self.top == None:
            return True
        else:
            return False

    def push(self, data):
        newnode = Node(data)

        if self.isEmpty():
            self.top = newnode
        else:
            newnode.next = self.top
            self.top = newnode

    def pop(self):
        if self.isEmpty():
            return None
        else:
            poppednode = self.top
            self.top = self.top.next
            poppednode.next = None

            return poppednode.data

    def peek(self):
        if self.isEmpty():
            return None
        else:
            return self.top.data


MyStack = Stack()

MyStack.push(10)
MyStack.push(20)
MyStack.push(30)

print(MyStack.pop(), "popped from stack")
print("Top element is", MyStack.peek())


''' 
Output:

30 popped from stack
Top element is 20

'''
