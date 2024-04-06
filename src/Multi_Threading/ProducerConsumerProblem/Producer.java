package Multi_Threading.ProducerConsumerProblem;

public class Producer extends Thread {
    Q q;

    Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("put" + i);
            q.put(i);
        }
    }
}
