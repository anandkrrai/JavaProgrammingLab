package Lab01;

public class Stack {
    private int stack[];
    private int top = -1;
    private int size;

    public Stack(int size) {
        stack = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int data) {
        if (top >= size - 1) {
            System.out.println("Error: Stack overflow");
        } else {
            stack[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: Stack underflow");
            return Integer.MIN_VALUE;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: Stack empty");
            return Integer.MIN_VALUE;
        } else {
            return stack[top];
        }
    }
}
