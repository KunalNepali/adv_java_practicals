class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
                if (i == 3) {
                    Thread.yield(); // yield control to another thread
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WaitNotifyTask {
    synchronized void performTask() {
        try {
            System.out.println("Waiting for notification...");
            wait(); // make the thread wait
            System.out.println("Task resumed after notification.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyTask() {
        System.out.println("Sending notification...");
        notify();
    }
}

public class ThreadControlExample {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        WaitNotifyTask waitNotifyTask = new WaitNotifyTask();

        thread1.start();
        thread2.start();

        new Thread(() -> {
            waitNotifyTask.performTask();
        }).start();

        new Thread(waitNotifyTask::notifyTask).start();
    }
}