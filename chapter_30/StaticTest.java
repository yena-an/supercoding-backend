package ClassAndObject.chapter_30;

public class StaticTest {
    public static void main(String[] args){
        // 클래스 변수: static 변수 클래스에서 호출
        int num = Student.getSerialNum();
        String city = Student.city;

        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Talyor", "Female");
        Student student4 = new Student("Mike", "Male");

        Student.setSerialNum(10);

        student1.printMyInfo(); // studentID: 1
        student2.printMyInfo(); // studentID: 2
        student3.printMyInfo(); // studentID: 3
        student4.printMyInfo(); // studentID: 4

        System.out.println(num); // 1
        System.out.println(city); // Seoul
    }
}
