package examples.annotations;

public @interface DebugMode {
    String title() default "FOR DEBUG MODE";
    double version() default 1.0;
}
