package ClassAndObject.chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        // +=
        String str = "";

        long startTime = System.currentTimeMillis();

        for(int i=0; i < 500; i++) {
            str += "Cat";
        }

        System.out.println(str);

        long endTime = System.currentTimeMillis();
        System.out.println("String 걸린 시간: " + (endTime - startTime) + "ms"); // 걸린 시간 재기 -> 21ms

        ///////////////////////////
        StringBuilder sb = new StringBuilder();

        long startTime2 = System.currentTimeMillis();

        for(int i=0; i < 500; i++) {
            sb.append("Cat");
        }

        String output = sb.toString();
        System.out.println(output);

        long endTime2 = System.currentTimeMillis();
        System.out.println("SB 걸린 시간: " + (endTime2 - startTime2) + "ms"); // 걸린 시간 재기 -> 1ms
    }
}
