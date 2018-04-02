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
import static examples.chat_example.config.ChatConfiguration.EXIT;

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
            ServerSocketChannel socketChannel = ServerSocketChannel.open();
            socketChannel.socket().bind(new InetSocketAddress((int) DEFAULT_PORT.getConfig()));
            SocketChannel client = socketChannel.accept();
            ByteBuffer buffer = ByteBuffer.allocate((int) DEFAULT_CAPACITY.getConfig());
            while (true) {
                buffer.clear();
                System.out.println("Message: " + new String(buffer.array(), 0, client.read(buffer)));
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
            SocketChannel chan = SocketChannel.open();
            chan.connect(new InetSocketAddress((String) LOCAL_HOST.getConfig(), (int) DEFAULT_PORT.getConfig()));
            ByteBuffer bf = ByteBuffer.allocate((int) DEFAULT_CAPACITY.getConfig());
            while (true) {
                bf.clear();
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter message: ");
                if (scan.hasNext()) {
                    bf.put(scan.next().getBytes());
                    bf.flip();
                    chan.write(bf);
                    // TODO feature with 'exit' text
//                    exitCheck(scan.nextLine());
                }
            }
        } catch (IOException e) {
            Log4JWrapper.error(e.getMessage());
        }
    }

    // TODO feature with 'exit' text
    private static void exitCheck(final String text) {
        if (text.equals(EXIT.getConfig().toString())) {
            System.exit(0);
        }
    }

}