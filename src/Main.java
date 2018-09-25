import Lab01.Queue;
import Lab01.Stack;
import Lab03.Consumer;
import Lab03.Item;
import Lab03.Producer;
import Lab04.OddIntegerException;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // executeLab01();

        // executeLab03();

        // executeLab04();
    }

    private static void executeLab04() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        String message = sayHello(name);
        System.out.println(message);

        try {
            int num = name.length();
            if (num % 2 != 0)
                throw new OddIntegerException("Your name is odd!");
        } catch (OddIntegerException e) {
            e.printStackTrace();
        }finally {
            System.out.println("You're welcome");
        }
    }

    private static String sayHello(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("Null string");
        }
        return "Hello, " + name;
    }

    private static void executeLab03() {
        Item item = new Item();
        Producer producer = new Producer(item);
        Consumer consumer = new Consumer(item);

        Thread pThread = new Thread(producer);
        Thread cThread = new Thread(consumer);

        pThread.start();
        cThread.start();
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
