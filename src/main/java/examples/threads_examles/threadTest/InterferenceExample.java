package examples.threads_examles.threadTest;

import java.util.concurrent.atomic.AtomicInteger;

public final class InterferenceExample {
    private static final int HUNDED_MILLION = 100000000;

    private AtomicInteger counter = new AtomicInteger();

    public boolean stop() {
        return counter.incrementAndGet() > HUNDED_MILLION;
    }

    public void example() throws InterruptedException {
        TestClassMonitor testClassMonitor = new TestClassMonitor();
        InterferenceThread thread1 = new InterferenceThread(this);
        InterferenceThread thread2 = new InterferenceThread(this, testClassMonitor);
        InterferenceThread thread3 = new InterferenceThread(this, testClassMonitor);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();

        System.out.println("Expected: " + HUNDED_MILLION);
        System.out.println("Expected: " + thread1.getI());
    }
}
