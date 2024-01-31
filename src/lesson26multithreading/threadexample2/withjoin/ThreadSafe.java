package lesson26multithreading.threadexample2.withjoin;

public class ThreadSafe {
    private int count = 0;

    public void runThreads() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    count++;
                    //count = count + 1
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    count++;
                    //count = count + 1
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Value of Count variable is: " + count);
    }


    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.runThreads();
    }
}
