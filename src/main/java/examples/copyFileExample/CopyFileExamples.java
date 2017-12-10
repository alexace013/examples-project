package examples.copyFileExample;

import examples.com.javacodegeeks.utils.ProjectDirPathUtil;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Contract;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileExamples {

    private static final String PROJECT_DIR = ProjectDirPathUtil.getProjectDir();
    private static final String ORIGINAL_DIR = "/src/main/java/examples/copyFileExample/original/";
    private static final String ORIGINAL_FILE_NAME = "original.txt";
    private static final String COPY_DIR = "/target/copyExampleTest/";
    private static final String IO_API_FILE_NAME = "copiedWithIo.txt";
    private static final String NIO_API_FILE_NAME = "copiedWithNio.txt";
    private static final String APACHE_COMMONS_FILE_NAME = "copiedWithApacheCommons.txt";

    @Contract(pure = true)
    static String getProjectDir() {
        return PROJECT_DIR;
    }

    @Contract(pure = true)
    static String getOriginalDir() {
        return ORIGINAL_DIR;
    }

    @Contract(pure = true)
    static String getOriginalFileName() {
        return ORIGINAL_FILE_NAME;
    }

    boolean ioApiCopyExample(final File original) throws IOException {
        File copied = new File(PROJECT_DIR + COPY_DIR + IO_API_FILE_NAME);
        try (
                InputStream in = new BufferedInputStream(
                        new FileInputStream(original));
                OutputStream out = new BufferedOutputStream(
                        new FileOutputStream(copied))) {

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
        return copied.exists() && Files.readAllLines(original.toPath())
                .equals(Files.readAllLines(copied.toPath()));
    }

    boolean nio2ApiCopyExample(final File original) throws IOException {
        Path copied = Paths.get(PROJECT_DIR + COPY_DIR + NIO_API_FILE_NAME);
        Path originalPath = original.toPath();
        Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);
        return copied.toFile().exists() && Files.readAllLines(original.toPath())
                .equals(Files.readAllLines(copied.toFile().toPath()));
    }

    boolean commonsIoApiCopyExample(final File original) throws IOException {
        File copied = new File(PROJECT_DIR + COPY_DIR + APACHE_COMMONS_FILE_NAME);
        FileUtils.copyFile(original, copied);
        return copied.exists() && Files.readAllLines(original.toPath())
                .equals(Files.readAllLines(copied.toPath()));
    }

}
