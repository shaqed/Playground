package threads.sample.sample3;

public class Mainer {
    public static void main(String[] args) {
        // Created a keyguard with 3 keys available
        KeyGuard keyGuard = new KeyGuard(3);

        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < threads.length; i++) {
            // Give each thread a reference to the keyguard
            // the SAME key guard
            threads[i] = new MyThread(keyGuard);
        }

        for(MyThread t : threads) {
            t.start();
        }

        for (MyThread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Bye!");
    }

    /*
    * You can expect an output like this:
    *
Thread-5: waiting for a key...
Thread-2: waiting for a key...
Thread-6: waiting for a key...
Thread-9: waiting for a key...
Thread-0: waiting for a key...
Thread-8: waiting for a key...
Thread-7: waiting for a key...
Thread-1: waiting for a key...
Thread-6: got the key! Starting work!
Thread-5: got the key! Starting work!
Thread-2: got the key! Starting work!
Thread-4: waiting for a key...
Thread-3: waiting for a key...
Thread-6: done! returning key
Thread-5: done! returning key
Thread-2: done! returning key
Thread-9: got the key! Starting work!
Thread-1: got the key! Starting work!
Thread-7: got the key! Starting work!
Thread-9: done! returning key
Thread-1: done! returning key
Thread-3: got the key! Starting work!
Thread-7: done! returning key
Thread-0: got the key! Starting work!
Thread-4: got the key! Starting work!
Thread-4: done! returning key
Thread-0: done! returning key
Thread-3: done! returning key
Thread-8: got the key! Starting work!
Thread-8: done! returning key
Bye!

Process finished with exit code 0
    * */
}
