package examples.rest.examples.data.enums;

import examples.rest.examples.data.expection.DataException;

public interface DataImpl {

    String getHeaderNameData();

    String getHeaderValueData();

    String getParameterNameData();

    String getParameterValueData();

    String getSymbolUnderSoreData();

    String getTestData();

    String getUserNameData();

    String getUserPasswordData();

    byte getNumber(byte number) throws DataException;

}
