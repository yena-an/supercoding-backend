package ClassAndObject.chapter_46;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ListGetPerformanceTest {

    static final int SIZE = 10000;

    public static void main(String[] args) {
         // List 정의
        List<Integer> integerList = new ArrayList<>();

        for (int i=0; i<SIZE; i++){
            integerList.add(i);
        }

        // LinkedList
        List<Integer> integerList2 = new LinkedList<>();

        for (int i=0; i<SIZE; i++){
            integerList2.add(i);
        }

        System.out.println(integerList);
        System.out.println(integerList2);

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        for (int i=0; i<SIZE; i++){
            integerList.get(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList get 걸린 시간: " + (endTime - startTime) + "ms"); // 사이즈가 커질수록 Linked보다 빠름
        /// //////

        startTime = System.currentTimeMillis();

        for (int i=0; i<SIZE; i++){
            integerList2.get(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("LinkedList get 걸린 시간: " + (endTime - startTime) + "ms");
    }
}
