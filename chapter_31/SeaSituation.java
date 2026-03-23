package ClassAndObject.chapter_31;

public class SeaSituation {

    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setLivingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild();
        fish2.setSex("Female");
        fish2.setLivingSea("서해");
        fish2.setHavingPoison(false);

        fish1.printMyInfo(); // 물고기 (sex=Male, havingPoison = false, livingSea = 동해)
        fish2.printMyInfo(); // 물고기 (sex=Female, havingPoison = false, livingSea = 서해)

        fish2.digging(); //물고기 (sex=Female, havingPoison = false, livingSea = 서해)가 모래를 파고 있습니다.
        fish2.setEatable(true); // fish1은 FishChild가 아니라서 digging과 set, get가 없음

        System.out.println(fish2.isEatable()); // true

        fish2.becomeDanger();
        System.out.println("독성여부: " + fish2.isHavingPoison()); // 독성여부: true

        fish1.eat("새우"); // 물고기 (sex=Male, havingPoison = false, livingSea = 동해) 는 새우를 먹고 있습니다.
        fish2.eat("새우"); // 물고기 (sex=Female, havingPoison = true, livingSea = 서해) 는 새우를 아주 열심히 먹고 있습니다.
    }
}
