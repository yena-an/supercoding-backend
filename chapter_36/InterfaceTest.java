package ClassAndObject.chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {
        // 속성
        System.out.println(Flyable.atmosphereLimit); // static final으로 자동으로 적용됨, 476

        // Flyable
        Flyable bird = new Bird(); // 타입으로 명시 가능 (flyable, animal, bird 가능)
        Flyable airplane = new Airplane("AB1122");

        bird.fly(); // 새가 날고 있습니다.
        // bird.eat(); => 불가능, flyable로 선언 되었기 때문
        airplane.fly(); // 비행기 IDAB1122가 납니다.

        // Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("나영석");
        Walkable robot = new Robot("RB1233");

        person.walk(); // 사람이 걷고 있습니다.
        robot.walk(); // 로봇 IDRB1233가 걷고 있습니다.

        // 다운 캐스팅
        if (robot instanceof Robot){
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2); // 로봇이 인간 나영석을 돕습니다.
        }

    }
}
