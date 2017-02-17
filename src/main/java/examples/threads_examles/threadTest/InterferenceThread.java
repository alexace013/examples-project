package examples.threads_examles.threadTest;

public class InterferenceThread extends Thread {
    private final InterferenceExample checker;
    private TestClassMonitor testClassMonitor;
    private static int i;

    public InterferenceThread(InterferenceExample checker) {
        this.checker = checker;
        this.testClassMonitor = new TestClassMonitor();
    }

    public InterferenceThread(InterferenceExample checker, TestClassMonitor testClassMonitor) {
        this.checker = checker;
        this.testClassMonitor = testClassMonitor;
    }

    public void run() {
        while (!checker.stop()) {
            //logic
            increment();
        }
    }

    private void increment() {
        synchronized (testClassMonitor) {
            i++;
        }
    }

    public static int getI() {
        return i;
    }
}
