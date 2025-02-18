
class MyData {
    private int value;
    private boolean flag = true;
    
    public synchronized void set(int v) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        value = v;
        flag = false;
        System.out.println("Produced: " + v);
        notify();
    }
    
    public synchronized int get() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        flag = true;
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class Producer extends Thread {
    private final MyData data;
    
    public Producer(MyData d) {
        this.data = d;
    }
    
    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            count++;
            try {
                Thread.sleep(500); // Simulating production time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private final MyData data;
    
    public Consumer(MyData d) {
        this.data = d;
    }
    
    public void run() {
        while (true) {
            data.get();
            try {
                Thread.sleep(800); // Simulating consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class InterProcessPractice1 {
    public static void main(String[] args) {
        MyData data = new MyData();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        
        producer.start();
        consumer.start();
    }
}
