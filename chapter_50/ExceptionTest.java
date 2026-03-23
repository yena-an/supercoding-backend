package ClassAndObject.chapter_50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작합니다."); // 메인 메소드가 시작합니다.
        makeUncheckException(); // 값: 2
        makeCheckedException();
        System.out.println("메인 메소드가 종료합니다."); // 메인 메소드가 종료합니다.
    }

    public static void makeUncheckException(){
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 1; // index가 10이 넘어가면 unchecked exception

        System.out.println("값: " + intArr[index]);
    }

    public static void makeCheckedException() throws FileNotFoundException {
        File file = new File("ClassAndObject/chapter_50/test.txt");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("FS 실행합니다.");
    }
}
