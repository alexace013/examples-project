package utils.annotations;

import utils.propertyLoader.PropertyLoaderPrototype;

import java.lang.annotation.Annotation;
import java.util.Optional;

public class AnnotationReader {

    public static String getAnnotationOnly4TestMessageText(Class clazz) {
        Class<PropertyLoaderPrototype> obj = clazz;
        if (obj.isAnnotationPresent(Only4Test.class)) {
            Annotation annotation = obj.getAnnotation(Only4Test.class);
            Only4Test only4Test = (Only4Test) annotation;
            return new StringBuilder()
                    .append(only4Test.text())
                    .append(only4Test.version())
                    .toString();
        }
        return Optional.empty().toString();
    }

}
