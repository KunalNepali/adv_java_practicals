class SharedResource {
    synchronized void synchronizedMethod(String threadName) {
        System.out.println(threadName + " is executing synchronized method.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void synchronizedBlock(String threadName) {
        synchronized (this) {
            System.out.println(threadName + " is executing synchronized block.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(() -> resource.synchronizedMethod("Thread-1"));
        Thread thread2 = new Thread(() -> resource.synchronizedBlock("Thread-2"));

        thread1.start();
        thread2.start();
    }
}