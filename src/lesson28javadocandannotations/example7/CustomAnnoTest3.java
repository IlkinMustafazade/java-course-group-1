package lesson28javadocandannotations.example7;

@interface MyAnnotation3 { //Multi value annotation
    String name() default "Ilkin";

    String project() default "Bank";

    String date() default "1/1/2020";

    float version() default 11;
}


@MyAnnotation3()
public class CustomAnnoTest3 {
    @MyAnnotation3()
    int a;

    @MyAnnotation3()
    public static void main(@MyAnnotation3() String[] args) {
        @MyAnnotation3()
        int x;
    }
}

