package threads.sample.sample2;

public class MyThread extends Thread {
    private SharedData data;

    public MyThread(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i =0; i < 50; i++) {
            // Synchronization happens on the OBJECT
            synchronized (data) {
                // Only 1 thread is allowed inside this chunk of code
                // Incrementation is safe
                this.data.n++;
            }
        }
    }
}
