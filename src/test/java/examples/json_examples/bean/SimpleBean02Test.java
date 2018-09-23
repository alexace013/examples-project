package examples.json_examples.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;

@Log4j
public class SimpleBean02Test {

    @Test
    public void whenSerializingUsingJsonGetter_thenCorrect()
            throws JsonProcessingException {
        SimpleBean02 testBean = new SimpleBean02();
        testBean.setId((int) (Math.random() * Integer.MAX_VALUE));
        testBean.setName("simple");
        String jsonData = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(testBean);
        log.debug(jsonData);
        Assert.assertNotNull(jsonData);
    }
}
