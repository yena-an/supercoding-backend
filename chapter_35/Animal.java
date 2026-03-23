package ClassAndObject.chapter_35;

public abstract class Animal {
    // 속성
    protected String gender;

    // 행위
    public abstract void eat (String food); // 추상 메소드는 구현 부분이 사라짐
    // 자식에서 구현해야함

    public abstract void sleep();
}
