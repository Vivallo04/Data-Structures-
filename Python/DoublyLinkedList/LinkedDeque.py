from Data_Structures.DoublyLinkedList.DoublyLinkedList import *

class LinkedDeque(DoublyLinkedList):
    #Double-ended queue implementation based on a DLL

    def first(self):
        if self.is_empty():
            raise TypeError("Deque is empty")
        #Return the real item just after the header
        return self.header.next.element

    def last(self):
        #Return, but do not move, the element at the back of the deque
        if self.is_empty():
            raise TypeError("Deque is empty")

        return self.trailer.previous.element

    def insert_first(self, element):
        #Add :param element to the back of the deque
        #After the header
        self.insert_between(element, self.header, self.header.next)

    def insert_last(self, element):
        #Add the element to the back of deque
        self.insert_between(element, self.trailer.previous, self.trailer)

    def delete_first(self):
        #Remove and return the element from the front
        if self.is_empty():
            raise TypeError("Deque is empty")
        #Use inherited method
        return self.delete_node(self.header.next)

    def delete_last(self):
        """Remove and return the element from the back.
        :except Raise TypeError if the deque is empty. """

        if self.is_empty():
            raise TypeError("Deque is empty")
        #Use inherited method
        return self.delete_node(self.trailer.previous)


