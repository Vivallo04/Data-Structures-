from Data_Structures.DoublyLinkedList.Node import *

class DoublyLinkedList:
    #A base class providing a Doubly Linked List representation

    #Inserting and deleting with a DLL:
    """Every insertion into de DLL will take place between a pair of
    existing Nodes. The insertion of the new Node is made between
    the header and the node that is currently after the header."""

    def __init__(self):
        #Create an empty list
        self.header = Node(None, None, None)
        self.trailer = Node(None, None, None)
        self.header.next = self.trailer
        self.trailer.previous = self.header
        self.size = 0

    def __len__(self):
        #Return de number of elements in the list
        return self.size

    def is_empty(self):
        #Return True if list is empty
        return self.size == 0

    def insert_between(self, element, predecessor, successor):
        # Add :param element between 2 existing Nodes and return the new Node

        #Linked to neighbors
        newest = Node(element, predecessor, successor)
        predecessor.next = newest
        successor.previous = newest
        self.size += 1

        return newest

    def delete_node(self, node):
        #Delete non-sentinel node from the list and return its elements.
        predecessor = node.previous
        successor = node.next

        predecessor.next = successor
        successor.previous = predecessor

        self.size -= 1
        #Record the deleted element
        element = node.element
        #Deprecate Node
        node.previous = node.next = node.element = None

        #Return the deleted element
        return element

    def get_list(self):
        current_node = self.header
        while current_node != self.trailer:
            print(current_node.get_element())
            current_node = self.header.next
