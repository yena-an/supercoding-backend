package ClassAndObject.chapter_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        // Set 구현
        Set<String> fruitSet = new HashSet<>();

        // Add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println("fruitSet: " + fruitSet);
        // fruitSet: [Apple, Mango, Orange], 네번째가 apple일 때: 중복 안 됨
        // fruitSet: [Apple, Grape, Mango, Orange], 순서대로 아님

        // add 중복 Add
        List<String> fruitList = new ArrayList<>();

        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Grape");
        fruitList.add("Apple");

        System.out.println("fruitList: " + fruitList); // fruitList: [Orange, Apple, Mango, Grape, Apple]

        // remove(set)
        fruitSet.remove("Apple");
        System.out.println("fruitSet: " + fruitSet); // fruitSet: [Grape, Mango, Orange]

        // container
        System.out.println("Mango 있는지: " + fruitSet.contains("Mango")); // Apple 있는지: true

        // size, isEmpty,clear
        System.out.println("사이즈: " + fruitSet.size()); // 사이즈: 3

        fruitSet.clear();
        System.out.println("Set이 비어있는지: " + fruitSet.isEmpty()); // Set이 비어있는지: true
    }
}
