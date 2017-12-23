package utils.reader;

import utils.logger.Log4JWrapper;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {

    public static String readFile(final String pathToFile, final String fileName) {
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
            java.io.FileReader fileReader = new java.io.FileReader(new File(pathToFile, fileName));
        } catch (FileNotFoundException e) {
            Log4JWrapper.debug("");
            Log4JWrapper.error(e.getMessage());
        }
    }

}
