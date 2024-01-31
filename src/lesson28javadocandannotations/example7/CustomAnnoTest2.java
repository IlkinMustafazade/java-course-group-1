package lesson28javadocandannotations.example7;

@interface MyAnnotation2 { //Multi value annotation
    String name();
    String project();
    String date();
    float version();
}


@MyAnnotation2(name = "Ilkin",project = "Bank",date = "1/1/2020",version = 11)
public class CustomAnnoTest2 {
    @MyAnnotation2(name = "Ilkin",project = "Bank",date = "1/1/2020",version = 11)
    int a;

    @MyAnnotation2(name = "Ilkin",project = "Bank",date = "1/1/2020",version = 11)
    public static void main(@MyAnnotation2(name = "Ilkin",project = "Bank",date = "1/1/2020",version = 11) String[] args) {
        @MyAnnotation2(name = "Ilkin",project = "Bank",date = "1/1/2020",version = 11)
        int x;
    }
}
