package lesson28javadocandannotations.example9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
    String name();
}

@TestAnnotation(name = "Ilkin")
public class RetentionTest {
}
