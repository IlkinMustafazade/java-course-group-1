package lesson28javadocandannotations.example10;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyCustomAnnotation {//Now it will be available to subclass also
}

@MyCustomAnnotation
public class Parent {
}

class ChildClass extends Parent {
}
