package utils.reader;

import utils.logger.Log4JWrapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileReaderUtil {

    private static BufferedReader bufferedReader;

    public static List<String> readFile(final String pathToFile, final String fileName) {
        List<String> readFileDataAsList = Collections.emptyList();
        if (pathToFile == null) {
            try {
                throw new Exception(String.format("path to file < %s > is NULL", pathToFile));
            } catch (Exception e) {
                Log4JWrapper.error(e.getMessage());
            }
        } else if (fileName == null) {
            try {
                throw new Exception(String.format("file name < %s > is NULL", fileName));
            } catch (Exception e) {
                Log4JWrapper.error(e.getMessage());
            }
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(pathToFile, fileName)));
            String currentLine;
            readFileDataAsList = new ArrayList<>();
            while ((currentLine = bufferedReader.readLine()) != null) {
                readFileDataAsList.add(currentLine);
            }
        } catch (IOException e) {
            Log4JWrapper.debug(String.format("path to file < %s > or file name < %s > are failed", pathToFile, fileName));
            Log4JWrapper.error(e.getMessage());
        }
        return readFileDataAsList;
    }

    @Override
    protected void finalize() throws Throwable {
        bufferedReader.close();
    }
}
