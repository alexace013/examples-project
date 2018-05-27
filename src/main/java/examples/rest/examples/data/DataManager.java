package examples.rest.examples.data;

import examples.rest.examples.data.enums.DataImpl;
import examples.rest.examples.data.expection.DataException;

import static examples.rest.examples.data.enums.HeaderData.HEADER_NAME;
import static examples.rest.examples.data.enums.HeaderData.HEADER_VALUE;
import static examples.rest.examples.data.enums.ParameterData.PARAMETER_NAME;
import static examples.rest.examples.data.enums.ParameterData.PARAMETER_VALUE;
import static examples.rest.examples.data.enums.SymbolsData.UNDER_SCORE;
import static examples.rest.examples.data.enums.TestData.TEST;
import static examples.rest.examples.data.enums.UserData.USER_NAME;
import static examples.rest.examples.data.enums.UserData.USER_PASS;
import static examples.rest.examples.data.enums.NumbersData.*;

public class DataManager implements DataImpl {

    @Override
    public String getHeaderNameData() {
        return HEADER_NAME.getData();
    }

    @Override
    public String getHeaderValueData() {
        return HEADER_VALUE.getData();
    }

    @Override
    public String getParameterNameData() {
        return PARAMETER_NAME.getData();
    }

    @Override
    public String getParameterValueData() {
        return PARAMETER_VALUE.getData();
    }

    @Override
    public String getSymbolUnderSoreData() {
        return UNDER_SCORE.getSymbol();
    }

    @Override
    public String getTestData() {
        return TEST.getData();
    }

    @Override
    public String getUserNameData() {
        return USER_NAME.getData();
    }

    @Override
    public String getUserPasswordData() {
        return USER_PASS.getData();
    }

    @Override
    public byte getNumber(byte number) throws DataException {
        String result;
        switch (number) {
            case 0:
                result = NUMBER0.getData();
                break;
            case 1:
                result = NUMBER1.getData();
                break;
            case 2:
                result = NUMBER2.getData();
                break;
            case 3:
                result = NUMBER3.getData();
                break;
            case 4:
                result = NUMBER4.getData();
                break;
            case 5:
                result = NUMBER5.getData();
                break;
            case 6:
                result = NUMBER6.getData();
                break;
            case 7:
                result = NUMBER7.getData();
                break;
            case 8:
                result = NUMBER8.getData();
                break;
            case 9:
                result = NUMBER9.getData();
                break;
            default:
                throw new DataException("number must be from '0' to '9' value");
        }
        return Byte.parseByte(result);
    }

}
