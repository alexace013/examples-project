package examples.jdbc.user;

import utils.generator.NameGenerator;
import utils.logger.Log4JWrapper;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class UserJDBCDemo {

    private static UserJDBCManager userJDBCManager = new UserJDBCManager();

    public static void main(String[] args) {
        for (int i = 15; i <= 1000; i++) {
            User user = new User();
            user.setId(generateID(i));
            user.setId_code((int) UUID.randomUUID().getMostSignificantBits());
            user.setId_passport(generateID() + "-test");
            user.setFirst_name(new NameGenerator().generateFirstName());
            user.setLast_name(new NameGenerator().generateLastName());
            boolean isCreated = userJDBCManager.isUserCreate(user);
            Log4JWrapper.info("is created " + isCreated);
        }
    }

    private static int generateID() {
        return generateID(4);
    }

    private static int generateID(final int index) {
        final AtomicInteger id = new AtomicInteger(index);
        return id.incrementAndGet();
    }

}
