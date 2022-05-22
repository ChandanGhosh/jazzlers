package com.chandanghosh.CircularQueue;

public class CCQueue {
    private final int SIZE;
    private int FRONT, REAR;
    private final int[] cQueue;

    public CCQueue(int size) {
        SIZE = size;
        cQueue = new int[SIZE];
        FRONT = -1;
        REAR = -1;
    }

    public boolean isFull() {
        if (FRONT == 0 && REAR == SIZE - 1) {
            return true;
        }
        return FRONT == REAR + 1;
    }

    public boolean isEmpty() {
        return FRONT == -1;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is already full");
            return;
        }
        if (FRONT == -1) {
            FRONT = 0;
        }
        REAR = (REAR + 1) % SIZE;
        cQueue[REAR] = num;
        System.out.println("INSERTED: " + num);
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        element = cQueue[FRONT];
        if (FRONT == REAR) {
            FRONT = -1;
            REAR = -1;
        } else {
            FRONT = (FRONT + 1) % SIZE;
        }
        return element;
    }

    public void display() {
        System.out.println(":::::::::::::::::::::::::::::::");
        int i;
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("FRONT-> " + FRONT);
        System.out.print("Items: ");
        for (i = FRONT; i != REAR; i = (i + 1) % SIZE) {
            System.out.print(cQueue[i] + " ");
        }
        System.out.println(cQueue[i]);
        System.out.println("REAR-> " + REAR);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        CCQueue cq = new CCQueue(5);
        cq.enqueue(10);
        cq.enqueue(12);
        cq.enqueue(14);
        cq.enqueue(16);
        cq.enqueue(18);

        cq.display();

        System.out.println("DEQUEUE: " + cq.dequeue());
        cq.display();

        System.out.println("DEQUEUE: " + cq.dequeue());
        cq.display();

        cq.enqueue(5);
        cq.display();

        System.out.println("DEQUEUE: " + cq.dequeue());
        cq.display();
        System.out.println("DEQUEUE: " + cq.dequeue());
        cq.display();
        System.out.println("DEQUEUE: " + cq.dequeue());
        cq.display();
        System.out.println("DEQUEUE: " + cq.dequeue());
        cq.display();
    }
}
