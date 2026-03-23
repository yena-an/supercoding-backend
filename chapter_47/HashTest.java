package ClassAndObject.chapter_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {

    public static String hashString(String input) {
        try{
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        String password = "q1w2e3r4t5";
        String hashPassword = hashString(password);

        System.out.println("패스워드 원본: " + password); // 패스워드 원본: q1w2e3r4t5
        System.out.println("패스워드 해시: " + hashPassword); // 패스워드 해시: I7XtKaHoQJ9wZE5E+uuuea5ocxjv1xnZryn4SWsBaoE=

        // Data 검색을 위한 Hash
        long hashCode = Objects.hashCode(password); // hashCode는 input의 고유한 정수값을 줌 (input의 타입과는 상관 없음)
        long hashCode2 = Objects.hashCode(new Customer("민철"));
        System.out.println("Objects HashCode: " + hashCode); // Objects HashCode: -2088475284
        System.out.println("Objects HashCode Customer: " + hashCode2); // Objects HashCode Customer: -679437325
    }
}
