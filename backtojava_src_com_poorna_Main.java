package com.poorna;

import java.util.Scanner;

/**
 * Created by poorn on 3/2/2018.
 */
public class Main {


    public static void main(String[] args) {


        DoubleLinkedList ll = new DoubleLinkedList();
        ll.insertatHead(10);
        ll.insertatHead(20);
        ll.insertatHead(50);
        ll.insertatHead(80);
        ll.insertatTail(70);
        ll.displayForward();
        ll.displayBackward();
        System.out.println("  ");
       ll.deleteHeadNode();
        ll.displayForward();

    }
}
