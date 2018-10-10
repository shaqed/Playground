package threads.sample.sample2;

public class SharedData {
    // n is public
    // and NOT thread safe

    public int n;

    public SharedData() {
        this.n = 0;
    }


}
