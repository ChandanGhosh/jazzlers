package com.chandanghosh.stack;

public class Stack
{
    private final int[] stack;
    private final int capacity;
    private int top;

    public Stack(int size)
    {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(9);

        stack.print();

        stack.pop();
        stack.pop();

        stack.print();
    }

    public void push(int num)
    {
        if (!isFull())
        {
            stack[++top] = num;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
    }

    public int pop()
    {
        if (!isEmpty())
        {
            return stack[top--];
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("The stack is empty");
        }
    }

    public void print()
    {
        for (int i = 0; i <= top; i++)
        {
            System.out.println(stack[i]);
        }
    }

    private boolean isEmpty()
    {
        return top == -1;
    }

    private boolean isFull()
    {
        return top == capacity - 1;
    }
}
