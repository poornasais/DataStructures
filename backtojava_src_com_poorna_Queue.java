package com.poorna;

public class Queue {

    int max;
    int[] Queueval;
    int front;
    int rear;
    int num;

    public Queue(int maxval) {
        this.max = maxval;
        this.Queueval = new int[maxval];
        this.front = -1;
        this.rear = 0;
        this.num = 0;
    }

    public void insert(int data) {
        front++;
        Queueval[front] = data;
        num++;
    }

    public void view() {
        for (int i = rear; i <= num; i++) {
            System.out.println(Queueval[rear]);
        }
    }

    public int remove() {
        int data = Queueval[rear];
        rear++;
        return data;
    }

    public int peekFront(){
        return Queueval[rear];
    }




}
