package examples.chat_example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

import utils.logger.Log4JWrapper;

import static examples.chat_example.config.ChatConfiguration.LOCAL_HOST;
import static examples.chat_example.config.ChatConfiguration.DEFAULT_PORT;
import static examples.chat_example.config.ChatConfiguration.DEFAULT_CAPACITY;
import static examples.chat_example.config.ChatConfiguration.COMMAND_EXIT;

public class AsyncChatDemo implements IChat {

    @Override
    public void process() {
        Thread server = new Thread(new DemoServer());
        Thread client = new Thread(new DemoClient());
        server.start();
        client.start();
    }

}

class DemoServer implements Runnable {

    @Override
    public void run() {
        try {
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.socket().bind(new InetSocketAddress((int) DEFAULT_PORT.getConfig()));
            SocketChannel client = serverChannel.accept();
            ByteBuffer buffer = ByteBuffer.allocate((int) DEFAULT_CAPACITY.getConfig());
            while (true) {
                buffer.clear();
                System.out.print("\n[SERVER] Message: " + new String(buffer.array(), 0, client.read(buffer)));
                buffer.rewind();
            }
        } catch (IOException e) {
            Log4JWrapper.error(e.getMessage());
        }
    }

}

class DemoClient implements Runnable {

    @Override
    public void run() {
        try {
            SocketChannel clientChannel = SocketChannel.open();
            clientChannel.connect(new InetSocketAddress((String) LOCAL_HOST.getConfig(), (int) DEFAULT_PORT.getConfig()));
            ByteBuffer buffer = ByteBuffer.allocate((int) DEFAULT_CAPACITY.getConfig());
            Scanner scanner = new Scanner(System.in);
            while (true) {
                buffer.clear();
                System.out.print("[CLIENT] Enter message: ");
                if (scanner.hasNext()) {
                    final String message = scanner.nextLine();
                    exit(message);
                    buffer.put(message.getBytes());
                    buffer.flip();
                    clientChannel.write(buffer);
                }
            }
        } catch (IOException e) {
            Log4JWrapper.error(e.getMessage());
        }
    }

    static boolean isExit(final String text) {
        return text.equals(COMMAND_EXIT.getConfig().toString());
    }

    private static void exit(final String text) {
        if (isExit(text)) {
            System.exit(0);
        }
    }

}