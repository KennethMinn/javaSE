package Multi_Threading.ProducerConsumerProblem;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!this.valueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (this.valueSet) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        this.valueSet = true;
        notify();
    }
}
