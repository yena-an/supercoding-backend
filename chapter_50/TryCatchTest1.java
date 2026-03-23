package ClassAndObject.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("메인 메소드가 시작합니다."); // 메인 메소드가 시작합니다.

        try{
            int i = 0;
            int data = 50 / i; // 10

            System.out.println("data: " + data);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("0으로는 나눌 수가 없습니다."); // 0으로는 나눌 수가 없습니다.
            System.out.println("data: " + 0); // data: 0
        }

//        int i = 5; // i가 0이 돼서 data를 0으로 나누면 ArithmeticException이 뜸
//        int data = 50 / i; // 10
//
//        System.out.println("data: " + data);

        System.out.println("메인 메소드가 종료합니다.");
    }
}
