package ClassAndObject.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cat";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("cat");
        String str4 = new String("cat");

        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true, equals는 안의 값을 비교함

        System.out.println(str3 == str1); // false
        System.out.println(str3.equals(str1)); // true
    }
}
