package examples.com.javacodegeeks.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class InfoReaderUtil {

    private static final Logger LOG = LogManager.getLogger(InfoReaderUtil.class);

    @NotNull
    @Contract("null -> fail")
    public static String getInfoText(final File infoFile) throws InfoReaderException {
        if (infoFile == null) {
            throw new InfoReaderException("INFO FILE IS ABSENT");
        }
        StringBuilder resBuilder = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(infoFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                resBuilder.append(text + "\n");
            }
        } catch (IOException e) {
            LOG.debug(String.format("!!! something wrong with the <%s> file !!!", infoFile.getName()));
            LOG.error(e);
        }
        return resBuilder.toString();
    }

}

class InfoReaderException extends Exception {
    InfoReaderException(final String msg) {
        super(String.format("INFO_READER_EXCEPTION: %s", msg));
    }
}
