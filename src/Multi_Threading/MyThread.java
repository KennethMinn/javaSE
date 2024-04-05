package Multi_Threading;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread1 is finished");
    }
}
