package Multi_Threading.ProducerConsumerProblem;

public class Consumer extends Thread {
    Q q;

    Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(q.get());
        }
    }
}
