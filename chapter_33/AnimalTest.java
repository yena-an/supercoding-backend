package ClassAndObject.chapter_33;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();

        feed(animal, "빼빼로"); // 동물이 빼빼로을 먹습니다.
        feed(animal2, "벌레"); // 새가 벌레을 부리로 쪼아 먹고 있습니다. => 인스턴스: 버드
        feed(animal3, "모이"); // 물고기가 모이을 주둥이로 먹습니다. => 인스턴스: 물고기
    }

    public static void feed(Animal animal, String food){
        animal.eat(food);
    }
}
