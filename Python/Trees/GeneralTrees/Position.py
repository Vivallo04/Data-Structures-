class Position:
    """An abstraction representing the location of a single element"""

    def element(self):
        """Return the element stored at Position"""
        raise NotImplementedError("Must be implemented by subclass")

    def __eq__(self, other):
        """Return True if other Position represents the same location"""
        raise NotImplementedError("Must be implemented by subclass")

    def __ne__(self, other):
        """Return True if other does not represent the same location"""
        #Opposite of __eq__
        return not(self == other)
