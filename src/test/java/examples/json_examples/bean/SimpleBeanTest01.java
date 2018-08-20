package examples.json_examples.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

@Log4j
public class SimpleBeanTest01 {

    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws JsonProcessingException {
        SimpleBean01 testBean = new SimpleBean01();
        Map<String, String> beanMap = testBean.getProperties();
        beanMap.put("name", "simple");
        beanMap.put("attribute1", String.valueOf(10));
        beanMap.put("attribute2", String.valueOf(false));
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(beanMap);
        log.debug(jsonData);
        Assert.assertNotNull(jsonData);
    }
}
