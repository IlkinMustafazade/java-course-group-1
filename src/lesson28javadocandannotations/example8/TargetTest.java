package lesson28javadocandannotations.example8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface TestAnnotation{
    String project();
}

//@TestAnnotation(project = "Bank") // compile error
public class TargetTest {
    @TestAnnotation(project = "Bank") // compile error
    public static void main(String[] args) {

    }
}
