package ClassAndObject.chapter_28;

public class ThisTest {
    public static void main(String[] args) {
        Person person1 = new Person("강철중");
        Person person2 = new Person("이민호", "Male");
        Person person3 = new Person("아이유", "Female", 30);

        person1.showMyself(); //Person 인스턴스: name: 강철중, gender: unknown, age: -1
        person2.showMyself(); //Person 인스턴스: name: 이민호, gender: Male, age: -1
        person3.showMyself(); //Person 인스턴스: name: 아이유, gender: Female, age: 30

        Person person11 = person1.returnMySelf();
        Person person22 = person2.returnMySelf();

        System.out.println(person11); //ClassAndObject.chapter_28.Person@12843fce -> Person 클래스의 heap 메모리 주소
        System.out.println(person22); //ClassAndObject.chapter_28.Person@3dd3bcd
    }
}
