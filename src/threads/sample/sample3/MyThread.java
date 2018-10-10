package threads.sample.sample3;

public class MyThread extends Thread {

    private KeyGuard keyGuard;

    public MyThread(KeyGuard keyGuard) {
        this.keyGuard = keyGuard;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": waiting for a key...");

        keyGuard.askForKey(); // Thread might get stuck here for a while

        System.out.println(name + ": got the key! Starting work!");

        // sleep for 3 seconds
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + ": done! returning key");
        keyGuard.returnKey();

    }
}
