package lesson28javadocandannotations.example2;

public class DeprecatedTest {
    /**
     * @deprecated This method is deprecated and has been replaced by newMethod()
     */
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    public static void main(String[] args) {
        DeprecatedTest deprecatedTest = new DeprecatedTest();
        deprecatedTest.deprecatedMethod();
    }
}
