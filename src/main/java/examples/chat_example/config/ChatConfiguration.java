package examples.chat_example.config;

import lombok.Getter;

@Getter
public enum ChatConfiguration {

    DEFAULT_CAPACITY(100),
    DEFAULT_PORT(30000),
    LOCAL_HOST("localhost"),
    EXIT("exit");

    private Object config;

    ChatConfiguration(final Object config) {
        this.config = config;
    }

}