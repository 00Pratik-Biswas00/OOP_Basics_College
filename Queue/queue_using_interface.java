package Queue;

import java.util.*;

interface Queue {
    void enqueue(int item);

    int dequeue();

    int front();

    boolean isEmpty();

    int size();
}

class ArrayQueue implements Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    private int currentSize;

    public ArrayQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    @Override
    public void enqueue(int item) {
        if (currentSize < maxSize) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = item;
            currentSize++;
            System.out.println(item + " enqueued to the queue");
        } else {
            System.out.println("Queue is full. Cannot enqueue " + item);
        }
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedItem = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            currentSize--;
            System.out.println(dequeuedItem + " dequeued from the queue");
            return dequeuedItem;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
    }

    @Override
    public int front() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. Cannot retrieve front.");
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public int size() {
        return currentSize;
    }
}

class MyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int s = sc.nextInt();
        Queue queue = new ArrayQueue(s);
        while (true) {
            System.out.print("Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit");
            System.out.print("\nEnter choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter an element to enqueue: ");
                    int item = sc.nextInt();
                    queue.enqueue(item);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Front element: " + queue.front());
                    break;
                case 4:
                    System.out.println("Queue size: " + queue.size());
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

/*
 * Enter size: 5
 * Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit
 * Enter choice: 1
 * Enter an element to enqueue: 23
 * 23 enqueued to the queue
 * Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit
 * Enter choice: 1
 * Enter an element to enqueue: 54
 * 54 enqueued to the queue
 * Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit
 * Enter choice: 3
 * Front element: 23
 * Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit
 * Enter choice: 4
 * Queue size: 2
 * Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit
 * Enter choice: 2
 * 23 dequeued from the queue
 * Press: 1. Enqueue, 2. Dequeue, 3. Front, 4. Queue size, 5. Exit
 * Enter choice: 5
 */