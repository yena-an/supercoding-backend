package ClassAndObject.chapter_27.packageOne;

public class ClassAA {
    void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    } // Public은 모두 가능

//    void testPrivate(ClassA classA){
//        String str= classA.privateStr;
//        classA.methodPrivate();
//    } //-> 같은 파일이 아니라서 불가능

    public void testDefault(ClassA classA){
        String str = classA.defaultStr;
        classA.methodDefault();
    } // 같은 패키지라서 가능
}
