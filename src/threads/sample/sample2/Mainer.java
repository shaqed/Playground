package threads.sample.sample2;

public class Mainer {

    public static void main(String[] args) {

        SharedData sharedData = new SharedData(); // only 1 data object created


        // Create 10 MyThread objects
        // They will NOT start to run just yet
        MyThread[] threads = new MyThread[2];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(sharedData);
        }

        for(MyThread t : threads) {
            t.start(); // we call start() even though we've overwritten "run()"
        }

        for(MyThread t : threads) {
            // the x.join() method will make the caller thread
            // To wait until the thread 'x' will finish its work
            try {
                t.join();   // Prevents the main thread from running
                // until 't' finishes its work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main is done: " + sharedData.n);
    }
}
