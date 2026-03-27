package ClassAndObject.chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        //CharArray -> String으로 바꾸기
        char[] chars = {'a', 'b', 'c'};

        //
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1); //abc
        System.out.println(str2); //abc

        //Str -> Chararray
        char[] chars2 = str1.toCharArray();
        for(char ch:chars2){
            System.out.println(ch);
        }
        System.out.println(str1.charAt(0)); // a
        System.out.println(str1.charAt(1)); // b
        System.out.println(str1.charAt(2)); // c
        System.out.println(str1.charAt(3)); // error
    }
}
