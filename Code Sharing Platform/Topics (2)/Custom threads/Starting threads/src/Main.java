public class Main {

    public static void main(String[] args) {

        // create threads and start them using the class RunnableWorker
        Thread thread = new Thread(new RunnableWorker(), "worker-?");
        Thread thread1 = new Thread(new RunnableWorker(), "worker-?");
        Thread thread2 = new Thread(new RunnableWorker(), "worker-?");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

// Don't change the code below       
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}