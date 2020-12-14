class Node:

    def __init__(self, element, previous, next):
        self.element = element
        self.previous = previous
        self.next = next

    def get_element(self):
        return self.element
