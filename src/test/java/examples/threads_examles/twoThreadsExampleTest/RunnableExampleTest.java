package examples.threads_examles.twoThreadsExampleTest;

import examples.threads_examles.twoThreadsExample.RunnableExample;

public class RunnableExampleTest {

    public static void main(String[] args) {

        RunnableExample runnable = new RunnableExample();
        new Thread(runnable.firstThread).start();
        new Thread(runnable.secondThread).start();

    }

}
