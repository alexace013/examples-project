package examples.com.javacodegeeks.examle001;

import examples.com.javacodegeeks.utils.exceptions.InfoReaderException;
import examples.com.javacodegeeks.utils.InfoReaderUtil;
import examples.com.javacodegeeks.utils.ProjectDirPathUtil;
import utils.logger.Log4JWrapper;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class DiffBetweenPath {

    private File file;
    private static final String FILE_PATH = "/src/main/java/examples/com/javacodegeeks/examle001/";
    private static final String FILE_NAME = "info001.txt";

    public void createFile() {
        file = new File(ProjectDirPathUtil.getProjectDir() + FILE_PATH + FILE_NAME);
    }

    public String getPath() {
        return file.getPath();
    }

    public String getName() {
        return file.getName();
    }

    public String getAbsolutePath() {
        return file.getAbsolutePath();
    }

    public String getCanonicalPath() throws IOException {
        return file.getCanonicalPath();
    }

    public boolean isFile() {
        return file.isFile();
    }

    public String getInfoFileText() {
        try {
            return InfoReaderUtil.getInfoText(file);
        } catch (InfoReaderException e) {
            Log4JWrapper.error(e.getMessage());
        }
        return String.valueOf(Optional.ofNullable(file));
    }

}
