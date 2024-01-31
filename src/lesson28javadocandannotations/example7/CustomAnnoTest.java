package lesson28javadocandannotations.example7;

@interface MyAnnotation { //Marker annotation
}

@MyAnnotation3 //use class level
public class CustomAnnoTest {
    @MyAnnotation3 //use instance level
    int a;

    @MyAnnotation3 //use method level
    public static void main(@MyAnnotation3 String[] args) { //use parameter level
        @MyAnnotation3 //use variable level
        int x;
    }
}
