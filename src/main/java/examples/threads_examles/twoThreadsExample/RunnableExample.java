package examples.threads_examles.twoThreadsExample;

public class RunnableExample {

    public final Runnable firstThread;
    public final Runnable secondThread;

    public RunnableExample() {
        firstThread = new Runnable() {
            @Override
            public void run() {
                RunnableExample.this.getFirstThread();
            }
        };
        secondThread = new Runnable() {
            @Override
            public void run() {
                RunnableExample.this.getSecondThread();
            }
        };
    }

    public void getFirstThread() {
        System.out.println("first thread");
    }

    public void getSecondThread() {
        System.out.println("second thread");
    }

}
