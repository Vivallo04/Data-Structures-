from Data_Structures.CircularlyLinkedList.Node import *
#Data Structures in Python

class CircularlyLinkedList:
    def __init__(self):
        """Create an empty queue"""
        self.tail = None
        self.size = 0

    def __len__(self):
        """Return number of elements in the list"""
        return self.size

    def is_empty(self):
        return self.size == 0

    def first(self):
        """Return, but do not move, the element at the front of the queue.
        :except Raise Empty exception if the queue is empty."""
        if self.is_empty():
            raise Empty("Queue is empty")
        head = self.tail.next
        return head.element

    def dequeue(self):
        """Remove and return the first element of the queue
        :except Raise Empty exception if the queue is empty"""

        if self.is_empty():
            raise Empty("Queue is empty")

        old_head = self.tail.next
        if self.size == 1:
            self.tail = None
        else:
            self.tail.next = old_head.next

        self.size -= 1
        return old_head.element

    def enqueue(self, element):
        """Add an element to the back of the queue"""
        newest = Node(element, None)
        if self.is_empty():
            #Initialize circularly
            newest.next = newest
        else:
            #New Node point to head
            newest.next = self.tail.next
            #Old tail point to new Node
            self.tail.next = newest

        #New Node becomes the tail
        self.tail = newest
        self.size += 1

    def rotate(self):
        """Rotate the front element to the back of the queue"""
        if self.size > 0:
            #Old head becomes the new tail
            self.tail = self.tail.next

    def get_list(self):
        current_node = self.tail
        while current_node != self.first():
            print(current_node.get_element())
            current_node = current_node.next

