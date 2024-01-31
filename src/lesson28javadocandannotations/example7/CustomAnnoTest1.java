package lesson28javadocandannotations.example7;

@interface MyAnnotation1 { //Single value annotation
    String name();
}


@MyAnnotation1(name = "Ilkin") //use class level
public class CustomAnnoTest1 {
    @MyAnnotation1(name = "Ilkin") //use instance level
    int a;

    @MyAnnotation1(name = "Ilkin") //use method level
    public static void main(@MyAnnotation1(name = "Ilkin") String[] args) { //use parameter level
        @MyAnnotation1(name = "Ilkin") //use variable level
        int x;
    }
}
