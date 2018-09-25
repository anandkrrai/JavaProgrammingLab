package Lab03;

public class Producer implements Runnable{
    Item objectItem;

    public Producer(Item objectItem) {
        this.objectItem = objectItem;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Putting the value in item - " + i);
            objectItem.setContent(i);
        }
    }
}
