package threads.sample.sample1;

/***
 * Create your own Thread class by extending the java Thread class
 * Or implementing the Runnable interface.
 * After doing either of these, you have to override the run() method.
 * ONLY code inside of the run() method will run on the separate thread
 *
 *
 * For this example we're extending the Thread class
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Hi there my name is " + threadName);

        try {
            // Pretend to do extensive work for 2 seconds
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread: " + threadName + " is done");
    }
}
