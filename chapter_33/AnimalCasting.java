package ClassAndObject.chapter_33;

public class AnimalCasting {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(), new Person(), new Person(), new Fish(), new Bird(),
                new Person(), new Fish(), new Fish(), new Bird(), new Animal()
        };

        sleepTogether(animals);

        System.out.println("----------------------");

        doSomethingSeparately(animals);
    }

    static void sleepTogether(Animal[] animals){
        for(Animal animal: animals){
            animal.sleep();
        }
    }

    static void doSomethingSeparately(Animal[] animals){
        for (Animal animal: animals){
            if(animal instanceof Bird){
                Bird bird = new Bird(); // 고유의 행위를 하도록 다운 캐스팅
                bird.fly();
            }
            else if(animal instanceof Fish){
                Fish fish = new Fish();
                fish.swim();

            }
            else if(animal instanceof Person){
                Person person = new Person();
                person.walk();

            }
            else{
                System.out.println("동물 클래스이거나 지원하지 않는 객체입니다.");
            }
        }
    }
}

/** 동물이 잠을 자고 있습니다.

 시림이 잠을 자고 있습니다.
 시림이 잠을 자고 있습니다.
 물고기가 잠을 자고 있습니다.
 새가 잠을 자고 있습니다.
 시림이 잠을 자고 있습니다.
 물고기가 잠을 자고 있습니다.
 물고기가 잠을 자고 있습니다.
 새가 잠을 자고 있습니다.
 동물이 잠을 자고 있습니다.

 ----------------------
 동물 클래스이거나 지원하지 않는 객체입니다.
 사람이 걷고 있습니다.
 사람이 걷고 있습니다.
 물고기가 헤엄을 치고 있습니다.
 새가 날고 있습니다.
 사람이 걷고 있습니다.
 물고기가 헤엄을 치고 있습니다.
 물고기가 헤엄을 치고 있습니다.
 새가 날고 있습니다.
 동물 클래스이거나 지원하지 않는 객체입니다. **/