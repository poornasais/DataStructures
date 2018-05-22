package com.poorna;

public class DoubleLinkedList {


    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertatHead(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertatTail(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public void deleteHeadNode() {
        Node temp = head;
        if (head.next == null) {
            tail = null;
        } else {
            head.next.previous = null;
        }

        head = head.next;
        System.out.println("Head Node Removed .. " + temp.data);
    }

    public void deleteatTail() {
        if (tail.previous == null) {
            head = null;
        } else {
            tail.previous.next = null;
        }

        tail = tail.previous;

    }

    public void insertAfter(int key, int data) {
        Node current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                System.out.println("Its empty");
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if (current == tail) {
            current.next = null;
            tail = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;

    }

    public void deleteKey(int key) {
        Node current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                System.out.println("Is Empty!");
            }
        }

        if (current == tail) {
            tail = current.previous;
            tail.next = null;
        } else if (current == head) {
            head = current.next;
            head.previous = null;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;

        }
    }


    public void displayForward(){
        Node current = head;
        System.out.print("[ ");
        while (current !=null){
            System.out.print(current.data+ " - >");
            current= current.next;
        }
        System.out.print(" ]");
    }

    public void displayBackward(){
        Node current = tail;
        System.out.print(" [");
        while (current!=null){
            System.out.print(current.data+"< -" );
            current = current.previous;
        }
        System.out.print(" ]");
    }

}
