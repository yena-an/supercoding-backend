package ClassAndObject.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args) {

        System.out.println("메인 메소드가 시작합니다.");

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("I");
        stringList.add("Love");
        stringList.add(null); // -> add는 가능하지만, toUpperCase에서 NullPointerException이 발생
        stringList.add("Coding");

        for (int i = 0; i <stringList.size() + 5; i++){
            try{
                System.out.println("i: " + i);
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            }catch (NullPointerException e){
                System.out.println("null은 들어갈 수 없습니다.");
            }catch (IndexOutOfBoundsException e){
                System.out.println("Index는 Array Bound를 넘을 수 없습니다.");
                break;
            }

        }

        System.out.println("메인 메소드가 종료합니다.");
        /** i: 0
         HELLO
         i: 1
         WORLD
         i: 2
         I
         i: 3
         LOVE
         i: 4
         null은 들어갈 수 없습니다.
         i: 5
         CODING
         i: 6
         Index는 Array Bound를 넘을 수 없습니다.
         메인 메소드가 종료합니다.**/
    }
}
