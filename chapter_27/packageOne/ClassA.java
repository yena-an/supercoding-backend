package ClassAndObject.chapter_27.packageOne;

public class ClassA {
    // Public
    public String publicStr;

    // Private
    private String privateStr;

    // default
    String defaultStr;

    public void methodPublic(){};
    private void methodPrivate(){};
    void methodDefault(){};

    void testPrivate(){
        String str = privateStr;
        methodPrivate();
    } // Private은 같은 파일 안에서 가능
}
