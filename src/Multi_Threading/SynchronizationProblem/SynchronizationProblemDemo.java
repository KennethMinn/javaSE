package Multi_Threading.SynchronizationProblem;

public class SynchronizationProblemDemo {
    //must throw InterruptedException at current method when calling join method
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data(0);


        IncrementThread thread1 = new IncrementThread(data);
        IncrementThread thread2 = new IncrementThread(data);
        IncrementThread thread3 = new IncrementThread(data);

        // Multi-Threading (Three threads incrementing the data in parallel)
        thread1.start();
        thread2.start();
        thread3.start();

        // calling thread - wait until the specified thread dies or for x millis
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(data.value); // this line will be logged after above threads are finished
    }
}
