package examples.rest.examples;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

@Log4j2
public class RequestsTests {

    private Requests requests;

    @Test
    public void test01() {
        requests = new Requests();
        final ExampleEntity exampleEntity = requests.getTestEntityJSON();
        log.info(exampleEntity.toString());
    }


}
