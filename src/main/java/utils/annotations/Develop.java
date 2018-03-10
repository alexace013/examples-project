package utils.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Develop {

    String author() default "dev";
    String status() default "develop";

}
