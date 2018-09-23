package examples.json_examples.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;

@Log4j
public class SimpleBean03Test {

    @Test
    public void whenSerializingUsingJsonPropertyOrder_thenCorrect()
            throws JsonProcessingException {
        SimpleBean03 testBean = new SimpleBean03();
        testBean.id = 10;
        testBean.name = "simple";
        String jsonData = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(testBean);
        log.debug(jsonData);
        Assert.assertNotNull(jsonData);
    }
}
