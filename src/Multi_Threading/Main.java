package Multi_Threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread1.isAlive(); // true
        thread1.start();
        thread1.join(3000); // calling thread wait until the specified thread dies or for x millis
        thread2.start();
        thread1.isAlive(); // false
    }
}
