class SharedData {
    int data;
    boolean available = false;

    // Consumer waits until data is available
    synchronized void consume() {
        try {
            while (!available) {
                wait();  // wait until producer produces
            }
            System.out.println("Consumed: " + data);
            available = false;
            notify();  // notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Producer waits if data is not consumed
    synchronized void produce(int value) {
        try {
            while (available) {
                wait();  // wait until consumer consumes
            }
            data = value;
            System.out.println("Produced: " + data);
            available = true;
            notify();  // notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Thread for producing data
class Producer extends Thread {
    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

// Thread for consuming data
class Consumer extends Thread {
    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

public class InterThreadExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}

