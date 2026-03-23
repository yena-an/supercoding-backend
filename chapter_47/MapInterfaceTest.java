package ClassAndObject.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        // Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        // Map 에 데이터 들을 넣음
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println("fruitMap: " + fruitMap); // toString 내제, fruitMap: {Apple=10, Kiwi=20, Orange=5, Banana=3}

        // Get(Key)
        Integer appleCount = fruitMap.get("Apple");
        System.out.println(appleCount); // 10

        // containsKey(Key)
        Boolean isApple = fruitMap.containsKey("Apple");
        System.out.println("Apple 있는지: " + isApple); // Apple 있는지: true

        // remove(Key)
        fruitMap.remove("Apple");
        System.out.println("fruitMap: " + fruitMap); // fruitMap: {Kiwi=20, Orange=5, Banana=3}

        // size
        System.out.println("fruitMap 사이즈: " +fruitMap.size()); // fruitMap 사이즈: 3

        // keySet()
        System.out.println("fruitMap Keys: " +fruitMap.keySet()); // fruitMap Keys: [Kiwi, Orange, Banana]

    }
}
