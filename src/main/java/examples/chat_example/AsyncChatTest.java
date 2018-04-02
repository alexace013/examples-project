package examples.chat_example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

import static java.lang.Integer.parseInt;
import static utils.logger.Log4JWrapper.info;
import static utils.logger.Log4JWrapper.error;
import static utils.logger.Log4JWrapper.debug;
import static examples.chat_example.config.ChatConfiguration.DEFAULT_CAPACITY;
import static examples.chat_example.config.ChatConfiguration.DEFAULT_PORT;
import static examples.chat_example.config.ChatConfiguration.LOCAL_HOST;

public class AsyncChatTest implements IChat {

    @Override
    public void process() {
        final Thread server = new Thread(new ChatServer());
        final Thread client = new Thread(new ChatClient());
        server.start();
        client.start();
    }

}

class ChatClient implements Runnable {

    private static final String message = "!!! TEST MESSAGE TEXT !!!";

    ChatClient() {
    }

    @Override
    public void run() {
        try {
            SocketChannel clientChannel = SocketChannel.open();
            clientChannel.connect(new InetSocketAddress(
                    LOCAL_HOST.getConfig().toString(),
                    parseInt(DEFAULT_PORT.getConfig().toString())));
            ByteBuffer buffer = ByteBuffer.allocate(parseInt(DEFAULT_CAPACITY.getConfig().toString()));
            while (true) {
                buffer.clear();
                debug(message);
                buffer.put(message.getBytes());
                buffer.flip();
                clientChannel.write(buffer);
            }
        } catch (IOException e) {
            error(e.getMessage());
        }
    }

}

class ChatServer implements Runnable {

    ChatServer() {
    }

    @Override
    public void run() {
        try {
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.socket().bind(new InetSocketAddress(parseInt(DEFAULT_PORT.getConfig().toString())));
            SocketChannel socketChannel = serverChannel.accept();
            ByteBuffer buffer = ByteBuffer.allocate(parseInt(DEFAULT_CAPACITY.getConfig().toString()));
            while (true) {
                buffer.clear();
                info(new String(buffer.array(), 0, socketChannel.read(buffer)));
                buffer.rewind();
            }
        } catch (IOException e) {
            error(e.getMessage());
        }
    }

}