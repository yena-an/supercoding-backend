package ClassAndObject.chapter_36;

public class InterfaceTest2 {
    public static void main(String[] args) {
        // Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB1233");

        drone.fly(); // <정보> 현재 이 사물은 날고 있습니다. => default가 사용됨
        airplane.fly(); // 비행기 IDAB1233가 납니다. => override를 해서 다른 문구가 나옴

        if (drone instanceof Drone){
            Drone drone2 = (Drone) drone;
            drone2.takePicture(); // <정보> 현재 이 사물은 공중에 있습니다. 이 드론은 사진을 찍고 있습니다.
        }
    }
}
