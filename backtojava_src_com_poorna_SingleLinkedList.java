package com.poorna;

public class SingleLinkedList {

    Node head;
    Node Tail;


    public boolean isEmpty() {
        return (head == null);
    }


    public void insertatHead(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            Tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }


    public void displayLinkedList() {
        Node current = head;
        System.out.println("first-> Last");
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println(" ]");
    }

    public void insertatTail(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            head = newNode;
        } else {
            Tail.next = newNode;
            Tail = newNode;
        }
    }

    public void deleteFirst() {
        try {
            if (head == null) {
                Tail = null;
            }
            head = head.next;
        } catch (NullPointerException e) {
            System.out.println("Empty Linked List!!");
        }
    }

}
