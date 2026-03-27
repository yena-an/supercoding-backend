package ClassAndObject.chapter_45;

public class WrapperClassTest {
    public static void main(String[] args) {
        // Integer
        Integer integer1 = new Integer(20); // int -> Integer 박싱, 요즘에는 잘 안 쓰는 문법
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue(); // Unboxing, Integer -> int

        Integer integer3 = 20; // AutoBoxing
        int int2 = integer3; //AutoUnboxing

        System.out.println(integer1);
        System.out.println(int1);
        System.out.println(integer3);
        System.out.println(int2);

        // 연산자
        System.out.println(integer1 + integer2);
        System.out.println(integer1 + int1);

        // Character
        Character character = new Character('X');
        char ch1 = character.charValue();

        Character character1 = 'x';
        char ch2 = character1;

        System.out.println(character);
        System.out.println(ch1);

        Character[] characters = {'a', 'b', 'c'}; // array도 오토 박싱이 가능
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        System.out.println(str); // [Ljava.lang.Character;@5594a1b5,
        System.out.println(str2); // abc

        // Boolean
        Boolean boolean1 = new Boolean(true);
        boolean b1 = boolean1.booleanValue();

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2); // false
        System.out.println(boolean1 | boolean2); // true

        if (b1){

        }
        if (boolean1){
            //
        }
    }
}
