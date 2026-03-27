package ClassAndObject.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRemovePerformanceTest {
    static final int SIZE = 100000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        // List 정의
        List<Integer> integerList = new ArrayList<>();

        for (int i=0; i<SIZE; i++){
            integerList.add(i);
            if ( i % 5 == 0)integerList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList 삽입/삭제: " + (endTime - startTime) + "ms");

        // LinkedList
        List<Integer> integerList2 = new LinkedList<>();

        startTime = System.currentTimeMillis();


        for (int i=0; i<SIZE; i++){
            integerList2.add(i);
            if ( i % 5 == 0)integerList2.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList 삽입/삭제: " + (endTime - startTime) + "ms"); // 사이즈가 커질 수록 Array보다 빠름
    }
}
