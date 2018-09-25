import Lab01.Queue;
import Lab01.Stack;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // executeLab01();

    }

    private static void executeLab01() {
        Stack s = new Stack(2);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek() + " Top of stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");

        System.out.println("=================================================");

        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue\n");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}
