package Multi_Threading.SynchronizationProblem;

public class IncrementThread extends Thread {
    Data data;

    //constructor
    public IncrementThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //this.data.value++; not atomic operation

            //protected (protecting from other threads that are overriding the value)
            synchronized (this.data) { //not multi-threading anymore(only this specific place)
                this.data.value++; // this is now atomic operation
            }
        }
    }
}
