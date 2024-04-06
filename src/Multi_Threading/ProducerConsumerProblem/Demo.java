package Multi_Threading.ProducerConsumerProblem;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Q queue = new Q();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);

        p.start();
        c.start();

        p.join();
        c.join();
    }
}
