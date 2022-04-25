public class ThreadingLifeCycle {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi from Thread 1");
                try {
                    Thread.sleep(1000);
                } catch (Exception ignored) {
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from Thread 2");
                try {
                    Thread.sleep(2000);
                } catch (Exception ignored) {
                }
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Two Threads completed. Bye");
    }

}

class ThreadingExample extends Thread {

    private int seconds;


    public ThreadingExample(int seconds) {
        System.out.println("The state of the Thread - Before starting the work " + getState());
        this.seconds = seconds;

    }

    @Override
    public void run() {
        startWork();
        System.out.println("After completing the work " + getState());
    }

    private void startWork() {
        System.out.println("During working " + getState());
        for (int i = 0; i < seconds; i++) {
            System.out.println("Thread is running " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }

            System.out.println("After calling sleep " + getState());
        }
    }
}
