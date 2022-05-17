package com.chandanghosh.queue;

public class Queue {
    private final int[] queue;
    private int front;
    private int rear;
    private final int capacity;

    public Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("The queue is full");
            return;
        }

        queue[++rear] = num;
        if (rear == 0) {
            front = rear;
        }

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        int element = queue[front];
        if (front >= rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return element;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        }
        System.out.println("FRONT index: " + front);
        int i;
        for (i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
        System.out.println("REAR index: " + rear);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(15);

        queue.display();

        int elem = queue.dequeue();
        System.out.println("Deleted-> " + elem);
        queue.display();
    }

}
