class Tree:
    """An abstract base class representing a tree structure"""
    def is_root(self, p):
        """Return True if Position p represents the root of the tree"""
        return self.root() == p
    
