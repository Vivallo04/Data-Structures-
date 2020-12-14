"""Data Structures in Python. Singly List Node"""

class Node:
    def __init__(self, element, next):
        #Reference to user's element
        self.element = element

        #Reference to next node
        self.next = next

    def get_element(self):
        return self.element
