class ThreadingMethod1 extends Thread {

    int seconds;
    CallBack callBack;

    ThreadingMethod1(int seconds, CallBack callBack) {
        this.seconds = seconds;
        this.callBack = callBack;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " Running");
        for (int i = 0; i < seconds; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("End of run");
        callBack.onEnd();
    }
}

class ThreadingMethod2 implements Runnable {

    int seconds;

    ThreadingMethod2(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        for (int i = 0; i < seconds; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }
}

public class Threading implements CallBack {

    public static void main(String[] args) {
        Threading threading = new Threading();
        threading.main(new String[]{}, 1);
    }

    ThreadingMethod1 method1;

    public void main(String[] args, int a) {
        method1 = new ThreadingMethod1(3, this);
        method1.start();
    }


    @Override
    public void onEnd() {

            method1.run();


    }
}


interface CallBack {
    public void onEnd();
}