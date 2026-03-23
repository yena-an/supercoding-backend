package ClassAndObject.chapter_27.packageTwo;

import ClassAndObject.chapter_27.packageOne.ClassA;

public class ClassB {
    public void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    } // Public은 모두 가능

//    void testPrivate(ClassA classA){
//        String str= classA.privateStr;
//        classA.methodPrivate(); //-> 같은 파일이 아니라서 불가능
//    }
//
//    public void testDefault(ClassA classA){
//        String str = classA.defaultStr;
//        classA.methodDefault();
//    } // 같은 파일이나, 패키지가 아니라서 불가능
}
