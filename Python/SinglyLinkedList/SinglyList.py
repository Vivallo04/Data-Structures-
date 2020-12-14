from Data_Structures.SinglyLinkedList.Node import *
# Data Structures in Python

class SinglyList:
    def __init__(self):
        #Reference to the head node
        self.head = None
        #Number of stack elements
        self.size = 0

    def append(self, element):
        """Add :param element to the back of the list"""
        if self.is_empty():
            self.head = Node(element, self.head)
        else:
            current_node = self.head
            while current_node != None:
                current_node = current_node.next
            current_node.next = Node(element, current_node.next)

    def __len__(self):
        """Return the number of elements in the stack"""
        return self.size

    def is_empty(self):
        """Return True if the stack is empty"""
        return self.size == 0

    def add_first(self, element):
        newest = Node(element, self.head)
        #newest.next = self.head
        self.head = newest
        self.size += 1

    def push(self, element):
        """Add :param element to the top of the stack"""
        #Create and link a new Node
        self.head = Node(element, self.head)
        self.size += 1

    def top(self):
        """Return, but do not remove, the element at the top of the stack
        :except Raise Exception if the stack is empty"""
        if self.is_empty():
            raise TypeError("Stack is empty")
        #Top of stack is at head of the list
        return self.head.element

    def pop(self):
        """Remove and return the element from the top of the stack
        :except Raise Exception if the stack is empty """
        if self.is_empty():
            raise TypeError("Stack is empty")
        answer = self.head.element
        self.head = self.head.next
        self.size -= 1
        return answer

    def remove_first(self):
        if self.head == None:
            raise TypeError("The list is empty")
        self.head = self.head.next
        self.size -= 1

    def get_list(self):
        current_node = self.head
        while current_node != None:
            print(current_node.get_element())
            current_node = current_node.next

    def delete(self, element):
        if self.is_empty():
            raise TypeError("The list is empty")
        current_node = self.head
        while current_node.get_element() != element:
            current_node = current_node.next


"""The space usage is O(n), where n is the current number of elements in the stack."""
