package threads.sample.sample3;

public class KeyGuard {
    private int keys;

    public KeyGuard(int keys) {
        this.keys = keys;
    }

    /**
     * A Thread may call this method
     * if there is an available key, the thread will continue
     * if there is no key available, the thread will freeze
     * until there is an available key
     */
    public synchronized void askForKey() {
        while (this.keys < 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Exited the loop, there is a key for me!
        this.keys--; // taking key
    }

    /***
     * A Thread must call this method to return the key it took
     * So that other threads will be allowed to work
     */
    public synchronized void returnKey() {
        this.notifyAll();
        this.keys++;
    }
}
