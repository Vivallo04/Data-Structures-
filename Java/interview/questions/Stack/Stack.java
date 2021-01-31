package com.interview.questions.Stack;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;


    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        Node<T> node = new Node<T>(item);
        node.next = top;
        top = node;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        } else {
            return top.data;
        }
    }




}
