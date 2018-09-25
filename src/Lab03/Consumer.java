package Lab03;

public class Consumer implements Runnable {
    Item objectItem;

    public Consumer(Item objectItem) {
        this.objectItem = objectItem;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Getting the value in item - " + objectItem.getContent());
        }
    }
}
