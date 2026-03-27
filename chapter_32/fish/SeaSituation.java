package ClassAndObject.chapter_32.fish;

public class SeaSituation {
    public static void main(String[] args) {
//        //자식
//        FishChild fishChild = new FishChild();
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLivingSea("동해");
//
//        fishChild.printMyInfo(); /** 부모 물고기가 생성되고 있습니다.
//        자식 물고기가 만들어집니다.
//         물고기 (sex=Male, havingPoison = false, livingSea = 동해) **/
//
//        // 생성자 오버로딩
//        FishChild fishChild2 = new FishChild("Female", true, "서해");
//        fishChild2.printMyInfo(); // 물고기 (sex=Female, havingPoison = false, livingSea = 서해)
//
//        // 자식 물고기 생성
//        FishChild fishChild3 = new FishChild(true,"서해");
//        fishChild3.printMyInfo(); // 물고기 (sex=null, havingPoison = false, livingSea = null)-> 메소드와 다르게 override가 안 됨
//        // 부모 클래스의 livingSea가 서해로 설정되려면 this가 아니라 super로 접근
//        // 물고기 (sex=null, havingPoison = false, livingSea = 서해)
//
//        FishChild fishChild4 = new FishChild();
//        fishChild4.setLivingSea("동해");
//        fishChild4.setLivingSeaChild("서해");
//
//        fishChild4.printSea(); //물고기 (sex=null, havingPoison = false, livingSea = 동해)는 서해 바다 출신이고, 부모 물고기는 동해 바다 출신이야.
//        // 물고기 (sex=null, havingPoison = false, livingSea = 동해)는 부모 물고기, 자식 물고기(eatable = false, livingSea = 서해)는 서해 바다 출신이고, 부모 물고기는 동해 바다 출신이야.

        // 핵심 타입 s
        // 타입선언: 부모, 인스턴스화: 부모 -> 부모 클래스의 eat
        // 타입선언: 부모, 인스턴스화: 자식 -> 자식 클래스의 eat (중요)
        // 타입선언: 자식, 인스턴스화: 자식 -> 자식 클래스의 eat
        // 타입선언: 자식, 인스턴스화: 부모 -> 묵시적 변화 안 됨

        Fish fish1 = new Fish();
        fish1.eat("새우"); // 물고기 (sex=null, havingPoison = false, livingSea = null) 는 새우를 먹고 있습니다.

        Fish fish2 = new FishChild();
        fish2.eat("새우"); // 물고기 (sex=null, havingPoison = false, livingSea = null)는 부모 물고기, 자식 물고기(eatable = false, livingSea = null) 는 새우를 아주 열심히 먹고 있습니다.

        FishChild fish3 = new FishChild();
        fish3.eat("새우"); // 물고기 (sex=null, havingPoison = false, livingSea = null)는 부모 물고기, 자식 물고기(eatable = false, livingSea = null) 는 새우를 아주 열심히 먹고 있습니다.

//        FishChild fish4 = new Fish(); //
//        fish4.eat("새우");
    }
}
