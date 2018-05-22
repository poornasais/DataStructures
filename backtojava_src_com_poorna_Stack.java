package com.poorna;

public class Stack {

    int maxvalue;
    int[] stackval;
    int top;


    public Stack(int max) {
        this.maxvalue = max;
        this.stackval = new int[max];
        this.top = -1;
    }

    public int push(int data) {
        if (!isFull()) {
            top++;
            stackval[top] = data;
            return stackval[top];
        } else
            System.out.println("The Stack is Full!!!");
        return -1;
    }

    public int pop() {
        if (!isEmpty()) {
            int d = stackval[top];
            top--;
            return d;
        } else {
            System.out.println("No value in the Stack!!");
            return -1;
        }
    }

    public int peek() {
        return stackval[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top + 1 == maxvalue;
    }
}
