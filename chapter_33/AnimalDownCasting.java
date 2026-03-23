package ClassAndObject.chapter_33;

public class AnimalDownCasting {
    public static void main(String[] args) {
        // 다운 캐스팅 확인여부

        Animal animal = new Bird();
//        Bird bird = (Bird) animal; // 다운 캐스팅
        checkBirdAndFly(animal); // 새가 날고 있습니다.

        Animal animal2 = new Animal();
//        Bird bird2 = (Bird) animal2; // 다운 캐스팅 안 됨 => 자신의 타입으로만 가능 (런타임 에러)
        checkBirdAndFly(animal2); // 너는 새가 아니야.

        Animal animal3 = new Person();
//        Bird bird3 = (Bird) animal3; // 다운 캐스팅 안 됨 => 자신의 타입으로만 가능 (런타임 에러)
        checkBirdAndFly(animal3); // 너는 새가 아니야.
    }

    static void checkBirdAndFly(Animal animal){
        if( animal instanceof Bird ){
            Bird bird = (Bird) animal;
            bird.fly();
        }
        else{
            System.out.println("너는 새가 아니야.");
        }
    }
}
