package com.poorna;

public class StackUsingLinked {

    SingleLinkedList list = new SingleLinkedList();
    int temp;

    public StackUsingLinked() {

    }


    public void push(int data) {
        list.insertatHead(data);
    }

    public void pop() {
        list.deleteFirst();
    }

    public int peek() {
        int val = list.head.data;
        return val;
    }

    public void display() {
        list.displayLinkedList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


}
