package com.interview.questions.array.linkedLists;

public class SinglyList {

    private int size;
    private Node head;
    private Node tail = null;
    private Node currentNode;

    public SinglyList() {
        head = null;
        size = 0;
    }

    /**
     * Add and element to the tail
     * @param element int
     */

    public void append(int element){

        if (isEmpty()) {
            head = new Node(element);
            size++;

        } else {
            currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(element);
            size++;
        }

    }

    /**
     * Return true/false if the list is empty
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Prints the list from head to tail
     */
    public void getList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    /**
     * Get the number of elelement in the list
     * @return int size
     */
    public int len(){
        return size;
    }

    public Node deletNode(int toDetele) {
        Node current = head;

        if (current.getData() == toDetele) {
            return head.next;
        }

        while (current.next != null) {
            if (current.next.getData() == toDetele) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return head;
    }

    public void removeDuplicate() {
        Node current = head;
        Node duplicate = null;


    }

    public void kthToLast(int start) {
        int count = 0;
        Node current = head;

        while(current != null) {
            if(count < start) {
                current = current.next;
                count++;
            } else if (count >= start) {
                System.out.println(current.getData());
                current = current.next;
                count++;
            }
        }
    }

    public int recursiveKToLast(Node head, int k) {
        if (head == null) {
            return 0;
        }
        int index = recursiveKToLast(head.next, k) + 1;
        if (index == k) {
            System.out.println(head.getData());
        }
        return index;
    }

}
