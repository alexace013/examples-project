package examples.chat_example;

public class ChatRunner {

    private static IChat chat;

    public static void main(String[] args) {
//        final boolean isTestProcess = true;
        final boolean isTestProcess = false;
        if (isTestProcess) {
            chat = new AsyncChatTest();
            chat.process();
        } else {
            chat = new AsyncChatDemo();
            chat.process();
        }
    }

}
