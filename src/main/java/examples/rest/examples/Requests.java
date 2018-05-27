package examples.rest.examples;

import examples.rest.examples.data.DataManager;
import examples.rest.examples.data.expection.DataException;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Log4j2
public class Requests {

    private DataManager dataManager = new DataManager();

    @GET
    @Path("https://httpbin.org/get")
    @Produces(MediaType.APPLICATION_JSON)
    public ExampleEntity getTestEntityJSON() {
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setUserName(dataManager.getUserNameData());
        exampleEntity.setUserPass(dataManager.getUserPasswordData());
        exampleEntity.setHeader(dataManager.getHeaderNameData());
        exampleEntity.setHeaderValue(dataManager.getHeaderValueData());
        try {
            exampleEntity.setParam1(dataManager.getParameterNameData() +
                    dataManager.getNumber((byte) 1));
            exampleEntity.setParam1value(dataManager.getParameterValueData() +
                    dataManager.getNumber((byte) 1));
            exampleEntity.setParam2(dataManager.getParameterNameData() +
                    dataManager.getNumber(Byte.parseByte(String.valueOf(2))));
            exampleEntity.setParam2value(dataManager.getParameterValueData() +
                    dataManager.getNumber(Byte.parseByte(String.valueOf(2))));
        } catch (DataException e) {
            log.debug(e);
        }
        return exampleEntity;
    }

}
