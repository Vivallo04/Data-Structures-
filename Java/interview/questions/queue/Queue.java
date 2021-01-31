package com.interview.questions.queue;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;


    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        if (last != null) {
            last.next = newNode;
        }

        last = newNode;
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();

        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            return first.data;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

}
