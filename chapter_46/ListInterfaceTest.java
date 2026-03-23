package ClassAndObject.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println("FruitList 요소:" + fruitList); // FruitList 요소:[Orange, Apple, Banana, Kiwi], 순서대로
        // array는 toString이 내부적으로 포함되어 있음

        // add(index, element)
        fruitList.add(3, "Mango");
        System.out.println("FruitList 요소:" + fruitList); // FruitList 요소:[Orange, Apple, Banana, Mango, Kiwi]

        // remove(index)
        fruitList.remove(3);
        System.out.println("FruitList 요소:" + fruitList); // FruitList 요소:[Orange, Apple, Banana, Kiwi]

        // get(Index)
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은:" + myFruit); // 가져온 과일은:Kiwi

        // set(Index, element)
        fruitList.set(1, "Pineapple");
        System.out.println("FruitList 요소:" + fruitList); // FruitList 요소:[Orange, Pineapple, Banana, Kiwi]

        // size
        System.out.println("리스트 사이즈:" + fruitList.size()); // 리스트 사이즈:4

        // isEmpty
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList.isEmpty()); // false
        System.out.println(fruitList2.isEmpty()); // true

        // contains
        System.out.println(fruitList.contains("Kiwi")); // true
        System.out.println(fruitList.contains("Apple")); // false

        // indexOf, clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2)); // 0

        fruitList.clear();
        System.out.println("FruitList 요소:" + fruitList); // FruitList 요소:[]
    }
}

