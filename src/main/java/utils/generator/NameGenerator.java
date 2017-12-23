package utils.generator;

import org.junit.BeforeClass;
import utils.logger.Log4JWrapper;
import utils.projectPropertiesLoader.Property;
import utils.propertyLoader.PropertyLoaderPrototype;
import utils.reader.FileReaderUtil;

import java.util.List;
import java.util.Random;

public final class NameGenerator implements IGenerator<String> {

    private static final PropertyLoaderPrototype NAME_GENERATOR_PROPERTY = new PropertyLoaderPrototype(Property.NAME.getProperty());
    private static final String USER_DIR = System.getProperty("user.dir");
    private static final String FILE_PATH = NAME_GENERATOR_PROPERTY.getParamAsString("file.path");
    private static final String FILE_NAME = NAME_GENERATOR_PROPERTY.getParamAsString("file.name");

    @BeforeClass
    public static void setUp() {
        Log4JWrapper.debug(String.format("user dir: %s", USER_DIR));
        Log4JWrapper.debug(String.format("file path: %s", FILE_PATH));
        Log4JWrapper.debug(String.format("file name: %s", FILE_NAME));
    }

    @Override
    public String generate() {
        final int randomIndex = new Random().nextInt(FileReaderUtil.readFile(USER_DIR + FILE_PATH, FILE_NAME).size());
        return generateList().get(randomIndex).split(" ")[0].trim();
    }

    @Override
    public List<String> generateList() {
        return FileReaderUtil.readFile(USER_DIR + FILE_PATH, FILE_NAME);
    }

}
