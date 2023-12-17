package Stack;

import java.util.*;

interface Stack {
    void push(int item);

    int pop();

    int peek();

    boolean isEmpty();

    int size();
}

class ArrayStack implements Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
            System.out.println(item + " pushed to the stack");
        } else {
            System.out.println("Stack is full. Cannot push " + item);
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int poppedItem = stackArray[top--];
            System.out.println(poppedItem + " popped from the stack");
            return poppedItem;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    @Override
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}

class MyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int s = sc.nextInt();
        Stack stack = new ArrayStack(s);
        while (true) {
            System.out.print("Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit");
            System.out.println("\nEnter choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter an element to push: ");
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Top element: " + stack.peek());
                    break;
                case 4:
                    System.out.println("Stack size: " + stack.size());
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

/*
 * Enter size: 5
 * Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit
 * Enter choice:
 * 1
 * Enter an element to push: 56
 * 56 pushed to the stack
 * Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit
 * Enter choice:
 * 1
 * Enter an element to push: 35
 * 35 pushed to the stack
 * Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit
 * Enter choice:
 * 4
 * Stack size: 2
 * Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit
 * Enter choice:
 * 3
 * Top element: 35
 * Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit
 * Enter choice:
 * 2
 * 35 popped from the stack
 * Press: 1. Push, 2. Pop, 3. Peek, 4. Stack size, 5. Exit
 * Enter choice:
 * 5
 */
